import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        int random = (int) (Math.random() * (50 - 1) + 1);
        int guess = 0;
        int guessCount = 0;
        int repeat = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 1 through 50! You get 5 five guesses.");
        while (guess != random && guessCount < 5) {
            guess = scanner.nextInt();

            if (guess == repeat) {
                System.out.println("You guessed this number already. Enter a different number.");
                guessCount -= 1;
            }
            if (guess < random && guessCount < 5) {
                guessCount += 1;
                repeat = guess;
                System.out.println(guess + " is too low.");
            }
            if (guess > random) {
                guessCount += 1;
                repeat = guess;
                System.out.println(guess + " is too high.");
            }
            if (guess == random && guessCount < 5) {
                System.out.println(guess + " is right!");
                guessCount += 1;
                repeat = guess;
            }
            if (guessCount >= 5 && guess != random) {
                System.out.println("\nSorry, you're all out of guesses! Try again!");
                System.out.println("The correct answer was " + random + ".");
            }
            System.out.println("Total guesses:" + guessCount);
        }

    }
}

