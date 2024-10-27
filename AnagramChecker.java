import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        char[] charArray1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        char[] charArray2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
        
        scanner.close();
    }
}
