package org.karanki.play.coding.prepsep2019.jdk8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JDK8StreamExample {

	public static void main(String[] args) throws IOException {
		
		//Example 1
		System.out.println("***** range() & forEach() example *****");
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();

		//Example 2
		System.out.println("***** skip() example *****");
		IntStream
		.range(1, 10)
		.skip(5)
		.forEach(x -> System.out.println(x));
		System.out.println();
		
		//Example 3
		System.out.println("***** sum() example *****");
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println();
		
		//Example 4
		System.out.println("***** Stream.of() example *****");
		Stream.of("Raj", "Raju", "Arul").sorted().findFirst().ifPresent(System.out::println);
		System.out.println();
		
		//Example 4A
		System.out.println("***** Stream.of() & sort() with own comprator example *****");
		Stream.of("Raju", "Raja", "Arul").
		sorted((s1, s2) -> s2.compareTo(s1)).
		findFirst().
		ifPresent(System.out::println);
		System.out.println();
		
		//Example 5
		System.out.println("***** Arrays.stream() example *****");
		Stream.of("A1", "Ankit", "Khusal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "samantha")
		.filter(name -> name.startsWith("S"))
		.sorted()
		.forEach(System.out::println);
		System.out.println();
		
		//Example 6
		System.out.println("***** Average of squares *****");
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
		.map(elem -> elem * elem)
		.average()
		.ifPresent(System.out::println);
		
		System.out.println();
		
		// Example 7
		System.out.println("***** File steaming *****");
		Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Koti\\Desktop\\running-notes.txt"));
		lines.sorted()
		.filter(line -> line.length() > 5)
		.forEach(System.out::println);
		lines.close();
		System.out.println();
	}

}
