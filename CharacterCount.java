import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase(); // Convert to lowercase to make it case-insensitive
        
        int[] counts = new int[26]; // Array to store counts for each letter a-z

        // Count occurrences of each letter
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') { // Only count letters
                counts[c - 'a']++;
            }
        }

        // Display character counts
        System.out.println("Character occurrences:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + counts[i]);
            }
        }

        scanner.close();
    }
}
