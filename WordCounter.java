import java.util.Scanner;

public class WordCounter {
    
    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close(); // Close scanner to prevent memory leaks
        return sentence;
    }
    
    // Method to count the number of words in a given sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; // Return 0 if the sentence is empty or null
        }
        String[] words = sentence.trim().split("\\s+"); // Split sentence by spaces
        return words.length;
    }
    
    public static void main(String[] args) {
        // Get user input
        String sentence = getSentenceInput();
        
        // Count words
        int wordCount = countWords(sentence);
        
        // Display the result
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
