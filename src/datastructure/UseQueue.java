package datastructure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> planetQueue = new LinkedList<>();


		planetQueue.add("Mercury");
		planetQueue.add("Venus");
		planetQueue.add("Earth");
		planetQueue.add("Mars");
		planetQueue.add("Jupiter");
		planetQueue.add("Saturn");
		planetQueue.add("Uranus");
		planetQueue.add("Neptune");


		System.out.println("Queue of planets in the solar system: " + planetQueue);
		System.out.println("Peek (get element at the front of the queue): " + planetQueue.peek());
		System.out.println("Remove (remove and return the element at the front): " + planetQueue.remove());
		System.out.println("Queue after removal: " + planetQueue);
		System.out.println("Poll (remove and return the element at the front): " + planetQueue.poll());
		System.out.println("Queue after poll: " + planetQueue);

		System.out.println("\nUsing for-each loop:");
		for (String planet : planetQueue) {
			System.out.println(planet);
		}

		System.out.println("\nUsing while loop with Iterator:");
		Iterator<String> iterator = planetQueue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}