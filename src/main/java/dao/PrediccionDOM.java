package dao;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class PrediccionDOM {
    public static final String ruta="src/tiempo.xml";
    public boolean leer(String ruta){
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document document=builder.parse(ruta);
            DocumentTraversal trav= (DocumentTraversal) document;
            MyFilter filter=new MyFilter();
            NodeIterator it=trav.createNodeIterator(document.getDocumentElement(),NodeFilter.SHOW_ELEMENT,filter,true);
            for (Node node=it.nextNode();node!=null;node=it.nextNode()){
                NodeList lista= node.getChildNodes();
                String dia=node.getAttributes().getNamedItem("day").getNodeValue();
                String text=node.getTextContent().trim().replaceAll("\\s+"," ");
                for (int i = 0; i < lista.getLength(); i++) {
                    
                }
                System.out.printf("%s: %s%n",dia,text);
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return false;
    }
    static class MyFilter implements NodeFilter {
        @Override
        public short acceptNode(Node thisNode){
            if (thisNode.getNodeType()==Node.ELEMENT_NODE){
                Element e= (Element) thisNode;
                String nodeName= e.getNodeName();
                if ("time".equals(nodeName)){
                    return NodeFilter.FILTER_ACCEPT;
                }
            }
            return  NodeFilter.FILTER_REJECT;
        }
    }
}
