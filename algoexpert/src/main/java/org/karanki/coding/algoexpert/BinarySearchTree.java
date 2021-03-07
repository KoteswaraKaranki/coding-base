package org.karanki.coding.algoexpert;

public class BinarySearchTree {

	class Node {
		private int data;
		private Node left;
		private Node right;

		Node(int data) {
			this.data = data;

		}
	}

	private Node root;

	public Node addNode1(int data) {

		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return newNode;
		}

		Node currentNode = root;

		while (currentNode != null) {
			Node parentNode = currentNode;
			if (data < currentNode.data) {

				currentNode = currentNode.left;

				if (currentNode == null) {
					parentNode.left = newNode;
					return newNode;
				}
			} else {
				
				currentNode = currentNode.right;

				if (currentNode == null) {
					parentNode.right = newNode;
					return newNode;
				}
			}
		}

		throw new RuntimeException("Should not come here!!!!");

	}
	
	
	public Node addNode(int data) {
		
		
		Node newNode = new Node(data);
		
		if(root == null) {
			
			root = newNode;
			return newNode;
		}
		
		Node curNode = root;
		
		while(curNode != null) {
			
			Node parentNode = curNode;
			
			if(data < curNode.data) {
				
				curNode = curNode.left;
				
				if(curNode == null) {
					parentNode.left = newNode;
					return newNode;
							
				}			
			}
			
			else {
				curNode = curNode.right;				
				if(curNode == null) {
					parentNode.right = newNode;
					return newNode;
				}
			}
		}
		
		throw new RuntimeException("Should not come here!!!!");
	}

	public void preOrder(Node node) {

		if (node == null) {
			return;
		}

		System.out.print(node.data + ", ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void InOrder(Node node) {

		if (node == null) {
			return;
		}

		InOrder(node.left);
		System.out.print(node.data + ", ");
		InOrder(node.right);
	}
	
	
	public void postOrder(Node node) {

		
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + ", ");
	}

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();

		bst.addNode(50);
		bst.addNode(46);
		bst.addNode(34);
		bst.addNode(48);
		bst.addNode(55);
		bst.addNode(52);
		bst.addNode(60);

		bst.preOrder(bst.root);

		System.out.println();
		bst.InOrder(bst.root);

		System.out.println();
		bst.postOrder(bst.root);
	}

};
