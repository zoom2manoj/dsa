package custom;

public class CustomSingalLinkedList<T> {

	public static void main(String[] args) {
		CustomSingalLinkedList<Integer> sl = new CustomSingalLinkedList<Integer>();
	
		sl.add(3);
		sl.add(5);
		sl.add(7);
		sl.add(8);
		sl.addAfter(10, 5);
		sl.add(33);
	}
	
	private void addAfter(T element, T after) {
		
		Node<T> temp = head;
		Node<T> nodeRef ;
		if (temp==null) {
			return;
		}
		
		
		while (true) {
			
			if (temp.value.equals(after)) {
				nodeRef = temp;
				break;
			}
			
			temp = temp.nextNode;
		}
		
		if (temp !=null) {
			Node<T> newNode = new Node<T>();
			newNode.setValue(element);
			newNode.setNextNode(temp.nextNode);
			if (temp == tail ) {
				tail = newNode;
			}
			temp.setNextNode(newNode);
		}
		
		
	}

	Node<T> head;
	Node<T> tail;
	
	private void add(T element) {
		
		Node<T> newNode = new Node<T>();
		newNode.setValue(element);
		
		if (head==null) {
			head = newNode;
			tail = newNode;
		}else{
			tail.setNextNode(newNode);
			tail= newNode;
		}
	}
	
	public class Node<T> implements Comparable<T>{
		T value;
		Node<T> nextNode;
		
		public T getValue(){
			return value;
		}
		
		public void setValue(T element){
			this.value = element;
		}
		
		public Node<T> getNextNode(){
			return nextNode;
		}
		
		public void setNextNode(Node<T> newNode){
			this.nextNode = newNode;
		}

		public int compareTo(T arg) {
			if (value == arg) {
				return 0;
			}else{
				return 1;
			}
		}
	}	
}
