package AllCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class ListSetStackQueue {
	
	public static void main(String[] args) {
		ListPractice();
		SetPractice();
		StackPractice();
		QueuePractice();
	}
	
	
	public static void ListPractice() {
		
		List<String> food = new ArrayList<>();
		
		food.add("Gumbo");
		food.add("Fried Rice");
		food.add("Fruit");
		food.add("Vegan Burgers");
		food.add("Pizza");
		food.add("Garlic Bread");
		food.add("Shrimp Egg Foo Young");
		food.add("Rice and Beans");
		food.add("Spaghetti");
		
		food.add(0, "Crawfish");
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		System.out.println();
		
		for(String dinner : food) {
			System.out.println(dinner);
		}
		
		System.out.println();
		
	}
	
	
	public static void SetPractice() {
		
		SortedSet<String> tools = new TreeSet<String>();
		
		tools.add("Wrench");
		tools.add("Hammer");
		tools.add("Ratchet");
		tools.add("Pliers");
		tools.add("Inter");
		tools.add("Dremel");
		tools.add("Saw");
		tools.add("Screwdriver");
		tools.add("Philip Screwdriver");
		tools.add("Adjustable Wrench");
		tools.add("Screwdriver");
	

		
		if(tools.contains("Dremel")) {
			System.out.println("Look I'm a Dremel");
		}else {
			System.out.println("I am some other tool");
			
		}
		
		for(String toolBox : tools) {
			System.out.println(toolBox);
		}	
		
		System.out.println();
	}
	
	public static void StackPractice() {
		Stack<String> books = new Stack<String>();
		
		books.push("Clifford the Big Red Dog");
		books.push("Dracula");
		books.push("Harry Potter");
		books.push("Cat in the Hat");
		books.push("The Tail of Desperaux");
		books.push("The Bone Witch");
		books.push("the Outsiders");
		books.push("The Wildthings");
		
		
//		for(String book : books) {
//			System.out.println(book);
//		}
		
		System.out.println();
		

		
//		System.out.println(books.peek());
		
//		System.out.println(books.size());
//		
//		System.out.println(books.peek());
		
		while(!books.empty()) {
			System.out.println(books.pop());
	    }
	
	}
	
	public static void QueuePractice() {
		Queue<String> cars = new LinkedList<>();

		String[] car = { "General Lee", "Hot Wheels", "Ford Focus", "VW Bug", "Rezvani Tank", "Bat Mobile",
				"Classic Mustang", "Marc LV", "Minecraft Car" };

		// Lets add our car to our Queue

		for (int i = 0; i < car.length; i++) {
			cars.add(car[i]);
		}
		
		//Print out the values in my Queue
		
		for(int i = 0; i < car.length; i++) {
			System.out.println(cars.poll());
		}
		
		System.out.println();		

	}
}
	
	
	


