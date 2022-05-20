package library.tom;

import org.xml.sax.SAXException;
import server.xml.XMLLoader;
import server.xml.XMLTraverser;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;


public class Node {
	public XMLTraverser getXmltrav() {
		return xmltrav;
	}

	public void setXmltrav(XMLTraverser xmltrav) {
		this.xmltrav = xmltrav;
	}

	private XMLTraverser xmltrav;
	public XMLTraverser xmlt(String id) throws ParserConfigurationException, IOException, SAXException {
		setXmltrav(new XMLTraverser(new XMLLoader().load("SpaceOdissey/server/src/main/resources/"+ id +".xml")));
		return xmltrav;
	}

	private List<Node> children;

	public Node() {
		children = new ArrayList<Node>();
	}

	public List<Node> getChildren() {
		return children;
	}

	public void prependChild(Node child) {
		children.add(0, child);
	}

	public void appendChild(Node child) {
		children.add(children.size(), child);
	}

	public void insertChild(int index, Node child) {
		children.add(index, child);
	}

	public void removeChild(Node child) {
		children.remove(child);
	}

	public void removeChild(int index) {
		children.remove(index);
	}

	public void swapChild(Node oldChild, Node newChild) {
		children.set(children.lastIndexOf(oldChild), newChild);
	}

	public Node getChild(int index) {
		return children.get(index);
	}

	public Node getFirstChild() {
		return children.get(0);
	}

	public Node getLastChild() {
		return children.get(children.size() - 1);
	}

	public int depth(Node start) {

		int maxdepth = 0;
		for (Node it : start.children) {
			maxdepth = Math.max(maxdepth, depth(it));
		}

		return maxdepth + 1;

	}

	public String walkTheTree(Node start) {
		String tree = start + " \n";
		for (Node it : start.children) {
			tree += "- " + it + "\n";
			for (Node o : it.children) {
				tree += "--- " + o + "\n";
			}

		}
		return tree;
	}

	@Override
	public String toString() {
		
		String childrenString = "";
		for (Node node:children) {
			childrenString += node + "\n";
		}
		return this.getClass().getName()+":\n" + childrenString + " ";
	}
	
	
	

}
