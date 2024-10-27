import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = scanner.nextInt();
        
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        
        do {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        } while (num > 0);
        
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
