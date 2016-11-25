package org.karanki.coding.linked_list;

import junit.framework.TestCase;



/**
 * Tests {@link SingleLinkedList} ADT.
 * @author Koteswara R. Karanki
 *
 */
public class SingleLinkedListTest extends TestCase {

	
	public void testInsertOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();		
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		
		assertNotNull(ll);

		//handy just in case for human eye
		//ll.print(System.out);
		
		ll.insert(40);
		ll.insert(100);
		

		//handy just in case for human eye
		//ll.print(System.out);
	}
	
	public void testInsertAtBeginOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();		
		ll.insertAtBegin(10);
		ll.insertAtBegin(20);
		ll.insertAtBegin(30);
		
		//ll.print(System.out);
		assertEquals("[30, 20, 10]", ll.toString());
		
		ll.insertAtBegin(40);
		ll.insertAtBegin(50);
		
		assertEquals("[50, 40, 30, 20, 10]", ll.toString());
		
		ll.insert(60); //towards end/tail
		assertEquals("[50, 40, 30, 20, 10, 60]", ll.toString());
		
		ll.delete(50);
		assertEquals("[40, 30, 20, 10, 60]", ll.toString());
		
		ll.delete(20);
		assertEquals("[40, 30, 10, 60]", ll.toString());
		
		ll.delete(60);
		assertEquals("[40, 30, 10]", ll.toString());
		
		ll.insertAtBegin(-5);
		
		ll.insert(-10);
		
		assertEquals("[-5, 40, 30, 10, -10]", ll.toString());
		
		
	}
	
	public void testFindOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();
		ll.insert(30);
		ll.insert(40);
		ll.insert(100);
		ll.insert(10);
		ll.insert(20);
		
		assertEquals(1, ll.find(40));
		assertEquals(2, ll.find(100));
		assertEquals(4, ll.find(20));
		assertEquals(-1 /* Doesn't exist so -1 */, ll.find(2000));

	}
	
	public void testToString()
	{
		SingleLinkedList ll = new SingleLinkedList();
		ll.insert(30);
		ll.insert(40);
		ll.insert(100);
		ll.insert(10);
		ll.insert(20);
		assertEquals("[30, 40, 100, 10, 20]", ll.toString());
		
		ll.delete(10);
		assertEquals("[30, 40, 100, 20]", ll.toString());
	}
	
	public void testLengthOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();
		assertEquals(0, ll.length());
		
		ll.insert(30);
		ll.insert(40);
		ll.insert(100);
		
		assertEquals(3, ll.length());
		
		ll.insert(10);
		ll.insert(20);
		
		assertEquals(5, ll.length());		

	}
	
	public void testDeleteMiddleNodeOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();		
		ll.insert(30);
		ll.insert(40);
		ll.insert(100);
		
		assertEquals(3, ll.length());
		ll.delete(40);
				
		//assert length after the delete OP
		assertEquals(2, ll.length());
		
		//assert index position after the delete OP
		assertEquals(0, ll.find(30));
		assertEquals(1, ll.find(100));
		assertEquals(-1, ll.find(40)); //Make sure it doesn't exist at all, post-delete OP
		
		//handy just in case for human eye
		//ll.print(System.out);

	}
	
	public void testDeleteHeadNodeOp()
	{
		SingleLinkedList ll = new SingleLinkedList();		
		ll.insert(10);
		ll.insert(5);
		ll.insert(20);
		ll.insert(1);
		ll.insert(-5);
		
		assertEquals(5, ll.length());
		ll.delete(10);
				
		//assert length after the delete OP
		assertEquals(4, ll.length());
		
		//assert index position after the delete OP
		assertEquals(0, ll.find(5));
		assertEquals(2, ll.find(1));
		assertEquals(-1, ll.find(10)); //Make sure it doesn't exist at all, post-delete OP
		
		//handy just in case for human eye
		//ll.print(System.out);

	}
	
	public void testDeleteLastNodeOp()
	{
		SingleLinkedList ll = new SingleLinkedList();		
		ll.insert(10);
		ll.insert(5);
		ll.insert(20);
		ll.insert(1);
		ll.insert(-5);
		
		assertEquals(5, ll.length());
		ll.delete(-5);
				
		//assert length after the delete OP
		assertEquals(4, ll.length());
		
		//assert index position after the delete OP
		assertEquals(0, ll.find(10));
		assertEquals(3, ll.find(1));
		assertEquals(-1, ll.find(-5)); //Make sure it doesn't exist at all, post-delete OP
		
		//handy just in case for human eye
		//ll.print(System.out);

	}
	
	public void testDeleteDuplicateNodeOp()
	{
		SingleLinkedList ll = new SingleLinkedList();		
		ll.insert(1);
		ll.insert(2);
		ll.insert(2);
		ll.insert(3);		
		
		assertEquals(4, ll.length());
		ll.delete(2); //deletes the first encountered one in the list, in this case index-1, 2 @ index-2 would remain in tact.
				
		//assert length after the delete OP
		assertEquals(3, ll.length());
		
		//assert index position after the delete OP
		assertEquals(0, ll.find(1));
		assertEquals(1, ll.find(2));	//after delete 2 @ index-2 , would move into index-1 position	
		
		//handy just in case for human eye
		//ll.print(System.out);

	}
}
