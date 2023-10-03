package string.problems;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        //anagram

        public void testAnagramWithAnagrams() {
            assertTrue(Anagram.declareAnagram("CAT", "ACT"));
        }

        //determine largest word

        public void testDetermineLargestWord() {
            String s = "Human brain is a biological learning machine";
            Map<Integer, String> result = DetermineLargestWord.theLargestWord(s);

            assertEquals(10, result.keySet().iterator().next().intValue());
            assertEquals("biological", result.values().iterator().next());
        }

        //duplicate word
        public void testDuplicateWords() {
            DuplicateWord.main(new String[0]);
        }

        // palindrome
        public void testIsPalindromeWithPalindrome() {
            assertTrue(Palindrome.isPalindrome("MADAM"));
            assertTrue(Palindrome.isPalindrome("racecar"));
            assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));
        }
        public void testIsPalindromeWithNonPalindrome() {
            assertFalse(Palindrome.isPalindrome("HELLO"));
            assertFalse(Palindrome.isPalindrome("world"));
            assertFalse(Palindrome.isPalindrome("This is not a palindrome"));
        }

        // permutation
        public void testGeneratePermutations() {

            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            String str = "ABC";
            Permutation.generatePermutations(str, 0, str.length() - 1);

            System.setOut(System.out);

            String output = outContent.toString().trim();

            assertTrue(output.contains("ABC"));
            assertTrue(output.contains("BAC"));
            assertTrue(output.contains("BCA"));
            assertTrue(output.contains("ACB"));
            assertTrue(output.contains("CAB"));
            assertTrue(output.contains("CBA"));
        }
    }
}