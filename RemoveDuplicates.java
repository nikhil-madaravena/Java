import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Array to track characters (ASCII size)
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen[c]) { // If character has not been added
                result.append(c);
                seen[c] = true; // Mark character as seen
            }
        }
        
        System.out.println("String after removing duplicates: " + result.toString());
        
        scanner.close();
    }
}
