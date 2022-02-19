package GamblingSimulatorProblem;
import java.util.*;
public class GamblingSimulatorProblem {

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator problem");

        //Initializing the stakeAmount and the betAmountPerGame
        int stakeAmount;
        int initialStakeAmount;
        int betAmountPerGame;
        int winningAmount;
        int losingAmount;


        //Getting user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial amount to start the game: ");
        stakeAmount = scanner.nextInt();

        System.out.println("Enter the bet amount per match:  ");
        betAmountPerGame = scanner.nextInt();

        initialStakeAmount = stakeAmount;
        winningAmount = stakeAmount + (stakeAmount / 2);
        losingAmount = stakeAmount - (stakeAmount / 2);


        while (stakeAmount > losingAmount && stakeAmount <= winningAmount) {

            playGame();
            if (stakeAmount == winningAmount || stakeAmount == losingAmount)
                System.out.println("Gambler will sign off for the day");
        }

    }

    public static void playGame() {
        //Using Random function to get 0 and 1 to find win or lose
        double WinOrLose = Math.round(Math.random());

        System.out.println(WinOrLose);

        //Using If condition and calculating the stakeAmount based on the random function value
        if (WinOrLose == 1) {
            stakeAmount = betAmountPerGame + 1;
            System.out.println("Gambler has won and the dollar value is  " + stakeAmount);
        } else {
            stakeAmount = betAmountPerGame - 1;
            System.out.println("Gambler has  and the dollar value is  " + stakeAmount);
        }



    }}