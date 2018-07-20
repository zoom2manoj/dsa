package custom;

public class CustomDoublyLinkedList<E> {

	
	public static void main(String[] args){
		
		CustomDoublyLinkedList<Integer> customDoublyLinkedList = new CustomDoublyLinkedList<Integer>();
		customDoublyLinkedList.addFirst(10);
		customDoublyLinkedList.addFirst(34);
		customDoublyLinkedList.addLast(56);

		customDoublyLinkedList.addLast(57);

		customDoublyLinkedList.addLast(58);
		customDoublyLinkedList.addLast(94);
		
		customDoublyLinkedList.iterateForward();
	
		//customDoublyLinkedList.delete(58);
		
		System.out.println("==");
		customDoublyLinkedList.iterateForward();
		
		System.out.println("reverse double linkedlist====");
		customDoublyLinkedList.reverse();
		customDoublyLinkedList.iterateForward();
	}

	
	private void reverse() {
		// TODO Auto-generated method stub
		
		System.out.println("this is reversing process");
		Node current = head;
		Node temp = null;
		
		while (current!=null) {
		temp = current.prev;
		current.prev =  current.next;
		current.next = temp;
		current = current.prev;
		
		}
		
		if (temp!=null) {
			head = temp.prev;
		}
		
		System.out.println("completed reverse process");
	}


	private void delete(E i) {
		// TODO Auto-generated method stub
		Node tmp = head;
		while (tmp!=null) {
			if (tmp.element==i) {
				E el = (E) tmp.element;
				
				if (tmp.prev==null) {
					head = tmp.next;
					head.prev = null;
					
					break;
				}else if(tmp.next==null){
					Node lNode = tail;
					tail = tail.prev;
					tail.next = null;
					break;
				}else{
					Node nextN = tmp.next;	
					Node preN = tmp.prev;	
					preN.next = nextN;	
					break;	
				}
				
				
		
			}
			
			tmp = tmp.next;
			
		}
	}


	private void iterateForward() {
		System.out.println("Iterate forward");
		Node tmp = head;
		while (tmp!=null) {
			System.out.println(tmp.element);
			tmp = tmp.next;
		}
	}


	private void addLast(E element) {
		
		Node newNode = new Node<E>(element, null, tail);
		
		if (tail!=null) {
			tail.next = newNode;
		}
		
		tail = newNode;
		
		if (head==null) {
			head = newNode;
		}
		size++;
		
	}


	Node<E> head;
	Node<E> tail;
	int size =0 ;
	
	public class Node<E>{
		Node<E> next;
		Node<E> prev;
		E element;
		public Node(E element, Node<E> next, Node<E> prev){
			this.next = next;
			this.prev = prev;
			this.element = element;
			
		}
		
		
	}
	
	private void addFirst(E element) {
		Node newNode = new Node<E>(element, head, null);
		if (head!=null) {
			head.prev = newNode;
		}
		
		head = newNode;
		if (tail== null) {
			tail = newNode;
		}
		size++;
		
	}
}
