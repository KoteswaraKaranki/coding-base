package org.karanki.play.coding.system_design.cache;

/**
 * {@link Cache} implemenation.
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2017
 *
 */
public class ConcreteCache implements Cache {

	private Node queue = new Node();
	
	@Override
	public void put(Object key, Object value) {

		queue.add(key, value);
		
		
	}

	@Override
	public Object get(Object key) {

		 Node tmpNode =  queue.remove(key);
		 
		 if(tmpNode != null) {
			 
			 if(tmpNode != queue.HEAD) {
				 queue.add(tmpNode);
			 }
			 			 			 
			 return tmpNode.getValue();
		 }
			 
		 		 
		 return null;
		 		
	}
	
	public Object[] getAsArray() {
		return queue.getAsArray();
	}

	/**
	 * Internal Linked List implementation
	 * 
	 * @author Koteswara R. Karanki
	 * @since Aug 2017
	 *
	 */
	static class Node {

		private Node HEAD;
		private int size;

		private Node next;
		private Node previous;
		private Object key;
		private Object value;

		public void add(Object key, Object value) {

			Node newNode = new Node();
			newNode.key = key;
			newNode.value = value;
			
			add(newNode);
		}
		
		public void add(Node node) {
		
			size++;
			
			if (HEAD == null) {
				HEAD = node;
				return;
			}

			node.next = HEAD;
			HEAD.previous = node;
			HEAD = node;

		}

		public Node remove(Object key) {
			
			if(HEAD.key.equals(key)) 
				return HEAD;
			
			Node tmpNode = HEAD;
			
			while (tmpNode != null) {

				if (tmpNode.key.equals(key)) {

					if (tmpNode.previous != null)
						tmpNode.previous.next = tmpNode.next;

					if (tmpNode.next != null)
						tmpNode.next.previous = tmpNode.previous;
					
					size--;					
					return tmpNode;
				}

				tmpNode = tmpNode.next;
			}

			return null;

		}
		
		public Object getValue() {			
			return value;
		}

		public Object[] getAsArray() {

			Object[] nodes = new Object[size];

			Node tmpNode = HEAD;
			int index = 0;
			while (tmpNode != null) {
				nodes[index++] = tmpNode;
				tmpNode = tmpNode.next;
			}

			return nodes;
		}

	} // EOF class Node

}
