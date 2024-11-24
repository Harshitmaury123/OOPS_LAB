//Q.7) A popular game of chance is a die game know as craps, which is played in casinos and back alley
//throught the world .the rules of the game are straightforward: You roll two dice. Each die has six
//faces, which contain one,two,three,four,five and six spots, respectively .after the dice have come to
//rest ,the sum of the spots on the two upward faces is calculated .if the sum is 7 or 11 on the first
//throw ,you win .if the sum is 2,3 or 12 on the first throw(called "Craps"),you lose (i.e. the
//"house" wins). If the sum is 4,5,6,8,9,10 on the first throw, that sum becomes your "points" To
//win, you must continue rolling the die until you “make your point” (i.e. roll that same point
//value).you lose by rolling a 7 before making your point. Hint use ENUM,switch case.
//

package LAB8;

import java.util.Random;

public class Q3 {
    // Declaring the enum inside the class

    public static void main(String[] args) {
        enum GameStatus { CONTINUE, WON, LOST }
        Random random = new Random();

        int point = 0;  // player's point if no win/loss on first roll
        GameStatus gameStatus;

        int sumOfDice = rollDice(random);  // first roll of the dice

        // Determine game status based on first roll
        switch (sumOfDice) {
            case 7:
            case 11:
                gameStatus = GameStatus.WON;
                break;
            case 2:
            case 3:
            case 12:
                gameStatus = GameStatus.LOST;
                break;
            default:
                gameStatus = GameStatus.CONTINUE;
                point = sumOfDice;
                System.out.println("Your point is: " + point);
                break;
        }

        // Continue rolling if game status is CONTINUE
        while (gameStatus == GameStatus.CONTINUE) {
            sumOfDice = rollDice(random);

            if (sumOfDice == point) {
                gameStatus = GameStatus.WON;
            } else if (sumOfDice == 7) {
                gameStatus = GameStatus.LOST;
            }
        }

        // Display win/loss result
        if (gameStatus == GameStatus.WON) {
            System.out.println("Congratulations, You Won!");
        } else {
            System.out.println("Sorry, You Lost.");
        }
    }

    // Method to roll dice and display result
    public static int rollDice(Random random) {
        int die1 = 1 + random.nextInt(6);  // first die roll (1-6)
        int die2 = 1 + random.nextInt(6);  // second die roll (1-6)

        int sum = die1 + die2;
        System.out.printf("You rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
}

