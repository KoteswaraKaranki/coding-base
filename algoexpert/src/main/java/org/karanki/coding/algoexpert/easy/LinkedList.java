package org.karanki.coding.algoexpert.easy;

/**
 * 
 * <pre>
 * Single Linked List data structure implementation.
 * </pre>
 * 
 * <pre>
 * Wikipedia definition of Linked List
 * 
 * In computer science, a linked list is a linear collection of data elements, whose order is not given by their 
 * physical placement in memory. Instead, each element points to the next. It is a data structure consisting of 
 * a collection of nodes which together represent a sequence. In its most basic form, each node contains: 
 * data, and a reference (in other words, a link) to the next node in the sequence. This structure allows for 
 * efficient insertion or removal of elements from any position in the sequence during iteration. 
 * More complex variants add additional links, allowing more efficient insertion or removal of nodes at arbitrary 
 * positions. A drawback of linked lists is that access time is linear (and difficult to pipeline). 
 * Faster access, such as random access, is not feasible. Arrays have better cache locality compared to linked lists.
 * 
 * Linked lists are among the simplest and most common data structures. They can be used to implement several other 
 * common abstract data types, including lists, stacks, queues, associative arrays, and S-expressions, though it is 
 * not uncommon to implement those data structures directly without using a linked list as the basis. 
 * 
 * The principal benefit of a linked list over a conventional array is that the list elements can be easily inserted or 
 * removed without reallocation or reorganization of the entire structure because the data items need not be stored contiguously 
 * in memory or on disk, while restructuring an array at run-time is a much more expensive operation. Linked lists allow insertion 
 * and removal of nodes at any point in the list, and allow doing so with a constant number of operations by keeping the link 
 * previous to the link being added or removed in memory during list traversal
 * </pre>
 * 
 * @author Koteswara R. Karanki
 * @since Oct 2019
 */
public class LinkedList {

	private Node HEAD;
	private Node REAR;

	private int size = 0;

	public Node add(int data) {

		Node newNode = new Node(data);
		
		if(size == 0 ) {
			HEAD = REAR = newNode;
		}
		else {
			REAR.NEXT = newNode;
			REAR = newNode;
		}

		size++;
		return newNode;
	}

	public Node addNodeByIndex(int data, int index) {
	
		Node newNode = new Node(data);
		
		if((size == 0 && index != size) || index > size) {
			throw new RuntimeException("Invalid index, current size :: " + size);
		}
		
		
		if(size == 0) {
			HEAD = REAR = newNode;
			size++;
			return newNode;
		}
		
		
		if(index == size) { // nothing but a last node
			return add(data);
		}
		
		Node curNode = HEAD;
		int counter = 0;
		
		while(curNode != null) {
			if(counter == index - 1) {	
				newNode.NEXT = curNode.NEXT;
				curNode.NEXT = newNode;
				//CURPNTR = newNode;
				break;
			}
			counter++;
			curNode = curNode.NEXT;	
		}
		
		size++;
		return newNode;
	}



	public int size() {
		return size;
	}

	public void display() {

		Node tempNode = HEAD;

		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.NEXT;
		}

	}

	public static void main(String[] args) {
		
		

		LinkedList ll = new LinkedList();
		
		/*

		//---------------------------------
		
		ll.add(10);
		ll.add(20);
		System.out.println("Current size :: " + ll.size);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		System.out.println("Current size :: " + ll.size);

		ll.display();
		*/
		
		
		ll.addNodeByIndex(10, 0);
		ll.add(20);
		System.out.println("Current size :: " + ll.size);
		ll.addNodeByIndex(30, 2);
		ll.addNodeByIndex(15, 1);
		ll.addNodeByIndex(25, 2);
		ll.addNodeByIndex(35, 3);
		ll.add(40);
		ll.addNodeByIndex(45, 5);
		ll.add(50);
		

		System.out.println("Current size :: " + ll.size);

		ll.display();
		

	}

	private class Node {

		int data;
		Node NEXT;

		public Node(int data) {
			this.data = data;
		}

	};
}
