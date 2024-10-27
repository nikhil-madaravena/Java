import java.util.Scanner;

public class TriangleValidityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first angle: ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter the second angle: ");
        int angle2 = scanner.nextInt();
        System.out.print("Enter the third angle: ");
        int angle3 = scanner.nextInt();
        
        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The angles can form a triangle.");
        } else {
            System.out.println("The angles cannot form a triangle.");
        }
        
        scanner.close();
    }
}
