package sorting;

public class QuickSortingOnLinkedList {

	
	public static void main(String[] args){
		QuickSortingOnLinkedList quick = new QuickSortingOnLinkedList();
		
		quick.pushItem(10);
		quick.pushItem(7);
		quick.pushItem(12);
		quick.pushItem(15);
		quick.pushItem(2);
		quick.pushItem(8);
		
		quick.print(head);
		
		
		Node sortedHead = quick.quickSorting();
		
		System.out.println("=======");
		quick.print(sortedHead);
	}
	
	private Node quickSorting() {
		// TODO Auto-generated method stub
		if (head==null|| head.next == null) {
			return head;
		}
		Node start = head;	
		
		return quickSortingRecursive(start, getTail(start));
	}
	
	

	private Node getTail(Node temp) {
		// TODO Auto-generated method stub
		
		while (temp!=null&& temp.next!=null) {
			temp = temp.next;
		}
		return temp;
	}

	private Node quickSortingRecursive(Node start, Node end) {
		// TODO Auto-generated method stub
		if (start==null||start ==end)
	        return start;

		Node newHead = null;
		Node newEnd = null;
		Node[]  partitionData= partition(start, end, newHead, newEnd);
		Node pivot = partitionData[0];
		newHead = partitionData[1];
		newEnd = partitionData[2];
		
		if (newHead!=pivot) {
			Node tmps =  newHead;
			while (tmps.next!=pivot) {
				tmps = tmps.next;
				
			}
			tmps.next = null;
			newHead = quickSortingRecursive(newHead, tmps);
			
			tmps = getTail(newHead);
			tmps.next = pivot;
		}
		
		pivot.next = quickSortingRecursive(pivot.next, newEnd);
		
		return newHead;
	}

	private Node[] partition(Node start, Node end, Node newHead, Node newEnd) {
		// TODO Auto-generated method stub
		
		Node pivot =end;
		Node prev =  null, cur = start, tails = pivot;
		
		while(cur!=pivot){
			
			if (cur.data<pivot.data) {
				if (newHead== null) {
					newHead = cur;
				}
				prev = cur;
				cur =  cur.next;
			}else{
				if (prev!=null) {
					prev.next = cur.next;
					
				}
				Node temp = cur.next;
				cur.next = null;
				tails.next = cur;
				tails = cur;
				cur = temp;
			}
		}
		
		if (newHead==null) {
			newHead = pivot;
			
		}
		
		newEnd = tails;
		
		
		
		return new Node[]{pivot, newHead, newEnd};
	}


	private void print(Node tempHead) {
		// TODO Auto-generated method stub
		Node temp = tempHead;
		while (true) {
			System.out.println(temp.data);
			if (temp.next ==null) {
				break;
			}
			
			temp = temp.next;
		}
	}

	static Node head;
	Node tail;
	
	private void pushItem(int data) {
		// TODO Auto-generated method stub
		Node node = new Node(data);
		if (head==null) {
			head = node;
			tail = node;
		}else{
			node.next =  head;
			head = node;
			tail = node;
		}
		
	}


	public class Node{
		int data;
		Node next;
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			next = null;
		}
	}
}
