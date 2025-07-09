import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int roundsWon = 0;
        int totalAttempts = 0; // Track total attempts across all rounds
        boolean playAgain;

        do {
            System.out.println("=== New Round ===");
            int secret = rand.nextInt(100) + 1;
            final int MAX_TURNS = 10;
            boolean guessedCorrectly = false;

            for (int turn = 1; turn <= MAX_TURNS; turn++) {
                System.out.print("Turn " + turn + "/" + MAX_TURNS + 
                                 " – Enter your guess (1-100): ");
                int guess = sc.nextInt();
                totalAttempts++; // Increment total attempts

                if (guess == secret) {
                    System.out.println("Correct! 🎉");
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                } else if (guess < secret) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.println("Too high, try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of turns! The number was " + secret + ".");
            }

            System.out.print("Play another round? (y/n): ");
            playAgain = sc.next().trim().equalsIgnoreCase("y");

        } while (playAgain);

        System.out.println("\nThanks for playing!");
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Total attempts used: " + totalAttempts); // Display total attempts
        sc.close();
    }
}