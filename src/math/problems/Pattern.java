package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */

		int number = 100;

		while (number > 0) {
			System.out.print(number + ", ");
			if (number <= 40) {
				number -= 2;
			} else if (number <= 32) {
				number -= 3;
			} else {
				number -= 1;
			}
		}
	}
}
