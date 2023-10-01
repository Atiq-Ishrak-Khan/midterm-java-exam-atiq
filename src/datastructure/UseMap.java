package datastructure;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 */

		Map<String, List<String>> planetData = new HashMap<>();

		//hashmap
		List<String> planets = new ArrayList<>();
		planets.add("Mercury");
		planets.add("Venus");
		planets.add("Earth");
		planets.add("Mars");
		planets.add("Jupiter");
		planets.add("Saturn");
		planets.add("Uranus");
		planets.add("Neptune");

		planetData.put("Planets", planets);


		System.out.println("Retrieving data from the map:");
		List<String> retrievedPlanets = planetData.get("Planets");
		System.out.println("List of planets in the solar system: " + retrievedPlanets);

		System.out.println("\nUsing for-each loop:");
		for (String planet : retrievedPlanets) {
			System.out.println(planet);
		}


		System.out.println("\nUsing while loop with Iterator:");
		Iterator<String> iterator = retrievedPlanets.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}


		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/midterm", "root", "123456");
			String createTableQuery = "CREATE TABLE IF NOT EXISTS planets (planet_name VARCHAR(255))";
			String insertQuery = "INSERT INTO planets (planet_name) VALUES (?)";
			String selectQuery = "SELECT planet_name FROM planets";

			Statement statement = conn.createStatement();
			statement.execute(createTableQuery);

			PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);
			for (String planet : retrievedPlanets) {
				preparedStatement.setString(1, planet);
				preparedStatement.executeUpdate();
			}

			ResultSet resultSet = statement.executeQuery(selectQuery);
			System.out.println("\nRetrieving data from the database:");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("planet_name"));
			}

			preparedStatement.close();
			statement.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

