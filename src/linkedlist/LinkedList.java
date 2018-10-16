package linkedlist;

public class LinkedList {

	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			next = null;
		}
	}
	
	
	static Node head = null;
	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		
		obj.push(10);
		obj.push(99);
		obj.push(4);
		obj.push(45);
		obj.push(7);
		
		obj.insertAfter(head.next.next, 53);
		
		obj.append( 46);
		
	}


	private void insertAfter(Node afterNode, int i) {
		// TODO Auto-generated method stub
		
		Node newNode = new Node(i);
		newNode.next = afterNode.next;
		afterNode.next = newNode;
		
	}


	private void append(int appendNode) {
		// TODO Auto-generated method stub
		Node tempHead = head;
		while (tempHead.next!=null) {
			tempHead = tempHead.next;			
		}
		
		Node newNode = new Node(appendNode);
		tempHead.next = newNode;
				
	}


	private void push(int i) {
		// TODO Auto-generated method stub
		Node new_node = new Node(i);
		
		new_node.next = head;
		head = new_node;
		
		
	}
	
	
}
