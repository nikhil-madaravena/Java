import java.util.Scanner;

public class SubStringFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = scanner.nextLine();
        System.out.print("Enter the substring to find: ");
        String subStr = scanner.nextLine();
        
        int index = mainStr.indexOf(subStr);
        if (index == -1) {
            System.out.println("Substring not found.");
        } else {
            System.out.println("Substring found at index: " + index);
            while (index != -1) {
                index = mainStr.indexOf(subStr, index + 1);
                if (index != -1) {
                    System.out.println("Substring found at index: " + index);
                }
            }
        }
        
        scanner.close();
    }
}
