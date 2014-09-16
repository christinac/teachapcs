/**
 * Author:
 * period:
 *
 */
import java.util.ArrayList;

// NOTE: One thing we've noticed is that you are NOT "writing one, testing one"
//       method as you go along - we are now 1/2 way through the year. We hope it
//       doesn't take you the whole year to believe us when we say that writing one
//       method and completely testing it out before moving on will get you to your
//       goal (perfection!) much faster. You will eventually say, "ahhh, you were
//       right" - we're just hoping that is sooner than later! :-)

public class ModeHistogram {
	
	// constructor is complete - it's private to prevent user from instantiating
	// an instance of this class - access to all methods is static
	private ModeHistogram() {}
	
	// precondition:	0 < k < data.length - 1
	public static boolean  isMode(int data[], int k) {
		...
	}	
	
	// precondition:	0 < k < data.size() - 1
	//                ArrayList holds Integer objects
	public static boolean isMode(ArrayList data, int k) {
		...
	}
	
	// precondition:	data is unimodal and data.length >= 3
	public static int modeIndex(int data[]) {
		...
	}
	
	// precondition:	data is unimodal and data.size() >= 3
	//                data holds Integer objects
	public static int modeIndex(ArrayList data) {
		...
	}

	// precondition:	data is unimodal and data.length >= 3;
	//                data[k] >= 0  for  0 <= k < data.length	
	public static String printHistogram(int data[], int longestBar, char barChar) {
		...
	}

	// precondition:	data is unimodal and data.size() >= 3;
	//                the integer value at data.get(k) >= 0   for   0 <= k < data.size()	
	public static String printHistogram(ArrayList data, int longestBar, char barChar) {
		...
	}
}






