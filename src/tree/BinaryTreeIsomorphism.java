package tree;

public class BinaryTreeIsomorphism {

	
	//Write a function to detect if two trees are isomorphic. 
	//Two trees are called isomorphic if one of them can be obtained from other by a series of flips, 
	//i.e. by swapping left and right children of a number of nodes. 
	//Any number of nodes at any level can have their children swapped. Two empty trees are isomorphic.
	
	static class Node{
		int value;
		Node left, right;
		
		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.value = value;
			this.left = this.right = null;
		}
	}
	
	
	static Node root1 = null;
	static Node root2 = null;
	public static void main(String[] args) {
		BinaryTreeIsomorphism tree = new BinaryTreeIsomorphism();
		
		// Let us create trees shown in above diagram 
        tree.root1 = new Node(1); 
        tree.root1.left = new Node(2); 
        tree.root1.right = new Node(3); 
        tree.root1.left.left = new Node(4); 
        tree.root1.left.right = new Node(5); 
        tree.root1.right.left = new Node(6); 
        tree.root1.left.right.left = new Node(7); 
        tree.root1.left.right.right = new Node(8); 
   
        tree.root2 = new Node(1); 
        tree.root2.left = new Node(3); 
        tree.root2.right = new Node(2); 
        tree.root2.right.left = new Node(4); 
        tree.root2.right.right = new Node(5); 
        tree.root2.left.right = new Node(6); 
        tree.root2.right.right.left = new Node(8); 
        tree.root2.right.right.right = new Node(7); 
		
		System.out.println("both tree isomorphis is "+tree.isIsomorphism(root1, root2));
		
		
	}
	private boolean isIsomorphism(Node root12, Node root22) {
		// TODO Auto-generated method stub
		
		if (root12==null && root22==null) {
			return true;
		}
		
		if (root12==null || root22==null) {
			return false;
		}
		
		
		
		return (isIsomorphism(root12.left, root22.left)&& isIsomorphism(root12.right, root22.right))||(isIsomorphism(root12.left, root22.right)&&isIsomorphism(root12.right, root22.left));		
		
	}
}
