package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int n = 40;
        long[] fibonacciSeries = new long[n];


        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;


        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }


        System.out.println("First 40 Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }

    }
}
