package custom;

public class ConvertBinaryTreeToDoublyLinkedList {

	
	private static class Node{
		int value ;
		Node small, large;
		
		
		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.value = value;
			this.small = null;
			this.large = null;
			
		}
		
	}
	
	
	public static void main(String[] args){
		
		ConvertBinaryTreeToDoublyLinkedList convertBinaryTreeToDoublyLinkedList = new ConvertBinaryTreeToDoublyLinkedList();
		
		// create sorted binary tree first
		Node root= new Node(4);
		convertBinaryTreeToDoublyLinkedList.insertBTItem(root, 2);
		convertBinaryTreeToDoublyLinkedList.insertBTItem(root, 1);
		convertBinaryTreeToDoublyLinkedList.insertBTItem(root, 3);
		convertBinaryTreeToDoublyLinkedList.insertBTItem(root, 5);
		
		convertBinaryTreeToDoublyLinkedList.printBT(root);
		Node headNode = convertBinaryTreeToDoublyLinkedList.cBTreetoCList(root);
		System.out.println("========= list items =======");
		convertBinaryTreeToDoublyLinkedList.printDLList(headNode);
		
		

		
	}


	private void printDLList(Node headNode) {
		// TODO Auto-generated method stub
		Node temp = headNode;
		
		while (true) {
			System.out.println(temp.value);
			if (temp.large==headNode) {
				break;
			}
			temp = temp.large;
		}
	}


	private Node cBTreetoCList(Node root) {
		// TODO Auto-generated method stub
		if (root==null) {
			return null;
		}
		
		Node left = cBTreetoCList(root.small);
		Node right = cBTreetoCList(root.large);
		
		
		root.small = root.large = root;
		
		return concen(concen(left, root), right);
	}


	private Node concen(Node leftList, Node rightList) {
		// TODO Auto-generated method stub
		
		if (leftList== null) {
			return rightList;
		}
		
		if (rightList==null) {
			return leftList;
		}
		
		// First take both left node;
		
		Node leftLast = leftList.small; 
		Node rightLast = rightList.small;
		
		// now connect last node of left list to first node of right list
		leftLast.large = rightList;
		rightList.small = leftLast;
		
		// left of first node refere to last node of right list.
		leftList.small = rightLast;
		
		// right of last node refere to first nod in left list.
		
		rightLast.large = leftList;
		
		
		return leftList;
	}


	private void printBT(Node root) {
		// TODO Auto-generated method stub
			
			if (root.small!=null) {
				printBT(root.small);
			}
			System.out.println(root.value);
			
			if (root.large!=null) {
				printBT(root.large);
			}
			
			
	}


	private void insertBTItem(Node root, int newNodeValue) {
		// TODO Auto-generated method stub
		if (newNodeValue<=root.value) {
			if (root.small!=null) {
				insertBTItem(root.small, newNodeValue);
			}else{
				root.small = new Node(newNodeValue);
			}
			
		}else{
			if (root.large!=null) {
				insertBTItem(root.large, newNodeValue);
			}else{
				root.large = new Node(newNodeValue);
			}
		}
	}
	
	
}
