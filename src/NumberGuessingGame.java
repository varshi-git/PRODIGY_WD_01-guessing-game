import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            // Display difficulty levels
            System.out.println("\nChoose a difficulty level:");
            System.out.println("1. Easy (1 to 50, 10 attempts)");
            System.out.println("2. Medium (1 to 100, 7 attempts)");
            System.out.println("3. Hard (1 to 200, 5 attempts)");

            int maxNumber = 0, maxAttempts = 0;
            while (true) {
                System.out.print("Enter your choice (1/2/3): ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    maxNumber = 50;
                    maxAttempts = 10;
                    break;
                } else if (choice == 2) {
                    maxNumber = 100;
                    maxAttempts = 7;
                    break;
                } else if (choice == 3) {
                    maxNumber = 200;
                    maxAttempts = 5;
                    break;
                } else {
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                }
            }

            // Generate random number
            Random random = new Random();
            int numberToGuess = random.nextInt(maxNumber) + 1;

            System.out.println("\nI have chosen a number between 1 and " + maxNumber + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number: " + numberToGuess);
                    System.out.println("It took you " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                }

                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("Game Over! The correct number was: " + numberToGuess);
            }

            // Ask to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Goodbye!");
        scanner.close();
    }
}