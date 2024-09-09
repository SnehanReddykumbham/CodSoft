import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int tries = 7;
            boolean win = false;

            System.out.println("Guess a number between 1 and 100. You have " + tries + " tries.");

            for (int i = 1; i <= tries; i++) {
                System.out.print("Try " + i + ": ");
                int guess = input.nextInt();

                if (guess == number) {
                    System.out.println("You guessed it!");
                    win = true;
                    score++;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                System.out.println("Tries left: " + (tries - i));
            }

            if (!win) {
                System.out.println("Out of tries! The number was: " + number);
            }

            System.out.println("Score: " + score);
            System.out.print("Play again? (yes/no): ");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Final score: " + score);
        input.close();
    }
}
