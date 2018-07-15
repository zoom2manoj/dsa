package custom;

public class CustomDoublyLinkedList<E> {

	
	public static void main(String[] args){
		
		CustomDoublyLinkedList<Integer> customDoublyLinkedList = new CustomDoublyLinkedList<Integer>();
		customDoublyLinkedList.addFirst(10);
		customDoublyLinkedList.addFirst(34);
		customDoublyLinkedList.addLast(56);
		customDoublyLinkedList.addLast(364);
		
		customDoublyLinkedList.iterateForward();
		
		
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
