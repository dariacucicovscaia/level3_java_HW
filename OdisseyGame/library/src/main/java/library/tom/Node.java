package library.tom;

import java.util.ArrayList;
import java.util.List;

public class Node {

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
		String tree = null;

		tree = start.getChildren() + "\n";
		for (Node it : start.children) {
			tree += "- " + it.getChildren() + "\n";
			for (Node o : it.children) {
				tree += "--- " + o.getChildren() + "\n";
			}
		}

		return tree;
	}

}
