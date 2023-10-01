package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * Use API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

		// Initialize BufferedReader, Stack, and LinkedList
		BufferedReader reader = null;
		Stack<String> wordStack = new Stack<>();
		LinkedList<String> wordList = new LinkedList<>();

		try {
			// Open and read the external file
			reader = new BufferedReader(new FileReader("src\\data\\self-driving-car"));
			String line;
			while ((line = reader.readLine()) != null) {
				// Split each line into words
				String[] words = line.split("\\s+"); // Split on whitespace

				// Store each word in Stack and LinkedList
				for (String word : words) {
					wordStack.push(word);
					wordList.addLast(word);
				}
			}

			// Demonstrate using Stack methods
			System.out.println("Using Stack:");
			System.out.println("Top element (peek): " + wordStack.peek());
			System.out.println("Searching 'self-driving' in Stack: " + wordStack.search("self-driving"));
			System.out.println("Popping elements from Stack:");
			while (!wordStack.isEmpty()) {
				System.out.print(wordStack.pop() + " ");
			}

			// Demonstrate using LinkedList
			System.out.println("\n\nUsing LinkedList:");
			System.out.println("Retrieving as FIFO order:");
			for (String word : wordList) {
				System.out.print(word + " ");
			}

			System.out.println("\n\nRetrieving as FILO order:");
			while (!wordList.isEmpty()) {
				System.out.print(wordList.removeLast() + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}