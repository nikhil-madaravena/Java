import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        int result = 1;
        int count = 0;
        
        while (count < exponent) {
            result *= base;
            count++;
        }
        
        System.out.println(base + "^" + exponent + " = " + result);
        scanner.close();
    }
}
