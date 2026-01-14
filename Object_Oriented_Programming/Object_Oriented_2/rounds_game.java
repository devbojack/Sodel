
import java.util.Scanner;
import java.util.Random;

public class GameProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        int startCount = 0;
        int secretNumber = 9;

        System.out.print("Enter the no. of rounds to play: ");
        int rounds = scanner.nextInt();

       while(startCount < rounds ) {
            System.out.print("Enter lucky number for round " + (startCount + 1) + ": ");
            secretNumber = rand.nextInt(9) + 1;
            int luckyNumber = scanner.nextInt();
            int remainder = luckyNumber % secretNumber;

            if (remainder == 0) {
                totalScore += 1;
                System.out.println("Draw! You scored +1 in this round");
            } else if (remainder % 2 == 0) {
                totalScore += 3;
                System.out.println("Win! You scored +3 in this round");
            } else {
                totalScore -= 3;
                System.out.println("Loss! You score -3 in this round");
            }
            startCount++;
        }

        System.out.println("Total Score: "+ totalScore);

        if (totalScore > 0) {
            System.out.println("You won the game.");
        } else {
            System.out.println("You lost the game.");
        }

        scanner.close();
    }
}
