# PRODIGY_WD_01-guessing-game
A simple console-based game where the player guesses a randomly generated number . The game provides feedback on whether the guess is too high, too low, or correct and tracks the number of attempts. This project helps practice Java concepts like loops, conditionals, and user input.


## NUMBER GUESSING GAME

A simple console-based Number Guessing Game written in Java. The player has to guess a randomly generated number, and the game gives feedback on whether the guess is too high, too low, or correct. The number of attempts is also tracked.

## FEATURES

Random number generation.
User input for guessing the number.
Feedback for each guess: whether it's too high, too low, or correct.
Tracks the number of attempts taken to guess the correct number.
Simple console-based interaction.

## HOW TO RUN THE GAME

1. Compile the Java code

    Navigate to the src folder where the GuessingGame.java file is located, and then compile the Java code using javac:
             cd GuessingGame/src
             javac GuessingGame.java
2. Run the Java Program

Once the code is compiled, you can run the game using the following command:
        java GuessingGame

3.Start Guessing
The game will prompt you to enter your guesses.
You will be notified if your guess is too high or too low.
The game continues until you guess the correct number.
Once you guess correctly, the game will display how many attempts it took.

## Example Output
Welcome to the Number Guessing Game!
Choose a difficulty level:
1. Easy (1 to 50, 10 attempts)
2. Medium (1 to 100, 7 attempts)
3. Hard (1 to 200, 5 attempts)
Enter your choice (1/2/3): 2
I have chosen a number between 1 and 100.
You have 7 attempts to guess it!
Enter your guess: 50
Too low! Try again.
Attempts remaining: 6
Enter your guess: 75
Too high! Try again.
Attempts remaining: 5
Enter your guess: 63
Congratulations! You guessed the number: 63
It took you 3 attempts.
Do you want to play again? (yes/no): no
Thank you for playing! Goodbye!

## TECHNOLOGIES USED

Java – Programming language used for the game.
Scanner class – For user input.
Math.random() – For generating the random number.






