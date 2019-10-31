package org.karanki.play.coding.prepsep2019;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Binary Tree data structure with all the standard operations
 * 
 * @author Koti Karanki
 * @since Oct 2019
 *
 */
public class BinaryTree {

	private Node ROOT = null;
	
	public boolean add(int data) {
		
		Node TMP = new Node(data);
		
		if(ROOT == null) {
			ROOT = TMP;
			return true;
		}
		
		Node PARENT = ROOT;
		while(PARENT != null) {
			if(data == PARENT.data) {
				return false;
			}
			else if(data < PARENT.data) {
				if(PARENT.LEFT == null) {
					break;
				}
				PARENT = PARENT.LEFT;
			}
			else {
				if(PARENT.RIGHT == null) {
					break;
				}
				PARENT = PARENT.RIGHT;
			}
		}
		
		//add to the PARENT/current node
		if(data < PARENT.data) {
			PARENT.LEFT = TMP;
		}
		else {
			PARENT.RIGHT = TMP;
		}
		
		return true;
	}
	
	public boolean add_REC(int data) {
		
		if(ROOT == null) {
			ROOT = new Node(data);
			return true;
		}
		
		return add(ROOT, data);
	}
	
	private boolean add(Node node, int data) {
		
		Node TMP = new Node(data);
		
		//Don't entertain the duplicates
		if(node.data == data) {
			return false;
		}
		
		if(data < node.data) {
			if(node.LEFT == null) {
				node.LEFT = TMP;
				return true;
			}
			else {
				return add(node.LEFT, data);
			}
		}
		else {
			if(node.RIGHT == null) {
				node.RIGHT = TMP;
				return true;
			}
			else {
				return add(node.RIGHT, data);
			}
		}	
	}
	
	public boolean find(int data) {
		return find(ROOT, data);
	}
	
	private boolean find(Node node, int data) {
		
		if(node == null)
			return false;
		
		if(node.data == data)
			return true;
		
		if(data < node.data)
			return find(node.LEFT, data);
		
		else
			return find(node.RIGHT, data);
	}
	
	
	public List inOrderTraversal() {
		return inOrderTraversal(ROOT, new ArrayList());
	}
	
	
	public List preOrderTraversal() {
		return preOrderTraversal(ROOT, new ArrayList());
	}
	
	public List postOrderTraversal() {
		return postOrderTraversal(ROOT, new ArrayList());
	}
	
	private List inOrderTraversal(Node node, List list) {
		
		if(node == null) 
			return list;
		
		inOrderTraversal(node.LEFT, list);
		list.add(node.data);
		inOrderTraversal(node.RIGHT, list);
		
		return list;
	}
	
	private List preOrderTraversal(Node node, List list) {
		
		if(node == null) {
			return list;
		}
		
		list.add(node.data);
		preOrderTraversal(node.LEFT, list);
		preOrderTraversal(node.RIGHT, list);
		
		return list;
	}
	
	
	private List postOrderTraversal(Node node, List list) {
		
		if(node == null) {
			return list;
		}
		
		postOrderTraversal(node.LEFT, list);
		postOrderTraversal(node.RIGHT, list);
		list.add(node.data);
		
		return list;
	}
	
	public boolean delete_REC(int data) {
		
		 return delete_REC(ROOT, data) != null ? true : false;
	}
	
	private Node delete_REC(Node node, int data) {
		
		if(node == null)
			return null;
		
		if(data < node.data)
			node.LEFT = delete_REC(node.LEFT, data);
		else if(data > node.data)
			node.RIGHT = delete_REC(node.RIGHT, data);
		else {
			if(node.LEFT == null)
				return node.RIGHT;
			else if (node.RIGHT == null)
				return node.LEFT;
			
			//both children exist
			node.data = findMinNode(node.RIGHT);
			
			node.RIGHT = delete_REC(node.RIGHT, node.data);
		}
		
		return node;
	}
	
	private int findMinNode(Node node) {
		
		while(node.LEFT != null)
			node = node.LEFT;
		
		return node.data;
	}
	
	
	public List bfsTraversal() {
		
		LinkedList<Node> q = new LinkedList<>();
		
		List list = new ArrayList();
		
		Node TMP = ROOT;
		
		if(TMP == null)
			return q;
		
		q.add(TMP);
		
		while(!q.isEmpty()) {
			
			TMP = q.peek();
			
			if(TMP.LEFT != null)
				q.add(TMP.LEFT);
			if(TMP.RIGHT != null)
				q.add(TMP.RIGHT);
			
			list.add(q.poll().data);
		}
		
		return list;
	}
	
	public int height() {

		if(ROOT == null)
			return 0;
		
		int height = 0;
		
		LinkedList<Node> Q = new LinkedList<>();
		Node TMP = ROOT;
		Q.add(TMP);
		
		while(!Q.isEmpty()) {
			TMP = Q.peek();
			
			if(TMP.LEFT != null)
				Q.add(TMP.LEFT);
			if(TMP.RIGHT != null)
				Q.add(TMP.RIGHT);
			
			//TMP = Q.poll();
			Q.poll();
			height++;	
		}
		return height;
	}
	

	public int height_REC() {
		
		return height_REC(ROOT);
	}
	
	private int height_REC(Node node) {
		
		if(node == null)
			return 0;
		
		int lh = height_REC(node.LEFT);
		int rh = height_REC(node.RIGHT);
		
		return 1 + (lh > rh ? lh : rh);
		
	}
	
	/**
	 * Helper class which is a data container node.
	 * 
	 * @author Koti Karanki
	 *
	 */
	private class Node {
		
		private int data;
		private Node LEFT;
		private Node RIGHT;
		
		Node(int data) {
			this.data = data;
		}
	}
	
	public static void main(String[] args) {

		BinaryTree BT =  add2Data();
		
		System.out.println("******************** Traversal ***********************************");
		System.err.println("IN ORDER :: " +  BT.inOrderTraversal());
		System.err.println("PRE ORDER :: " + BT.preOrderTraversal());
		System.err.println("POST ORDER :: " + BT.postOrderTraversal());
		
		System.out.println("******************** find() ***********************************");
		System.err.println("Value 45 exists :: " + BT.find(45));
		System.err.println("Value 100 exists :: " + BT.find(100));
		System.err.println("Value 23 exists :: " + BT.find(23));
		System.err.println("Value 85 exists :: " + BT.find(85));
		
		System.out.println("*********************** dfs() ********************************");
		System.err.println("Breadth Fitst Search :: " + BT.bfsTraversal());
		
		System.out.println("*********************** height_REC() ********************************");
		System.err.println("Height :: " + BT.height_REC());
		
		System.out.println("*********************** height() ********************************");
		System.err.println("Height :: " + BT.height());
		
		System.out.println("*********************** delete() ********************************");
		System.err.println("Delete :: " + BT.delete_REC(100));
		System.err.println("Delete :: " + BT.delete_REC(50));
		System.err.println("IN ORDER :: " +  BT.inOrderTraversal());
		
		
		
	}
	
	private static BinaryTree addData() {
		
		BinaryTree BT = new BinaryTree();
		
		BT.add(50);
		
		BT.add(30);
		BT.add(20);
		BT.add(40);
		
		BT.add(10);
		BT.add(25);
		BT.add(35);
		BT.add(45);
	
		BT.add(70);
		BT.add(60);
		BT.add(90);
		
		BT.add(55);
		BT.add(65);
		BT.add(80);
		BT.add(100);
		
		return BT;
	}
	
	private static BinaryTree add2Data() {
		
		BinaryTree BT = new BinaryTree();
		
		BT.add_REC(50);
		
		BT.add_REC(30);
		BT.add_REC(20);
		BT.add_REC(40);
		
		BT.add_REC(10);
		BT.add_REC(25);
		BT.add_REC(35);
		BT.add_REC(45);
	
		BT.add_REC(70);
		BT.add_REC(60);
		BT.add_REC(90);
		
		BT.add_REC(55);
		BT.add_REC(65);
		BT.add_REC(80);
		BT.add_REC(100);
		
		BT.add_REC(5);
		BT.add_REC(26);
		BT.add_REC(27);
		BT.add_REC(28);
		BT.add_REC(29);
		
		return BT;
	}
}
