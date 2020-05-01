package org.karanki.play.coding.prepsep2019.jdk8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {

	static public void ex1() {
		
		System.out.println("**** Array toString() example *****");
		
		String names[] = new String[] { "Raj", "Arun", "Raju", "Bhavan", "Chota" };
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		
		System.out.println(Arrays.toString(names));
	}
	
	static public void ex2() {
		System.out.println("***** Array Stream example *****");
		String names[] = new String[] { "Raj", "Arun", "Raju", "Bhavan", "Chota" };
		Arrays.sort(names, (s1, s2) -> s1.compareTo(s2));
		Arrays.stream(names).forEach(System.out::println);
		//Arrays.stream(names).forEach(e -> System.out.println(e));
	}
	
	static public void ex3() {
		System.out.println("***** Collection for-each example *****");
		String names[] = new String[] { "Raj", "Arun", "Raju", "Bhavan", "Chota" };
		List<String> nameList = Arrays.asList(names);
		nameList.forEach(System.out::println);
		nameList.forEach(element -> System.out.println(element));
		
	}

	public static void main(String[] args) {
		ex1();
		ex2();
		ex3();
	}

}
