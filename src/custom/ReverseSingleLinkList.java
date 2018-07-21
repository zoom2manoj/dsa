package custom;

public class ReverseSingleLinkList {

	
	public static void main(String[] args){
		ReverseSingleLinkList ob = new ReverseSingleLinkList();
		ob.insertItem(1);
		ob.insertItem(2);
		ob.insertItem(3);
		ob.insertItem(4);
		ob.insertItem(5);
		ob.insertItem(6);
		System.out.println("LinkedList=");

		ob.print();
		ob.reverse();
		System.out.println("Reverse Linkedlist=");
		ob.print();
	}

	private void reverse() {
		// TODO Auto-generated method stub
		
		Node current = head;
		Node prev = null, next = null;
		
		while (current!=null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;
	}

	private void print() {
		// TODO Auto-generated method stub
		Node temp = head;
		while (true) {
			
			System.out.println(temp.value);
			if (temp.next==null) {
				break;
			}
			temp = temp.next;
		}
	}

	Node head ;
	Node tail;
	private void insertItem(int value) {
		Node n = new Node(value);
		if (head==null) {
			head = n;
			tail = n;
		}else{
			tail.next = n;
			tail =n;
		}
	}
	
	
	public class Node{
		int value;
		Node next;
		
		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.value = value;
			next = null;
			
		}
	}
}
