import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int userGuess;
        
        System.out.println("Guess the number (between 1 and 100): ");
        
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            
            if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
            }
        } while (userGuess != numberToGuess);
        
        scanner.close();
    }
}
