package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 *
		 */
		int count = countPrimes(2, 1000000);
		System.out.println("Number of prime numbers between 2 and 1 million: " + count);
	}

	public static int countPrimes(int start, int end) {
		int count = 0;
		for (int num = start; num <= end; num++) {
			if (isPrime(num)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
