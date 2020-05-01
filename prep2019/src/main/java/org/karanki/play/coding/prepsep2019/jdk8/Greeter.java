package org.karanki.play.coding.prepsep2019.jdk8;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		//Greeting greeting = new HelloGreeting();
		//greeter.greet(greeting);
		
		Greeting le = () -> System.out.println("Hello World from Lambda!!");
		greeter.greet(le);
		
		//Thread lambda
		Thread thread = new Thread(()->System.out.println("Thread run"));
		
		thread.start();
		
		
		
	}

}
