package GamblingSimulatorProblem;
import java.util.*;
public class GamblingSimulatorProblem {

    public static int stakeAmount;
    public static int initialStakeAmount;
    public static int betAmountPerGame;
    public static int winningAmount;
    public static int losingAmount;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator problem");

        //Getting user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial amount to start the game: ");
        stakeAmount = scanner.nextInt();

        System.out.println("Enter the bet amount per match:  ");
        betAmountPerGame = scanner.nextInt();

        initialStakeAmount = stakeAmount;
        winningAmount = initialStakeAmount + (initialStakeAmount / 2);
        System.out.println(initialStakeAmount);
        System.out.println(winningAmount);
        losingAmount = initialStakeAmount - (initialStakeAmount / 2);
        System.out.println(losingAmount);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Day " + i);
            stakeAmount = initialStakeAmount;
            while (stakeAmount >= losingAmount && stakeAmount <= winningAmount + 1) {

                playGame();
            }
        }
    }



    static void playGame() {

        double WinOrLose = Math.round(Math.random());

        //Using If condition and calculating the stakeAmount based on the random function value
        if (WinOrLose == 1) {
            stakeAmount = stakeAmount + betAmountPerGame;

        } else {
            stakeAmount = stakeAmount - betAmountPerGame;

        }

        if (stakeAmount == winningAmount) {
            System.out.println("win");
            System.out.println("Gambler has won with 50% profit and the stakeAmount is  " + stakeAmount + "   and resigning for the day");
        }
        if (stakeAmount == losingAmount) {
            System.out.println("lost");
            System.out.println("Gambler has lost with 50% loss and the stake amount is  " + stakeAmount + "  and resigning for the day");
        }

    }
}