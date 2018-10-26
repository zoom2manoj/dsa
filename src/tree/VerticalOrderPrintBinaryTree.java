package tree;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalOrderPrintBinaryTree {

	static class Node{
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data  = data;
			left = right = null;
		}
	}
	
	
	public static void main(String[] args){
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        root.right.left.right = new Node(8); 
        root.right.right.right = new Node(9); 
        System.out.println("Vertical Order traversal is"); 
        printVerticalOrder(root); 
	}


	private static void printVerticalOrder(Node root) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, Vector<Integer>> map = new TreeMap<Integer, Vector<Integer>>();
		int horizontalDistance = 0;
		
		getVerticalOrder(root, horizontalDistance, map);
		
	
		for (Entry<Integer, Vector<Integer>> entry : map.entrySet()) 
        { 
			Vector<Integer> v = entry.getValue();
			for (int i = 0; i < v.size(); i++) {
				System.out.print(" "+v.get(i));
			}
//            System.out.println(""); 
        } 
	}


	private static void getVerticalOrder(Node root, int horizontalDistance,
			TreeMap<Integer, Vector<Integer>> map) {
		if (root==null) {
			return;
		}		
		
		Vector<Integer> nodes = map.get(horizontalDistance);
		
		if (nodes==null) {
			nodes = new Vector<Integer>();
			nodes.add(root.data);
		}else{
			nodes.add( root.data);
		}
		
		map.put(horizontalDistance, nodes);
		
		if (root.left!=null) {
			getVerticalOrder(root.left, horizontalDistance-1, map);
		}
		
		if (root.right!=null) {
			getVerticalOrder(root.right, horizontalDistance+1, map);
		}
		
	}
}
