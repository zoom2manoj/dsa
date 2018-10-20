package custom;

import java.util.Queue;

import javax.management.Query;

import linkedlist.LinkedList;


// 10 12 15 25 30 36

//          10
//        /    \
//       12    15
//     /   \  /
//    25   30 36




class ListNode  
{ 
    int data; 
    ListNode next; 
    ListNode(int d) 
    { 
        data = d; 
        next = null; 
    } 
} 


class BinaryTreeNode  
{ 
    int data; 
    BinaryTreeNode left, right = null; 
    BinaryTreeNode(int data) 
    { 
        this.data = data; 
        left = right = null; 
    } 
} 
  

public class ConvertLinkedListIntoBinaryTree {

	

    ListNode head; 
    BinaryTreeNode root; 
   
    // Function to insert a node at the beginning of 
    // the Linked List 
    void push(int new_data)  
    { 
        // allocate node and assign data 
        ListNode new_node = new ListNode(new_data); 
   
        // link the old list off the new node 
        new_node.next = head; 
   
        // move the head to point to the new node 
        head = new_node; 
    } 
    
	
	public static void main(String[] args) {
		ConvertLinkedListIntoBinaryTree tree = new ConvertLinkedListIntoBinaryTree(); 
        tree.push(36); /* Last node of Linked List */
        tree.push(30); 
        tree.push(25); 
        tree.push(15); 
        tree.push(12); 
        tree.push(10);
        
        BinaryTreeNode node = tree.convertListToBinary(tree.root);
        System.out.println("convert linkedlist to binary tree successfully");
	}


	private BinaryTreeNode convertListToBinary(BinaryTreeNode node) {
		// TODO Auto-generated method stub
		
		
		Queue<BinaryTreeNode> q  = new java.util.LinkedList<BinaryTreeNode>();
		
		if (head==null) {
			node = null;
			return null;
		}
		
			node = new BinaryTreeNode(head.data);
			q.add(node);
			
			head = head.next;
			
			while (head!=null) {
				BinaryTreeNode parent = q.peek();
				BinaryTreeNode pp = q.poll();
				BinaryTreeNode leftChild =null, rightChild = null;
				
				leftChild = new BinaryTreeNode(head.data);
				q.add(leftChild);
				
				head = head.next;
				if (head!=null) {
					rightChild = new BinaryTreeNode(head.data);
					q.add(rightChild);
					head = head.next;
				}
				
				
				parent.left = leftChild;
				parent.right = rightChild;
				
				 
				
			}
		
		
		
		return node;
	}
}
