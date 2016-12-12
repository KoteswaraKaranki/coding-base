package org.karanki.coding.linked_list;

import java.io.PrintStream;

import org.karanki.coding.linked_list.LinkedList.Node;


public class BrokenLinkedList {

	public static void main(String[] args) {
	
		
		LinkedList ll = new LinkedList();
		
		//10 -> 20 -> 30 -> 40 > 50 -> 30 ==> 50 is supposed to be the tail, broken and points to 30
		ll.insert(10);
		ll.insert(20);
		Node node3 =  ll.insert(30);
		ll.insert(40);
		Node node5 = ll.insert(50);
				
		node5.setNext(node3); // we corrupt the last node, by pointing to the 3rd node. This becomes difficult to traverse to the last node.
		
		printLastNode(ll);
		

	}

	private static void printLastNode(LinkedList ll) {
		
		Node firstPointer,  secondPointer, currentNode;		 
		firstPointer =  secondPointer =  currentNode = ll.HEAD;		
		Node previousNode;
		
		while(true)
		{
			previousNode = currentNode;			
			currentNode =  secondPointer.getNext();
			if( currentNode ==  ll.HEAD)
			{
				 //firstPointer
			}
		}
				
		
	}
	
	
	

	
}


class LinkedList {

		
	 Node HEAD;

	
	/**
	 * Inserts new node towards tail.
	 * @param data
	 */
	public Node insert(int data)
	{
		
		Node newNode = new Node(data);
		Node currentNode = HEAD;
		Node node3;
		

		if(currentNode == null)
		{
			HEAD = newNode;
			return newNode;
		}
		
		
		while(currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(newNode);
		
		return newNode;
	}
	
	
	/**
	 * Utility method just to print for human eye
	 * @param out
	 */
	public void print(PrintStream out)
	{
		if(HEAD == null)
		{
			return;
		}
		
		Node currentNode = HEAD;
		out.print("[");
		while(currentNode != null)
		{
			out.print(currentNode.getData() + (currentNode.getNext() != null ? ", " : ""));
			currentNode = currentNode.getNext();
		}
		out.print("]");
		
		out.println();
	}
	
	/**
	 * Private Data storage helper for the ADT. This class stores the actual data, and pointer to the next.
	 * @author Koteswara R. Karanki
	 * @since June 2016
	 *
	 */
	class Node
	{
		private int data;
		private Node next;
		
		private Node(int data)
		{
			this.data = data;
		}
		
		public int getData()
		{
			return data;
		}
		
		public Node getNext()
		{
			return next;
		}
	
		public void setNext(Node next)
		{
			this.next = next;
		}
		
	}
	
}	
