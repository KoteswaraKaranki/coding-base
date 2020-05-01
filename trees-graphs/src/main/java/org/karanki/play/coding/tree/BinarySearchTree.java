package org.karanki.play.coding.tree;

import java.util.LinkedList;

public class BinarySearchTree {

	private Node root;

	private class Node {
		
		private Node(int value) {
			this.value = value;
		}
		
		private int value;
		private Node left;
		private Node right;
	}
	
	public void addNode(int value) {
		
		Node newNode = new Node(value);
		
		if(root == null) {
			root = newNode;
			return;
		}
				
		Node current = root;		
		Node parent = null;
		
		while(true) {			
			parent = current;			
			if(value <= current.value) {				
				
				current = current.left;				
				if(current == null) {
					parent.left = newNode;
					return;
				}
			}
			else  {
				current = current.right;
				if(current == null) {
					parent.right = newNode;
					return;
				}
			}
			
		}
		
	}
	
	
	
	public void addBSTNode(int value) {
		
		Node newNode = new Node(value);
		
		if(root == null) {
			root = newNode;
			return;
		}
				
		Node currentNode = root;				
		
		while(true) {	
			
			if(value <= currentNode.value) {								
								
				if(currentNode.left == null) {
					currentNode.left = newNode;
					return;
				}				
				currentNode = currentNode.left;
			}
			else  {				
				if(currentNode.right == null) {
					currentNode.right = newNode;
					return;
				}				
				currentNode = currentNode.right;
			}
			
		}		
	}
	
	
	public void display() {		
		display(root);
	}
	
	private void display(Node node) {
		
		if(node != null) {			
			System.out.println(" " + node.value);
			display(node.left);
			display(node.right);
		}
	}
	
	public void inOrderTraverse() {		
		System.out.println("\n*** IN-ORDER TRANVERSAL ***");
		inOrderTraverse(root);
	}
	
	private void inOrderTraverse(Node node) {
		
		if(node == null) return;
		
		inOrderTraverse(node.left);
		System.out.print(" " + node.value);
		inOrderTraverse(node.right);
		 
	}
	
	public void preOrderTraverse() {
		System.out.println("\n*** PRE-ORDER TRANVERSAL ***");
		preOrderTraverse(root);
	}
	
	private void preOrderTraverse(Node node) {
		
		if(node == null) return;
		
		System.out.print(" " + node.value);
		preOrderTraverse(node.left);		
		preOrderTraverse(node.right);
		 
	}
		
	
	public void postOrderTraverse() {		
		System.out.println("\n*** POST-ORDER TRANVERSAL ***");
		postOrderTraverse(root);
	}
	
	private void postOrderTraverse(Node node) {
		
		if(node == null) return;
				
		postOrderTraverse(node.left);		
		postOrderTraverse(node.right);
		System.out.print(" " + node.value);
		 
	}
	
	
	 // This method mainly calls deleteRec()
    public void deleteNode(int value)
    {
        root = deleteRec(root, value);
    }
 
    /* A recursive function to insert a new key in BST */
    private Node deleteRec(Node root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)  return root;
 
        /* Otherwise, recur down the tree */
        if (key < root.value)
            root.left = deleteRec(root.left, key);
        else if (key > root.value)
            root.right = deleteRec(root.right, key);
 
        // if key is same as root's key, then This is the node
        // to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.value = minValue(root.right);
 
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.value);
        }
 
        return root;
    }
    
    private int minValue(Node root)
    {
        int minv = root.value;
        while (root.left != null)
        {
            minv = root.left.value;
            root = root.left;
        }
        return minv;
    }
	 
	
	public boolean isBST(Node node) {		
		return isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	
	public boolean isBST(Node node, int min, int max) {
		
		
		if(node == null) {			
			return true;
		}
		
		
		if(node.value < min || node.value > max) {			
			return false;
		}
		
		
		return isBST(node.left, min, node.value) && isBST(node.right, (node.value + 1), max);
		
	}
	
	public void dfsTraversal(Node node) {
		
		if(node == null) {
			return;
		}
		
		
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		queue.push(node.value);
		
		
		while(!queue.isEmpty()) {
			
			if(node.left != null) {
				queue.push(node.left.value);
			}
			
			if(node.right != null) {
				queue.push(node.right.value);
			}
			
			
			queue.poll();
		}
	}
	
	
	public static void main(String[] args) {
		
		
		  /* Let us create following BST
			    50
			 /     \
			30      70
			/  \     /  \
		  20  40   60  80
		      /\
		     35 45  
		*/
		/* BinarySearchTree testObj = new BinarySearchTree();
		 
		testObj.addBSTNode(50); 
		testObj.addBSTNode(30);
		testObj.addBSTNode(20);
		testObj.addBSTNode(40);		
		testObj.addBSTNode(35);
		testObj.addBSTNode(45);
		testObj.addBSTNode(70);		
		testObj.addBSTNode(60);
		testObj.addBSTNode(80);
		
		
		testObj.postOrderTraverse();*/
		
		boolean isOdd = false;
		
		System.out.println(isOdd);
		
		isOdd = !isOdd;
		
		System.out.println(isOdd);
	}
	
	
}
