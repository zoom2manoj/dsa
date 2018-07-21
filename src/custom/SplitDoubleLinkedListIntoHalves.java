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
		
		Node firstEnd =null;
		Node secondEnd = null;
		
		while (true) {
			
			
			if (firstEnd==null) {
				firstEnd = temp;
				
			}else{
				firstEnd = firstEnd.next;
			}
			
			
		
			
			if (temp.next.value==head2.value) {

				Node lN = temp;
				Node sF = firstEnd.next;
				sF.pre = lN;
				lN.next = sF;
				secondEnd = sF;
				Node tempF = firstEnd;
				firstEnd = head2;
				tempF.next = firstEnd;
						
				
				
				break;
				
			}else if (temp.next.next.value==head2.value) {
				
				Node lN = temp.next;
				Node sF = firstEnd.next;
				sF.pre = lN;
				lN.next = sF;
				secondEnd = sF;
				
				Node tempF = firstEnd;
				firstEnd = head2;
				tempF.next = firstEnd;
				break;
			}else{
				secondEnd = temp.next.next;
			}

			
			
			
			temp = temp.next.next;
			
		}
		
		
		System.out.println("first list===");
		System.out.println(firstEnd.value+" "+firstEnd.next.value);
		System.out.println("second list ===");
		System.out.println(secondEnd.value+" "+secondEnd.next.value);
		System.out.println("=====end ===");
		print(firstEnd);
		System.out.println("====");
		print(secondEnd);
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
