package custom;

public class SplitDoubleLinkedListIntoHalves {

	
	public static class Node{
		int value;
		Node next, pre;
		
		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.value = value;
			next=pre =null;
		}
	}
	
	Node head;
	public static void main(String[] args){
		
		SplitDoubleLinkedListIntoHalves halves = new SplitDoubleLinkedListIntoHalves();
		halves.head = new Node(1);
		halves.head.next = new Node(2);
		halves.head.next.next = new Node(3);
		halves.head.next.next.next = new Node(4);
		halves.head.next.next.next.next = new Node(5);
		halves.head.next.next.next.next.next = new Node(6);
		halves.head.next.next.next.next.next.next = new Node(7);
		halves.head.next.next.next.next.next.next.next = new Node(8);
		halves.head.next.next.next.next.next.next.next.next= new Node(9);
		halves.head.next.next.next.next.next.next.next.next.next = new Node(10);
		halves.head.next.next.next.next.next.next.next.next.next.next = new Node(11);
		
		
		
		
		
		halves.head.next.next.next.next.next.next.next.next.next.next.next  = halves.head;
		
		halves.print(halves.head);
		
		halves.sliteIntoHalves(halves.head);
		
		
		
		
		
	}
	private void sliteIntoHalves(Node head2) {
		// TODO Auto-generated method stub
		
		Node temp = head2;
		
		if (temp==null) {
			return;
		}
		
		Node firstEnd =temp;
		Node secondEnd = temp;
		
		while (secondEnd.next!=head &&  secondEnd.next.next!=head) {
			
			firstEnd =firstEnd.next;
			secondEnd = secondEnd.next.next;
				
		}
		
		
		if (secondEnd.next.next==head) {
			secondEnd = secondEnd.next;
		}
		
		Node fHead = head;
		Node sHead = null;
		
		if (head.next!=head) {
			sHead = firstEnd.next;
				
		}
		
		
		secondEnd.next = firstEnd.next;
		firstEnd.next = fHead;
		
		
		
		System.out.println("first list===");
		
		System.out.println("=====end ===");
		print(fHead);
		System.out.println("====");
		print(sHead);
	}
	private void print(Node currentHead) {
		// TODO Auto-generated method stub
		Node temp = currentHead;
		while (true) {
			System.out.println(temp.value);
			if (temp.next.value==currentHead.value) {
				break;
			}
			temp = temp.next;
			
		}
	}
	
}
