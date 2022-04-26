package server.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import XML.XMLLoader;
import XML.XMLTraverser;

public class CLIApplication {

	public static void main(String[] args)
			throws IOException, ClassNotFoundException, ParserConfigurationException, SAXException {

		Element root = new XMLLoader().load("src/main/resources/tom.xml");
		System.out.println(root.getNodeName());
		// System.out.println(new XMLTraverser().getIntoNode(root.));
		XMLTraverser xmlt = new XMLTraverser(root);
		List<Node> children = xmlt.getChildren();
//				xmlt.getChildren()  // default root
//				.get(0));           // space
		

		children.stream().forEach(System.out::println);
	}

}
