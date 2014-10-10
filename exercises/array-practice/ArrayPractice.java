import java.util.Scanner;

/**
 * Name:
 */
public class ArrayPractice 
{
    /**
     * Method that returns an array that contains the numbers from 'start' to 'finish', inclusive
     */
    public static int[] buildArray(int start, int finish) {
        // Your code here!
        
    }
    
    /**
     * Method that prints the message that is passed in, as well as all the numbers in the array
     */
    public static void printArrayContents(String message, int[] array) {
        // Your code here!

    }
    
    /**
     * Method that prints the SUM and the AVERAGE of the numbers in the array
     */
    public static void printSumAndAverage(int[] array) {
        // Your code here!
    }
    
	// Start with this main() method. Do not change it!
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int start = scanner.nextInt();
		int finish = start;
		while (finish <= start)
		{
			System.out.print("Enter the last number (must be after first number): ");
			finish = scanner.nextInt();
		}
		
		// initialize an array to contain the numbers 'start' through 'finish', inclusive
		int[] numbers = buildArray(start, finish);
		
		// print the message passed in, then all the numbers in the array
		printArrayContents("Initial array:", numbers);
		
		// print the sum and average of the numbers
		printSumAndAverage(numbers);
		
		// Bonus: 
		// add 1 to all odd numbers
		/** addOneToOddNumbers(numbers); */
	}
}