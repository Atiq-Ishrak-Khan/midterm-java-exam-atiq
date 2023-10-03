package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String input = "MADAM";


        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = cleanedInput.equals(new StringBuilder(cleanedInput).reverse().toString());

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String madam) {
        return isPalindrome(madam);
    }
}
