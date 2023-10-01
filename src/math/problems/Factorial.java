package math.problems;

public class Factorial {

    //finding the factorial of a number with Recursive method
    public static int findFactorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * findFactorialRecursive(n - 1);
    }

    //finding the factorial of a number with Iterative method
    public static int findFactorialIterative(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int number = 5;

        // Using recursion
        int factorialRecursive = findFactorialRecursive(number);
        System.out.println("Factorial of " + number + " (using recursion) is: " + factorialRecursive);

        // Using iteration
        int factorialIterative = findFactorialIterative(number);
        System.out.println("Factorial of " + number + " (using iteration) is: " + factorialIterative);

    }
}
