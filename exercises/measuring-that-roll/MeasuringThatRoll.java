import java.util.Random; 

class Dice{

	/** Returns the length of the longest run of repeated values
		in int[] rolls.
		@param	rolls – an array of integer values representing a
		series of dice rolls.
		@return – the length of the longest run.
	**/
	int getLongestRun(int[] rolls){
		/*		Your code here		*/
	}

	int[] getRolls(int numRolls){
		int[] rolls = new int[numRolls];
		for(int i = 0; i < numRolls; i++){
			rolls[i] = roll();
		}
		return rolls;
	}

	int roll(){
		Random gen = new Random();
		return gen.nextInt(5) + 1;
	}
}