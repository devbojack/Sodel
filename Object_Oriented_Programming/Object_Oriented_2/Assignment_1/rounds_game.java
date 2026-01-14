import java.util.Scanner;
import java.util.Random;

/*
// RoundsGame
// Game that allows users to enter
// a number a awards them depending
// on the win, draw or lose
*/

public class RoundsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;

        System.out.print("Enter number of rounds: ");
        int rounds = scanner.nextInt();

        for (int i = 1; i <= rounds; i++) {
            System.out.print("Enter lucky number for round " + i + ": ");
             int secretNumber = rand.nextInt(9) + 1;
            int luckyNumber = scanner.nextInt();

            int remainder = luckyNumber % secretNumber;

            if (remainder == 0) {
                totalScore += 1;
                System.out.println("You Draw! Score : +1");
            } else if (remainder % 2 == 0) {
                totalScore += 3;
                System.out.println("You Win! Score : +3");
            } else {
                totalScore -= 3;
                System.out.println("You Lose! Score : -3");
            }
        }

        System.out.println("Total Score: " + totalScore);

        if (totalScore > 0) {
            System.out.println("You won the game.");
        } else {
            System.out.println("You lost the game.");
        }

        scanner.close();
    }
}
