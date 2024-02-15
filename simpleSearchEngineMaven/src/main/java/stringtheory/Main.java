/**
 * Provides classes for the stringtheory program.
 */
package stringtheory;

import java.util.Scanner;

/**
 * Main class for the stringtheory program.
 */
public final class Main {
    /**
     * Private constructor to prevent instantiation.
     */
    private Main() {
        throw new AssertionError("Utility class should not be instantiated");
    }

    /**
     * Entry point of the program.
     *
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a line of words from the user and remove leading whitespaces
        String lineOfWords = scanner.nextLine().trim();
        // Read a search word from the user and remove leading whitespaces
        String searchWord = scanner.nextLine().trim();

        // Call the function to find and display the index of the search word
        findWordIndex(lineOfWords, searchWord);
    }

    /**
     * Finds & prints the index of first occurrence of search word in sentence.
     *
     * @param sentence   The input sentence as a string.
     * @param searchWord The word to search for in the sentence.
     */
    public static void findWordIndex(final String sentence,
                                     final String searchWord) {
        String[] words = sentence.split("\\s+");
        int index = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(searchWord)) {
                index = i + 1;
                break;
            }
        }

        // Print the result based on whether the search word is found or not
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Not Found");
        }
    }
}
