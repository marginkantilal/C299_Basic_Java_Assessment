package assignment1.game;
import java.util.Scanner;

public class GameUI {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			AppUser startGame = new AppUser();
			boolean gameEnds = false;


			//Check if the user wants to continue
			while(!gameEnds) {
			    System.out.println("Enter Number of round: ");
			    int userInput = scanner.nextInt();
	            System.out.println("Game started...");
			    startGame.initialiseGame(userInput);
			    System.out.println("\nWant to continue playing ? (Y/N)");
			    String wantToContinue = scanner.next().toUpperCase();
			    gameEnds = !wantToContinue.equals("Y");
			}
		}
        System.out.println("Thank you for playing");
    }
}

