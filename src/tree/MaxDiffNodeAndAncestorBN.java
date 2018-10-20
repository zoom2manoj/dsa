package tree;

public class MaxDiffNodeAndAncestorBN {
	
	
	static class Node{
		int data;
		Node left, right;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			left = right = null;
		}
	}
	
	static Node root ;
	public static void main(String[] args) {
		MaxDiffNodeAndAncestorBN tree = new MaxDiffNodeAndAncestorBN(); 
		   
        // Making above given diagram's binary tree 
        tree.root = new Node(8); 
        tree.root.left = new Node(3); 
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(6); 
        tree.root.left.right.left = new Node(4); 
        tree.root.left.right.right = new Node(7); 
   
        tree.root.right = new Node(10); 
        tree.root.right.right = new Node(14); 
        tree.root.right.right.left = new Node(13); 
   
        System.out.println("Maximum difference between a node and its ancestor is : " + tree.maxDifferenceCal(tree.root)); 
    
	}
	private int maxDifferenceCal(Node root2) {
		// TODO Auto-generated method stub
		Threshold res = new Threshold(); 
        differenceUtils(root2, res); 
		return res.r;
	}
	

	
	private int differenceUtils(Node root2, Threshold res) {
		
		if (root2==null) {
			return Integer.MAX_VALUE;
		}
		
		if (root2.left==null&& root2.right==null) {
			return root2.data;
		}
		
		int val = Math.min(differenceUtils(root2.left, res), differenceUtils(root2.right, res));
		
		res.r =  Math.max(res.r, root2.data-val);
				
		return Math.min(val, root2.data);		
	}



	class Threshold{
		int r = Integer.MIN_VALUE;
	}
}
