package dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import modelo.Farmacia;
import modelo.Medicamento;

public class FarmaciaDOM {

	public boolean leer(Path farmaciaXML) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("farmacia.xml"));
			document.getDocumentElement().normalize();

			NodeList medicamentos = document.getElementsByTagName("medicamento");
			for (int i = 0; i < medicamentos.getLength(); i++) {
				Node medi = medicamentos.item(i); 
				if (medi.getNodeType() == Node.ELEMENT_NODE) {
					Element elemento = (Element) medi;
					System.out.println("Codigo: " + getNodo("cod", elemento));
					System.out.println("Nombre Medicamento: " + getNodo("nombre", elemento));
					System.out.println("Precio: " + getNodo("precio", elemento));
					System.out.println("Stock: " + getNodo("stock", elemento));
					System.out.println("Stock Maximo: " + getNodo("stock-maximo", elemento));
					System.out.println("Stock Minimo: " + getNodo("stock-minimo", elemento));
				}
			}

		} catch (ParserConfigurationException | SAXException | IOException e) {

			System.err.println("error al leer el archivo XML");
			return false;
		}
		return true;
	}

	public static String getNodo(String etiqueta, Element elem) {
		NodeList nodo = elem.getElementsByTagName(etiqueta)
				.item(0).getChildNodes();
		return nodo.item(0).getNodeValue();
	}
	public boolean guardar(Farmacia farmacia) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation implementation = builder.getDOMImplementation();
			Document document = implementation.createDocument(null, "farmacia", null);
			document.setXmlVersion("1.0");
			ArrayList<Medicamento> list = (ArrayList<Medicamento>) farmacia.leerTodos();
			for (Medicamento med : list) {
				Element raiz = document.createElement("medicamento");
				document.getDocumentElement().appendChild(raiz);
				crearElemento(med, raiz, document);
			}
			Source source = new DOMSource(document);
			Result result = new StreamResult(new java.io.File("Farmacia.xml"));
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
			transformer.transform(source, result);
			return true;

		} catch (ParserConfigurationException | TransformerException | TransformerFactoryConfigurationError e) {
			System.err.println("Error al parsear-+ XML: " + e.getLocalizedMessage());
		}
		return false;

	}

	public static void crearElemento(Medicamento medicamento, Element raiz, Document document) {
		Element elementoCodigo = document.createElement("cod");
		Text textoCodigo = document.createTextNode(String.valueOf(medicamento.getCod()));
		raiz.appendChild(elementoCodigo);
		elementoCodigo.appendChild(textoCodigo);

		Element elementoNombre = document.createElement("nombre");
		// debemos quitar los char null que crea el StringBuilder al crear un String de
		// 30 de longitud
		Text textoNombre = document.createTextNode(medicamento.getNombre().replace("\u0000", ""));
		raiz.appendChild(elementoNombre);
		elementoNombre.appendChild(textoNombre);

		Element elementoPrecio = document.createElement("precio");
		Text textoPrecio = document.createTextNode(String.valueOf(medicamento.getPrecio()));
		raiz.appendChild(elementoPrecio);
		elementoPrecio.appendChild(textoPrecio);

		Element elementoStock = document.createElement("stock");
		Text textoStock = document.createTextNode(String.valueOf(medicamento.getStock()));
		elementoStock.appendChild(textoStock);
		raiz.appendChild(elementoStock);

		Element elementoStockMinimo = document.createElement("stock-minimo");
		Text textoStockMinimo = document.createTextNode(String.valueOf(medicamento.getStockMinimo()));
		raiz.appendChild(elementoStockMinimo);
		elementoStockMinimo.appendChild(textoStockMinimo);

		Element elementoStockMaximo = document.createElement("stock-maximo");
		Text textoStockMaximo = document.createTextNode(String.valueOf(medicamento.getStockMaximo()));
		raiz.appendChild(elementoStockMaximo);
		elementoStockMaximo.appendChild(textoStockMaximo);

		Element elementoCodProv = document.createElement("codProveedor");
		Text textoCodProv = document.createTextNode(String.valueOf(medicamento.getCodProveedor()));
		raiz.appendChild(elementoCodProv);
		elementoCodProv.appendChild(textoCodProv);

	}

}