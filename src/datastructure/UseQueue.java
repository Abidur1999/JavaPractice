package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>();

		queue.add("Java");
		queue.add("Python");
		queue.add("JavaScript");
		queue.add("Ruby");
		queue.add("C++");
		queue.add("HTML");

		System.out.println("Elements in queue are: " + queue);

		queue.remove();
		System.out.println(" The Elements in queue after using remove: " + queue);

		System.out.println("The top element of queue is: "+ queue.peek());

		queue.poll();
		System.out.println(" The Elements in queue after using the  poll: " + queue);

		System.out.print("\nThe Queue items using For Each: ");
		for(String item: queue)
			System.out.print(item + ", ");

		System.out.print("\nThe Queue items using iterator: ");
		Iterator<String> iter = queue.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
	}
	}


