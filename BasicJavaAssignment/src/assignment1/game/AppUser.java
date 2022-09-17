package assignment1.game;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AppUser {
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSOR";

    public static int totalTies = 0;
    public static int pWins = 0;
    public static int pLoss = 0;

    Scanner scanner = new Scanner(System.in);
    public static Scanner sc = new Scanner(System.in);
    public static String getInput;

    public void initialiseGame(int input) {
        int totalRounds = input;
        while (input > 10 || input < 1) {
            System.out.println("Enter number between 1 to 10");
            System.out.println("Enter number of rounds: ");
            input = scanner.nextInt();
        }

       // number of rounds
        while (input > 0) {
            getUserChoice();
            input -= 1; //
        }
        System.out.printf("Ties: %d, User Wins: %d, Computer Wins: %d", totalTies, pWins, totalRounds - (pWins + totalTies));
    }

    //getting choices
    public static void getUserChoice() {

        boolean isInputValid = false;

        while (!isInputValid) {
            System.out.println("Make a move! (rock/paper/scissors)");
            getInput = sc.nextLine();
            getInput = getInput.toUpperCase();
            isInputValid = isUserInputValid(getInput);
        }

        startGame(getInput);
    }

    //Validating the choices
    public static boolean isUserInputValid(String input) {
        if (input.equals(ROCK) || input.equals(PAPER) || input.equals(SCISSORS)) return true;
        else {
            System.out.println("It is not valid choice");
            return false;
        }
    }

    private static void startGame(String playerChoice) {
        //Make computer choose an option.

        List<String> options = List.of(ROCK, PAPER, SCISSORS);
        Random randomGen = new Random();

        String computerChoice = options.get(randomGen.nextInt(0, options.size()));

        System.out.println("Computer's Choice: " + computerChoice);

        switch (computerChoice) {
            case ROCK -> {
                if (playerChoice.equals(ROCK)) totalTies += 1;
                if (playerChoice.equals(PAPER)) pWins += 1;
                if (playerChoice.equals(SCISSORS)) pLoss += 1;
            }
            case PAPER -> {
                if (playerChoice.equals(ROCK)) pLoss += 1;
                if (playerChoice.equals(PAPER)) totalTies += 1;
                if (playerChoice.equals(SCISSORS)) pWins += 1;
            }
            case SCISSORS -> {
                if (playerChoice.equals(ROCK)) pWins += 1;
                if (playerChoice.equals(PAPER)) pLoss += 1;
                if (playerChoice.equals(SCISSORS)) totalTies += 1;
            }
        }
    }
}


