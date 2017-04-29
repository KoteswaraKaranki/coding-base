package org.karanki.play.coding.tree;

import org.junit.Before;
import org.junit.Test;


public class BinarySearchTreeTest {

	private BinarySearchTree testObj;
	
	@Before
	public void setUp() {		
		testObj = new BinarySearchTree();
	}
	
	
	
	  /* Let us create following BST
		    50
		 /     \
		30      70
		/  \     /  \
	  20  40   60  80
	      /\
	     35 45  
	*/
	@Test
	public void testInOrderTraverse() {
				
		testObj.addBSTNode(50); 
		testObj.addBSTNode(30);
		testObj.addBSTNode(20);
		testObj.addBSTNode(40);		
		testObj.addBSTNode(35);
		testObj.addBSTNode(45);
		testObj.addBSTNode(70);		
		testObj.addBSTNode(60);
		testObj.addBSTNode(80);
		
		
		testObj.inOrderTraverse();
		
	}
	
	
	  /* Let us create following BST
		    50
		 /     \
		30      70
		/  \     /  \
	  20  40   60  80
	      /\
	     35 45  
	*/
	@Test
	public void testPreOrderTraverse() {
				
		testObj.addBSTNode(50); 
		testObj.addBSTNode(30);
		testObj.addBSTNode(20);
		testObj.addBSTNode(40);		
		testObj.addBSTNode(35);
		testObj.addBSTNode(45);
		testObj.addBSTNode(70);		
		testObj.addBSTNode(60);
		testObj.addBSTNode(80);
		
		
		testObj.preOrderTraverse();
		
	}
	
	
	
	  /* Let us create following BST
		    50
		 /     \
		30      70
		/  \     /  \
	  20  40   60  80
	      /\
	     35 45  
	*/
	@Test
	public void testPostOrderTraverse() {
				
		testObj.addBSTNode(50); 
		testObj.addBSTNode(30);
		testObj.addBSTNode(20);
		testObj.addBSTNode(40);		
		testObj.addBSTNode(35);
		testObj.addBSTNode(45);
		testObj.addBSTNode(70);		
		testObj.addBSTNode(60);
		testObj.addBSTNode(80);
		
		
		testObj.postOrderTraverse();
		
	}
	
	  /* Let us create following BST
				    50
				 /     \
				30      70
			  /  \     /  \
		     20  40   60  80 
	  */
	
/*	@Test
	public void testDelete() {
				
		testObj.addBSTNode(50); 
		testObj.addBSTNode(30);
		testObj.addBSTNode(20);
		testObj.addBSTNode(40);		
		testObj.addBSTNode(70);		
		testObj.addBSTNode(60);
		testObj.addBSTNode(80);
		
		System.out.println("Before delete of 20");
		testObj.preOrderTraverse();		
		testObj.deleteNode(20);				
		System.out.println("After delete of 20");
		testObj.preOrderTraverse();		
		
		System.out.println("Before delete of 50");
		testObj.preOrderTraverse();		
		testObj.deleteNode(50);				
		System.out.println("After delete of 50");
		testObj.preOrderTraverse();		
		
	}*/
}
