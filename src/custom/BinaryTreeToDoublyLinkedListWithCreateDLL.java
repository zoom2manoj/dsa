package custom;

public class BinaryTreeToDoublyLinkedListWithCreateDLL {

	
	//              10
	//          /       \
	//        12          15
	//     /     \       /
	//   25       30   36
	
	//  25 = 12 = 30 = 10 = 36 = 15 
	
	
	
	public static class Node{
		int value;
		Node left, right;
		
		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.value = value;
			left = right = null;
		}
	}
	
	static Node root;
	public static void main(String[] args){
		
		BinaryTreeToDoublyLinkedListWithCreateDLL tree = new BinaryTreeToDoublyLinkedListWithCreateDLL();
		
		tree.root = new Node(10); 
        tree.root.left = new Node(12); 
        tree.root.right = new Node(15); 
        tree.root.left.left = new Node(25); 
        tree.root.left.right = new Node(30); 
        tree.root.right.left = new Node(36);
        
        Node head = tree.binarytolist(tree.root); 
        System.out.println("converted binary tree to DLL");

	}
	private Node binarytolist(Node node) {
		// TODO Auto-generated method stub
		
		if (node==null) {
			return node;
		}
		
		node = binarytolistUtil(node);
		
		while (node.left!=null) {
			node = node.left;
		}
		
		return node;
	}
	
	
	private Node binarytolistUtil(Node node) {
		// TODO Auto-generated method stub
		if (node==null) {
			return node;
		}
		
		
		if (node.left!=null) {
			Node left = binarytolist(node.left);
			for (;left.right !=null ; left = left.right) ;
			
			left.right = node;
			node.left = left;
		}
		
		
		if (node.right !=null) {
			
			Node right = binarytolist(node.right);
			
			for (; right.left!=null; right = right.left) ;
			
			right.left = node;
			node.right = right;
			
			
		}
		
		return node;
	}
	
	
	
	
	
}
