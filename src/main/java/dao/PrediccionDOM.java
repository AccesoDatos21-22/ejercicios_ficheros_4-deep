package dao;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class PrediccionDOM {
    public boolean leer(String ruta){
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder= factory.newDocumentBuilder();
            Document document=builder.parse(new File(ruta));
            document.getDocumentElement().normalize();
            NodeList dias=document.getElementsByTagName("forecast");
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
