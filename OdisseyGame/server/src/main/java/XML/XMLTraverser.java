package XML;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLTraverser {

	private Element root;

	public XMLTraverser(Element root) {
		this.root = root;
	}

	public List<Node> getChildren() {
		return getChildren(root);
	}

	public List<Node> getChildren(Node parent) {

		Stream<Node> stream = null;
		NodeList children = parent.getChildNodes();
		
		Stream<Node> stream1 = childrenToStream(parent)
				.filter(Child -> Child.getNodeType() != Node.TEXT_NODE );
		
		Node child = children.item((int) stream1.count());
		stream = childrenToStream(child)
				.filter(Child -> Child.getNodeType() != Node.TEXT_NODE );

		return stream.collect(Collectors.toList());

	}
	
	public Stream<Node> childrenToStream(Node parent) {
		return IntStream
				.range(0, parent.getChildNodes().getLength())
				.mapToObj(parent.getChildNodes()::item);
	}
	
	
}