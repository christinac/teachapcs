import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * This program will let the user play Rock, Paper, Scissors against the computer.
 * 
 * It will ask the user to input one of 'rock', 'paper', or 'scissors', and the computer will
 * pick one for itself at random. The program will that print out who won the game, and ask if
 * the user wants to play again.
 *
 */
public class RockPaperScissors {

	/**
	 * The method getUserChoice() returns the move that the user has played.
	 * 
	 * The method should print out "Enter rock, paper, or scissors!" and then read in
	 * one word from the user.
	 * 
	 * Hint: Remember that to read input from the user we use the following two lines:
	 * 
	 * Scanner scanner = new Scanner(System.in);
	 * String input = scanner.next();
	 */
	public static String getUserChoice() {
	}
	
	/**
	 * The method getComputerChoice() returns one of "rock", "paper", or "scissors" at random.
	 * 
	 * In order to get a random number, you can use the two Random lines that are already provided. 
	 *
	 */
	public static String getComputerChoice() {
		Random rand = new Random();
		int choice = rand.nextInt(3);
		// choice is now a variable that can be any number from 0 to 2 (0, 1, or 2), chosen randomly
		
	}
	
	/**
	 * The computeWinner() method will accept as parameters the user's choice and the computer's choice.
	 * 
	 * Each one is one of "rock", "paper", or "scissors". This method will then return either "Tie!", 
	 * "User Wins!", or "Computer Wins!", depending on who the winner is.
	 */
	public static String computeWinner(String userChoice, String computerChoice) {
	}
	
	/**
	 * Main method of the game. This should:
	 * 
	 * 1. Welcome the user to the game: print something like "Welome to Rock Paper Scissor!"
	 * 2. Ask the user to enter a move to play
	 * 3. Get the random computer move, and print out who won
	 * 4. Ask if the user wants to quit (the user can enter 'exit' to stop playing), and if not, play again
	 * @param args
	 */
	public static void main(String[] args) {
	}
	
	/**
	 * This is a tester to make sure your individual methods are working properly.
	 * 
	 * While you are working on this assignment, you can use this method to see if you are correctly
	 * implementing the individual methods!
	 */
	public static void testRockPaperScissors() {
				System.out.print("Testing getComputerChoice...........");
		List<String> validMoves = Arrays.asList("rock", "paper", "scissors");
		for (int i = 0; i < 150; i++) {
			String value = getComputerChoice();
			
			if (validMoves.indexOf(value) == -1) {
				System.out.println("\nERROR! getComputerChoice returned " + value + ", but that's not a valid move!");
				return;
			}
		}
		System.out.println("Success!!!");
		
		System.out.print("Testing computeWinner...........");
		List<String> computerWins = Arrays.asList("paperscissors", "scissorsrock", "rockpaper");
		List<String> humanWins = Arrays.asList("scissorspaper", "rockscissors", "paperrock");
		for (int i = 0; i < 150; i++) {
			String computer = getComputerChoice();
			String human = getComputerChoice();
			
			String result = computeWinner(human, computer);
			
			if (computer.equals(human) && !result.equals("Tie!")) {
				System.out.println("\nERROR! computer and human tied and expected 'Tie!', but result is '" + result + "'");
				return;
			} else if (computerWins.indexOf(human+computer) != -1 && !result.equals("Computer Wins!")) {
				System.out.println("\nComputer played " + computer + " and human played " + human);
				System.out.println("ERROR! computer won and expected 'Computer Wins!', but result is '" + result + "'");
				return;
			} else if (humanWins.indexOf(human+computer) != -1 && !result.equals("User Wins!")) {
				System.out.println("\nComputer played " + computer + " and human played " + human);
				System.out.println("ERROR! user won and expected 'User Wins!', but result is '" + result + "'");
				return;
			}
		}
		System.out.println("Success!!!");
	}
}
