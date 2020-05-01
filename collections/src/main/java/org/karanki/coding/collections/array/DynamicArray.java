package org.karanki.coding.collections.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Dynamic array implementation data structure, which mimics Java's collections' class  {@link ArrayList}. 
 * It resizes the underlying array dynamically as the nodes get filled up the existing array. 
 * 
 * @author Koti R. Karanki
 * @since Jan 2019
 *
 * @param <T> arbitrary element / node class type to be passed around for its storage
 */
public class DynamicArray<T> {
	
	private double capacity;
	private int size = 0;
	
	public DynamicArray() {
		this(Math.pow(2, 16));
	}
	
	public DynamicArray(double initialCapacity) {
		capacity = initialCapacity;
	}
	
	
	public T add(T element) {
		
		return null;
	}
	
	
	public void add(int index, T element) {
		
	}
	
	public T remove(int index) {
		
		return null;
	}
	
	
	public boolean remove(T element) {
		
		return false;
	}
	
	public int indexOf(T element) {
		
		
		return 1; 
	}
	
	
	public T get(int index) {
		
		return null;
	}
	
	
	


	public static void main(String[] args) {
		
		
		List al = new ArrayList<>();
		
		al.add(1, 1);
		
		al.remove(1);
		
		
		
		

	}

}
