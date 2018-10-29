package linkedlist;

public class MergeTwoSortedLinkedList {

	
	static class Node{
		
		int data;
		Node next;
		
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		
		Node root1 = new Node(1);
		root1.next = new Node(3);
		root1.next.next = new Node(9);
		root1.next.next.next = new Node(20);
		root1.next.next.next.next = new Node(22);
		root1.next.next.next.next.next = new Node(25);
		
		Node root2 = new Node(2);
		root2.next = new Node(3);
		root2.next.next= new Node(7);
	
		Node temp = null;
		Node no = mergeLinkedList(root1, root2, temp);
		
		System.out.println("asdf");
		
	}

	
	
	private static Node mergeLinkedList(Node root1, Node root2, Node temp) {
		// TODO Auto-generated method stub
		

		if (root1== null) {
			return root2;
		}
		
		if (root2== null) {
			return root1;
		}
		
		int r1data  = root1.data;
		int r2data  = root2.data;
		if (r1data>=r2data) {
				
					temp = root2;
					temp.next = mergeLinkedList(root1, root2.next, temp);
				
		}else {
			
			temp = root1;
			temp.next = mergeLinkedList(root1.next, root2, temp);
		}
		
		return temp;
		
	}
}
