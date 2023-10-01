package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Earth");
		arrayList.add("Venus");
		arrayList.add("Mars");
		arrayList.add("Saturn");
		arrayList.add("Jupiter");

		// array list describe
		System.out.println("ArrayList: " + arrayList);
		System.out.println("Peek (get element at index 2): " + arrayList.get(2));
		System.out.println("Remove element 'Mars': " + arrayList.remove("Mars"));
		System.out.println("ArrayList after removal: " + arrayList);

		// array list sorting
		Collections.sort(arrayList);
		System.out.println("Sorted ArrayList: " + arrayList);

		System.out.println("Using for-each loop:");
		for (String planet : arrayList) {
			System.out.println(planet);
		}

		System.out.println("\nUsing while loop with Iterator:");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}


		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/midterm", "root", "123456");
			String insertQuery = "INSERT INTO planets (planet_name) VALUES (?)";
			PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);

			for (String planets : arrayList) {
				preparedStatement.setString(1, planets);
				preparedStatement.executeUpdate();
			}

			System.out.println("\nData stored in the database successfully.");

			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

