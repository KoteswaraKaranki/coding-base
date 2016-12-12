package org.karanki.coding.linked_list;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Tests {@link SingleLinkedList} ADT.
 * @author Koteswara R. Karanki
 *
 */
public class SingleLinkedListTest {

	
	@Test
	public void testInsertRearOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();		
		ll.insertRear(10);
		ll.insertRear(20);
		ll.insertRear(30);
		
		assertNotNull(ll);
		
		ll.insertRear(40);
		ll.insertRear(100);
		
	}
	
	@Test
	public void testInsertFrontOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();		
		ll.insertFront(10);
		ll.insertFront(20);
		ll.insertFront(30);
		
		//ll.print(System.out);
		assertEquals("[30, 20, 10]", ll.toString());
		
		ll.insertFront(40);
		ll.insertFront(50);
		
		assertEquals("[50, 40, 30, 20, 10]", ll.toString());
		
		ll.insertRear(60); //towards end/tail
		assertEquals("[50, 40, 30, 20, 10, 60]", ll.toString());
		
		ll.delete(50);
		assertEquals("[40, 30, 20, 10, 60]", ll.toString());
		
		ll.delete(20);
		assertEquals("[40, 30, 10, 60]", ll.toString());
		
		ll.delete(60);
		assertEquals("[40, 30, 10]", ll.toString());
		
		ll.insertFront(-5);
		
		ll.insertRear(-10);
		
		assertEquals("[-5, 40, 30, 10, -10]", ll.toString());
		
		
	}
	
	@Test
	public void testFindIndexOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();
		ll.insertRear(30);
		ll.insertRear(40);
		ll.insertRear(100);
		ll.insertRear(10);
		ll.insertRear(20);
		
		assertEquals(1, ll.findIndex(40));
		assertEquals(2, ll.findIndex(100));
		assertEquals(4, ll.findIndex(20));
		assertEquals(-1 /* Doesn't exist so -1 */, ll.findIndex(2000));

	}
	
	
	@Test
	public void testToString()
	{
		SingleLinkedList ll = new SingleLinkedList();
		ll.insertRear(30);
		ll.insertRear(40);
		ll.insertRear(100);
		ll.insertRear(10);
		ll.insertRear(20);
		assertEquals("[30, 40, 100, 10, 20]", ll.toString());
		
		ll.delete(10);
		assertEquals("[30, 40, 100, 20]", ll.toString());
	}
	
	@Test
	public void testLengthOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();
		assertEquals(0, ll.length());
		
		ll.insertRear(30);
		ll.insertRear(40);
		ll.insertRear(100);
		
		assertEquals(3, ll.length());
		
		ll.insertRear(10);
		ll.insertRear(20);
		
		assertEquals(5, ll.length());		

	}
	
	@Test
	public void testDeleteMiddleNodeOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();		
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
	
	
	@Test
	public void testDeleteDuplicateNodeOp()
	{
		SingleLinkedList ll = new SingleLinkedList();		
		ll.insertRear(1);
		ll.insertRear(2);
		ll.insertRear(2);
		ll.insertRear(3);		
		
		assertEquals(4, ll.length());
		ll.delete(2); //deletes the first encountered one in the list, in this case index-1, 2 @ index-2 would remain in tact.
				
		//assert length after the delete OP
		assertEquals(3, ll.length());
		
		//assert index position after the delete OP
		assertEquals(0, ll.findIndex(1));
		assertEquals(1, ll.findIndex(2));	//after delete 2 @ index-2 , would move into index-1 position	
		
		//handy just in case for human eye
		//ll.print(System.out);

	}
}
