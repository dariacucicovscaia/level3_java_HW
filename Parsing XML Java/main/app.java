package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class app {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		Document doc = document(new File("src/resources/ABC.xml"));
		Node root = doc.getFirstChild();
		//System.out.println(root.getNodeName() + "\n");

		NodeList rootChildList = root.getChildNodes();
		// System.out.println(getIntoNode(rootChildList).get(0).getNodeName());
		NodeList ndl = (NodeList) getIntoNode(rootChildList).get(0);

		for (int i = 0; i < getIntoNode(ndl).size(); i++) {
			if (getIntoNode(ndl).get(i).getTextContent().equals("A")) {
				System.out.println(
						getIntoNode(ndl).get(i).getNodeName() + " - " + getIntoNode(ndl).get(i).getTextContent());
			}

		}

	}

	private static Document document(File file) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = builder.parse(file);
		doc.getDocumentElement().normalize();

		return doc;
	}

	static ArrayList<Node> getIntoNode(NodeList ndl) {
		ArrayList<Node> children = new ArrayList<Node>();
		for (int i = 0; i < ndl.getLength(); i++) {

			if (ndl.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}

			children.add(ndl.item(i));
		}

		return children;
	}

}
