package org.karanki.coding.collections.sort;

import java.util.ArrayList;
import java.util.List;

public class EqualsHashCodeTest {

	
	
	
	public static void main(String[] args) {
	
		List<Customer> lst = new ArrayList<>();		
		Customer c1 = new Customer(1, "Koti");
		lst.add(c1);
		
		Customer c1Dupe = new Customer(1, "Koti");
		
		System.out.println(lst.contains(c1Dupe));
	}			
	
	
}


class Customer {
	
	private int id;
	private String name;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
