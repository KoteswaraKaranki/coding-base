package org.karanki.coding.cci.system_design;

import java.util.HashMap;

public class CacheManager {

	public static int MAX_SIZE= 10;
	public Node head, tail;
	public HashMap<String, Node> map;
	public int size = 0;

	
	public void moveToFont(Node node) {
		
		
	}
	
	
	public void moveToFont(String query) {
		
	}
	
	public void removeFronLinkedList(Node node) {
		
	}
	
	
	public String[] getResults(String query) {
		
		if(!map.containsKey(query)) return null;
		
		Node node = map.get(query);
		moveToFont(node);
		return node.results;
	}
	
	public void insertResults(String query, String []results) {
		
		if(map.containsKey(query)) {
			Node node = map.get(query);
			node.results = results;
			moveToFont(node);
			return;
		}
		
		Node node = new Node(query, results);
		moveToFont(node);
		map.put(query, node);
		
		if(map.size() > MAX_SIZE) {			
			node.removeTail();
		}
		
	}
	
	
}



class Node {	

	String query;
	String []results;
	Node next;
	
	Node(String query, String[] results) {		
		this.query = query;
		this.results = results;
	}
	
	void removeTail() {
		
	}
}