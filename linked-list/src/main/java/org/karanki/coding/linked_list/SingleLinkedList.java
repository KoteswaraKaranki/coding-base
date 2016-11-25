package org.karanki.coding.linked_list;

import java.io.PrintStream;

/**
 * Single Linked List ADT.
 * 
 * @author Koteswara R. Karanki
 * @since Jun 2016
 */
public class SingleLinkedList {

	
	
	private DataNode HEAD;
	private int length = 0;
	
	
	/**
	 * Inserts new node towards tail.
	 * @param data
	 */
	public void insert(int data)
	{
		
		DataNode newDataNode = new DataNode(data);
		DataNode currentNode = HEAD;
		
		length++;
		if(currentNode == null)
		{
			HEAD = newDataNode;
			return;
		}
		
		
		while(currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}
		
		
		currentNode.setNext(newDataNode);
		
	}
	
	
	/**
	 * Inserts new node as first node always.
	 * @param data
	 */
	public void insertAtBegin(int data)
	{
		DataNode newDataNode = new DataNode(data);
		length++;		
		newDataNode.setNext(HEAD);
		HEAD = newDataNode;
	}
	
	/**
	 * Deletes a node from the ADT based on the node data.
	 * 
	 * @param data
	 * 
	 * @return boolean denoting whether node deleted or not. 
	 */
	public boolean delete(int data) 
	{
		DataNode previousNode, currentNode;
		currentNode = previousNode  = HEAD;
				 		
		if(currentNode == null)
		{
			return false;
		}
		
		while(currentNode != null)
		{
			if(currentNode.getData() == data)
			{
				//Make sure HEAD points to next node, in case the deleted one is first one
				if(currentNode == HEAD)
				{
					HEAD = currentNode.getNext();
				}				
				previousNode.setNext(currentNode.getNext());
				length--;
				return true;
			}
			
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		
		
		return false;
		
	}
	
	/**
	 * Finds data node, and returns index position for the given data input.
	 * @param data actual data to be searched for.
	 * @return index position if found, -1 otherwise.
	 */
	public int find(int data)
	{
	
		int index = -1;
		
		if(HEAD == null)
		{
			return index;
		}
		
		DataNode currentNode = HEAD;
		
		while(currentNode != null)
		{
			index++;
			if(currentNode.getData() == data)
			{
				return index;
			}
			
			currentNode = currentNode.getNext();
		}
		
		return -1;
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
		
		DataNode currentNode = HEAD;
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
	 * {@inheritDoc}
	 */
	public String toString()
	{
		if(HEAD == null)
		{
			return ""; //just to avoid  NPE!!;
		}
		
		StringBuilder sb = new StringBuilder();
		
		
		DataNode currentNode = HEAD;
		sb.append("[");
		while(currentNode != null)
		{
			sb.append(currentNode.getData() + (currentNode.getNext() != null ? ", " : ""));
			currentNode = currentNode.getNext();
		}
		sb.append("]");
		
		return sb.toString();
	}
	
	public int length()
	{
		return length;
	}
	
	/**
	 * Private Data storate helper for the ADT. This class stores the actual data, and pointer to the next.
	 * @author koti
	 *
	 */
	private class DataNode
	{
		private int data;
		private DataNode NEXT;
		
		private DataNode(int data)
		{
			this.data = data;
		}
		
		public int getData()
		{
			return data;
		}
		
		public DataNode getNext()
		{
			return NEXT;
		}
	
		public void setNext(DataNode next)
		{
			this.NEXT = next;
		}
		
	}
	
	/**
	 * Just for a quick test for human eye.
	 * @param args
	 */
	public static  void main(String []args) {
		
		SingleLinkedList ll = new SingleLinkedList();
		
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		
		
		
		System.out.println(ll.find(10));
		System.out.println(ll.find(20));
		System.out.println(ll.find(30));
		System.out.println(ll.find(40));
		
		ll.print(System.out);

	}
}
