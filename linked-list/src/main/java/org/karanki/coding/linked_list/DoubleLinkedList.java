package org.karanki.coding.linked_list;

import java.io.PrintStream;


/**
 * <pre>
 * Wikipedia definition of Linked List
 * 
 * A linked list is a linear collection of data elements, whose order is not given by their 
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
 * <pre>
 * Double Linked List data structure implementation. 
 * Data nodes can be inserted either at the FRONT or REAR. Just like HEAD, we could also have REAR pointer, 
 * where a data node can be simply inserted at the REAR. Currently, to add at REAR, we got to iterate over from the HEAD to do so. 
 * For demo purposes (how to iterate from HEAD to REAR), we haven't implemented the proposed ideal logic.
 * </pre>
 * 
 * @author Koteswara R. Karanki
 * @since Jun 2016
 */
public class DoubleLinkedList {

	private DataNode HEAD;
	private DataNode TAIL;
	private int length;
	
	
	public void insertRear(int data)
	{
		DataNode newNode = new DataNode(data, TAIL, null);
		length++;
		
		if(HEAD == null)
		{
			HEAD = TAIL = newNode;
			return;
		}
		
		TAIL.setNext(newNode);		
		TAIL = newNode;						
	}
	
	public void insertFront(int data)
	{
		DataNode newNode = new DataNode(data, null, HEAD);
		length++;
		if(HEAD == null)
		{
			HEAD = TAIL = newNode;
			return;
		}
		
		HEAD.setPrevious(newNode);
		HEAD = newNode;						
	}
	

	public boolean insert(int data, int position)
	{
		
		if(position != 0)
		{
			if(position < 0 || position > length /* If length is 2, position 3 can be allowed */ || (position >= 0 &&  length == 0))
			{
				return false;
			}
		}
		
		
		
		DataNode newNode = new DataNode(data, null, null);
		length++;
		
		if(HEAD == null)
		{
			HEAD = TAIL = newNode;
			return true;
		}
		
		DataNode currentNode = HEAD;
		
		int index = 0;
		
		while(currentNode != null)
		{
			index++;
			
			if(index == position)
			{
				
				newNode.setPrevious(currentNode);				 				 
				currentNode.setNext(newNode);
				
				if(currentNode.getPrevious() != null)
				{
					currentNode.setPrevious(currentNode);
				}
				
				 return true;
			}
				
			currentNode = currentNode.getNext();
								
		}
		
		return false;
	}
	
	//TODO need to fix it later, still incomplete
	public boolean insertByIndex(int data, int position)
	{
		
		
		if(position > length)
		{
			return false;
		}
		
		DataNode newNode = new DataNode(data, null, null);
		
		if(length == 0)
		{
			if(position != 0)
			{
				return false;
			}
			else
			{
				HEAD = TAIL = newNode;
				length++;
				return true;
			}
									
		}
		
		return true;
		
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
	public int findIndex(int data)
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
	 * Returns current length of the node, return 0 if empty.
	 * @return number denoting the current ADT length.
	 */
	public int length()
	{
		return length;
	}
	
	
	/**
	 * Private Data storage helper for the ADT. This class stores the actual data, and pointer to the next, and another pointer 
	 * to the previous node.
	 *  
	 * @author Koteswara R. Karanki
	 * @since June 2016
	 *
	 */
	private class DataNode
	{
		private int data;
		private DataNode next;
		private DataNode previous;
		
		private DataNode(int data)
		{
			this.data = data;
		}
		
		private DataNode(int data, DataNode previousNode, DataNode nextNode)
		{
			this.data = data;
			this.previous = previousNode;
			this.next = nextNode;
		}
		
		public int getData()
		{
			return data;
		}
		
		public DataNode getNext()
		{
			return next;
		}
	
		public void setNext(DataNode next)
		{
			this.next = next;
		}
		
		public void setPrevious(DataNode previous)
		{
			this.previous = previous;
		}

		public DataNode getPrevious() {
			return previous;
		}
				
	};
	
}
