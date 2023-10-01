package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        st = st.toLowerCase(); // Convert the string to lowercase
        String[] words = st.split("\\s+"); // Split the input into words

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        double totalLength = 0;
        int distinctWordCount = wordCountMap.size();

        for (String word : wordCountMap.keySet()) {
            totalLength += word.length() * wordCountMap.get(word);
            if (wordCountMap.get(word) > 1) {
                System.out.println("Word: " + word + ", Count: " + wordCountMap.get(word));
            }
        }

        double averageLength = totalLength / words.length;

        System.out.println("Average Word Length: " + averageLength);
    }


}



