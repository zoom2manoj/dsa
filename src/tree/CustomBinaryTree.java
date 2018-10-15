package tree;

import java.util.LinkedList;
import java.util.Queue;


public class CustomBinaryTree {

	
	public class Node {
		
		int value;
		Node left;
		Node right;
		
		Node(int value){
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
	
	
	static Node root = null; 
	
	public static void main(String[] args) {
		CustomBinaryTree obj = new CustomBinaryTree();
		System.out.println("Custom binary tree example");
		root = obj.addRecursive(root, 100);
		root = obj.addRecursive(root, 112);
		root = obj.addRecursive(root, 80);
		root = obj.addRecursive(root, 60);
		root = obj.addRecursive(root, 150);
		root = obj.addRecursive(root, 75);
		root = obj.addRecursive(root, 20);
		
		System.out.println("items added in binary tree successfully");
		System.out.println("Item finding in binary tree");
		int tempItem  = 75;
		boolean findFlage= obj.findItem(root, tempItem);
		System.out.println(tempItem+" existance "+findFlage);
		
		System.out.println("Item deletion in binary tree");
		
		obj.deleteItem(root, tempItem);
		System.out.println(tempItem+ " delete successfully");
		
		System.out.println("\nTraverse the binary search (Depth first search)");
		System.out.println("in order traversing:");
		obj.traverseInOrder(root);
		
		System.out.println("\npre order traversing:");
		obj.traversePreOrder(root);

		
		System.out.println("\nPost order traversing:");
		obj.traversePostOrder(root);
		
		
		System.out.println("\nTraverse the binary search(Breadth first search):");
		obj.traverseBreadthSearch(root);

	}
	
	
	private void traverseBreadthSearch(Node current) {
		// TODO Auto-generated method stub
		
		if (current==null) {
			return; 
		}
		
		Queue<Node> nodes = new LinkedList<Node>();
		nodes.add(current);
		
		
		while (!nodes.isEmpty()) {
			
			Node node = nodes.remove();
			System.out.print(" "+node.value);
			if (node.left!=null) {
				nodes.add(node.left);	
			}
			if (node.right!=null) {
				
				nodes.add(node.right);}
						
			
		}
	}


	private void traverseInOrder(Node current) {
		// TODO Auto-generated method stub
		
		if (current!=null) {
			traverseInOrder(current.left);
			System.out.print(" "+current.value);
			traverseInOrder(current.right);
		}
		
	}

	private void traversePreOrder(Node current) {
		// TODO Auto-generated method stub
		
		if (current!=null) {
			System.out.print(" "+current.value);
			traversePreOrder(current.left);			
			traversePreOrder(current.right);
		}
		
	}
	
	private void traversePostOrder(Node current) {
		// TODO Auto-generated method stub
		
		if (current!=null) {
			traversePostOrder(current.left);			
			traversePostOrder(current.right);
			System.out.print(" "+current.value);
		}
		
	}

	// deletion in binary tree
	private Node deleteItem(Node current, int value) {
		// TODO Auto-generated method stub
		if(current==null) {
			return null;
		}
		
		if (current.value == value) {
			if (current.left == null && current.right == null) {
			    return null;
			}
			
			if (current.right == null) {
			    return current.left;
			}
			 
			if (current.left == null) {
			    return current.right;
			}
			
			
			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteItem(current.right, smallestValue);
			return current;
		}
		
		if (current.value>value) {
			current.left = deleteItem(current.left, value);
			return current;
		}
		
		current.right= deleteItem(current.right, value);
			
		return current;
	}

	private int findSmallestValue(Node root) {
	    return root.left == null ? root.value : findSmallestValue(root.left);
	}



	// Find item in binary tree
	private boolean findItem(Node current, int value) {
		// TODO Auto-generated method stub
		if (current==null) {
			return false;
		}
		
		if (current.value== value) {
			return true;
		}else {
			return current.value>value ?findItem(current.left, value):findItem(current.right, value);
		}
		
		
		
		
	}




	// add new items in binary tree
	public Node addRecursive(Node current, int value) {
				
		if(current==null) {
			return new Node(value);
		}		
		
		if (current.value>value) {
			current.left = addRecursive(current.left, value);
		}else if(current.value<value) {
			current.right = addRecursive(current.right, value);
		}else {
			return current;
		}
		
		return current;		
		
	}
	
	
	
	
	
	
}
