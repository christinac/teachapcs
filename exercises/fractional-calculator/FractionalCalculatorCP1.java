public class FractionalCalculatorCP1 
{
	public static void main(String[] args) 
	{
		// TODO: first write the getNumerator, getDenominator, and convertToFraction
		// methods below. When you run the program, these five lines will help you
		// see if your code is working. You can add additional lines here if you 
		// think of other inputs you want to test.
		//
		// Once you're happy with those three methods, comment out these five lines
		// and instead write the code required by the fractional calculator spec for
		// checkpoint 1. You'll need to read an input from the user using a Scanner,
		// then use your convertToFraction method to display it in fraction form.
		System.out.println("The numerator of 3/4 is: " + getNumerator("3/4"));
		System.out.println("The denominator of 4/9 is: " + getDenominator("4/9"));
		System.out.println("8 as a fraction is: " + convertToFraction("8"));
		System.out.println("9/10 as a fraction is: " + convertToFraction("9/10"));
		System.out.println("2_1/3 as a fraction is: " + convertToFraction("2_1/3"));
	}
	
	/**
	 * getNumerator should find the numerator from a string that is a fraction.
	 * 
	 * Precondition: the fraction parameter must be a valid fraction (a numerator, a
	 * slash, and a denominator, like 3/4).
	 * 
	 * @param fraction - the fraction to find the numerator of
	 * @return the numerator
	 */
	public static int getNumerator(String fraction)
	{
		// TODO: write code here that uses indexOf and substring to find the 
		// numerator part of fraction, then use Integer.parseInt to convert
		// it to a number and return it.
		
		return 0; // remove this incorrect line and write your own implementation!
	}

	/**
	 * getDenominator should find the denominator in a fraction string
	 * 
	 * Precondition: the fraction parameter must be a valid fraction (a numerator,
	 * a slash, and a denominator, like 3/4)
	 * 
	 * @param fraction - the fraction to find the denominator of
	 * @return the denominator
	 */
	public static int getDenominator(String fraction)
	{
		// TODO: write code here that uses indexOf and substring to find the 
		// denominator part of fraction, then use Integer.parseInt to convert
		// it to a number and return it.
		
		return 0; // remove this incorrect line and write your own implementation!
	}

	/**
	 * convertToFraction should take a string input that may be a whole number, a mixed
	 * number, or a fraction and return it as a proper or improper fraction.
	 * 
	 * @param input - a whole number, mixed number, or fraction to convert
	 * @return - the equivalent of input as a fraction, proper or improper
	 */
	public static String convertToFraction(String input)
	{
		// TODO: use the String methods indexOf and substring along with some 
		// if and else statements to figure out if input is whole, mixed, or
		// fraction and to convert it to a proper or improper fraction. Be sure
		// to use getNumerator and getDenominator whenever you have a fraction
		// and need the numerator or denominator.
		
		return ""; // remove this incorrect line and write your own implementation!
	}

}
