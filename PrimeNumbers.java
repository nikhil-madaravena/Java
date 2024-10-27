import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number up to which you want prime numbers: ");
        int n = scanner.nextInt();
        
        System.out.println("Prime numbers up to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
