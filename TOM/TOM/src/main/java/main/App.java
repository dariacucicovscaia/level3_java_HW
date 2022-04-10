package main;


import tom.Node;

public class App {

	public static void main(String[] args) {
		Node node = new Node();
		
		Node root = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);
		Node eight = new Node(8);
		Node nine = new Node(9);
		
		root.appendChild(two);
		root.appendChild(three);
		
		two.appendChild(four);
		two.appendChild(five);
		two.appendChild(six);
		
		two.removeChild(six);

		three.appendChild(seven);
		three.appendChild(eight);
		three.appendChild(nine);
		
		three.swapChild(seven, nine);
		three.swapChild(nine, seven);
		
		System.out.println(node.walkTheTree(root));
		
		
		
		//System.out.println(node.depth(root));
		
		
		//write a "symbolic" path from the root to the 9th node
		//which will print it's value in the console
		//System.out.println(root.getChild(1).getChild(2).getData()); //output 9
		
	}

}

/*
        *why is the node 1 called ROOT ?
			it is the top element of the tree
		*what is the 2nd node to the ROOT?
			the second node is a child to the root
		*what is the 2nd node to the node 4,5 and 6 ?
			the second node is a parent to the node 4, 5 and 6
		*what is the depth of this tree?
		    3 - we have 3 layers root(layer1) 2,3(layer 2) 4, ... ,9(layer 3) 
		    so the depth of 4,... , 9 is --3
 */
