import java.util.Random; 

class Dice{

	/** Returns an array of values from the Dice as it's
	    tossed numRolls times.
	    @param    numRolls – the number of tosses we'll make
	    @return   an array of dice-roll results. It should be
	    		  numRolls long.
	**/
	int[] getRolls(int numRolls){
		/*		Your code here		*/
	}

	int roll(){
		Random gen = new Random();
		return gen.nextInt(5) + 1;
	}
}