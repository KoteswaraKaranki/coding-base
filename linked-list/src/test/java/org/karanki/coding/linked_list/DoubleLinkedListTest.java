package org.karanki.coding.linked_list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DoubleLinkedListTest {

	
	@Test
	public void testInsertRearOp()
	{
		
		DoubleLinkedList ll = new DoubleLinkedList();		
		ll.insertRear(10);
		ll.insertRear(20);
		ll.insertRear(30);
		
		assertNotNull(ll);

		//handy just in case for human eye
		//ll.print(System.out);
		
		ll.insertRear(40);
		ll.insertRear(100);
		
		assertEquals("[10, 20, 30, 40, 100]", ll.toString());
		

		//handy just in case for human eye
		ll.print(System.out);
	}
	
	@Test
	public void testInsertFrontOp()
	{
		DoubleLinkedList ll = new DoubleLinkedList();		
		ll.insertFront(10);
		ll.insertFront(20);
		ll.insertFront(30);
		

		assertEquals("[30, 20, 10]", ll.toString());
		
		ll.insertRear(40);
		ll.insertRear(100);
		
		assertEquals("[30, 20, 10, 40, 100]", ll.toString());
		

		//handy just in case for human eye
		ll.print(System.out);						
	}
	
	
	@Test
	public void testInsertByIndexOp()
	{
		DoubleLinkedList ll = new DoubleLinkedList();		
		boolean isInserted = ll.insert(10, 5); // should fail, since the list is empty, asking for 5th position
		
		assertFalse(isInserted);
		
		isInserted = ll.insert(10, 0); // should pass
		assertTrue(isInserted);
		
		ll.insert(20, 1);		
		ll.print(System.out);
		
		ll.insert(30, 2);		
		
		ll.insert(40, 1);
		ll.print(System.out);
		
		/*ll.insert(30, 2);
		
		//ll.print(System.out);
		
		isInserted = ll.insert(10, 5); // should fail, since the list current length is 3, asking for 5th position
		assertFalse(isInserted);
		
		assertEquals("[10, 20, 30]", ll.toString());
		

		//handy just in case for human eye
		ll.print(System.out);*/						
	}
	
	@Test
	public void testToString()
	{
		DoubleLinkedList ll = new DoubleLinkedList();
		ll.insertRear(30);
		ll.insertRear(40);
		ll.insertRear(100);
		ll.insertRear(10);
		ll.insertRear(20);
		
		assertEquals("[30, 40, 100, 10, 20]", ll.toString());
		
	}
	
	@Test
	public void testDeleteMiddleNodeOp()
	{
		
		DoubleLinkedList ll = new DoubleLinkedList();		
		ll.insertRear(30);
		ll.insertRear(40);
		ll.insertRear(100);
		
		assertEquals(3, ll.length());
		ll.delete(40);
				
		//assert length after the delete OP
		assertEquals(2, ll.length());
		
		//assert index position after the delete OP
		assertEquals(0, ll.findIndex(30));
		assertEquals(1, ll.findIndex(100));
		assertEquals(-1, ll.findIndex(40)); //Make sure it doesn't exist at all, post-delete OP
		
		//handy just in case for human eye
		//ll.print(System.out);

	}
	
	
	@Test
	public void testDeleteHeadNodeOp()
	{
		SingleLinkedList ll = new SingleLinkedList();		
		ll.insertRear(10);
		ll.insertRear(5);
		ll.insertRear(20);
		ll.insertRear(1);
		ll.insertRear(-5);
		
		assertEquals(5, ll.length());
		ll.delete(10);
				
		//assert length after the delete OP
		assertEquals(4, ll.length());
		
		//assert index position after the delete OP
		assertEquals(0, ll.findIndex(5));
		assertEquals(2, ll.findIndex(1));
		assertEquals(-1, ll.findIndex(10)); //Make sure it doesn't exist at all, post-delete OP
		
		//handy just in case for human eye
		//ll.print(System.out);

	}
	
	
	@Test
	public void testDeleteLastNodeOp()
	{
		SingleLinkedList ll = new SingleLinkedList();		
		ll.insertRear(10);
		ll.insertRear(5);
		ll.insertRear(20);
		ll.insertRear(1);
		ll.insertRear(-5);
		
		assertEquals(5, ll.length());
		ll.delete(-5);
				
		//assert length after the delete OP
		assertEquals(4, ll.length());
		
		//assert index position after the delete OP
		assertEquals(0, ll.findIndex(10));
		assertEquals(3, ll.findIndex(1));
		assertEquals(-1, ll.findIndex(-5)); //Make sure it doesn't exist at all, post-delete OP
		
		//handy just in case for human eye
		//ll.print(System.out);

	}
	
	
	
}
