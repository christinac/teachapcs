There's several methods you'll need to complete:
    
`String getUserChoice()` which returns the move that the user has played. The method should print out "Enter rock, paper, or scissors!" and then read in one word from the user.

`String getComputerChoice()` which returns one of "rock", "paper", or "scissors" at random.

`String computeWinner(String userChoice, String computerChoice)` which will accept as parameters the user's choice and the computer's choice and return either "Tie!","User Wins!", or "Computer Wins!", depending on who the winner is.

`void main(String[] args)` which should:

  1. Welcome the user to the game: print something like "Welome to Rock Paper Scissor!"
  2. Ask the user to enter a move to play
  3. Get the random computer move, and print out who won
  4. Ask if the user wants to quit (the user can enter 'exit' to stop playing), and if not, play again

Also included is a `void testRockPaperScissors()` method so you can test your code.