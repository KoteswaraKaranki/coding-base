package org.karanki.coding.collections.sort;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortTestApp {

	
	
	public static void main(String[] args) {

		Set<Employee> emps = new TreeSet<>();
		
		//Set<Employee> emps = new HashSet<>();
		
		Employee e2 = new Employee("koti", "katanki", 50000);		
		Employee e1 = new Employee("koti", "karanki", 50000);
		Employee e4 = new Employee("koti", "karanki", 55000);
		Employee e3 = new Employee("abc",  "karanki", 50000);		
		Employee e5 = new Employee("koti", "karanki", 50000);
				
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		
		Iterator<Employee> it =  emps.iterator();
	
		while(it.hasNext()) {			
			System.out.println(it.next());
		}
		
	}
	

}



class Employee implements Comparable<Employee> 
{
	
	
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	 @Override
	public int compareTo(Employee otherEmployee) {
		 
		 if(salary != otherEmployee.salary) {			 
			 return salary - otherEmployee.salary;
		 }		 
		 else if(!firstName.equals(otherEmployee.firstName)) {
			 return firstName.compareTo(otherEmployee.firstName);
		 }
		 else if(!lastName.equals(otherEmployee.lastName)) {
			 return lastName.compareTo(otherEmployee.lastName);
		 }		 
		 return 0;
	}	
	 
	 @Override
	public String toString() {	
		return  salary +  ", " + firstName + ", " + lastName;
	}
	 
		@Override
		public boolean equals(Object obj) {
		
			Employee other = (Employee) obj;
			
			return   salary == other.salary && //
					 firstName.equals(other.firstName) && //
					 lastName.equals(other.lastName);				
		}
		
		@Override
		public int hashCode() {		
			return salary + firstName.hashCode() + lastName.hashCode();
		}

}