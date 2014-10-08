public class FunArrays{
	int[] arrayOfInts;
	double[] arrayOfDoubles;    


	public FunArrays(){
		System.out.println("Default constructor should initialize arrays");
	}

	  public FunArrays(int[] myInts){
		arrayOfInts = myInts;
		arrayOfDoubles =  new double[5];
		for(int i=0; i < arrayOfDoubles.length ; i++){
			//generater random number between 2 and and 11.99999
			 arrayOfDoubles[i] = Math.random() * 10 + 2;
		}
		
	}
	

	  public FunArrays(double[] myDoubles){
		arrayOfInts = new int[4];
		arrayOfInts[0] = 5;
		arrayOfInts[1] = 6;
		arrayOfInts[2] = 7;
		arrayOfInts[3] = 8;
 	    arrayOfDoubles = myDoubles;
	}
 
	public FunArrays(double[] myDoubles, int[] myInts){
		System.out.println("overloaded constructor called");
	}
	
  
	//@returns the sum of all values myInts
	public int sumInts(){
		System.out.println("Make sumInts() work! return the sum of myInts array");
		return 1;
	}
	
	//@returns the sum of arrayOfDoubles
	public double sumDoubles(){
		System.out.println("Make sumDoubles() work! return sum of arrayOfDoubles");
		return 1;
	}
	
 //@returns the mean of the ints
	public double getMeanOfInts(){
		return 0.0;
	}
	
	//@returns the mode of the ints
	public double getdModeOfInts(){
		return 0.0;
	}
	
	//@returns the mode of the ints
   	public double getMedainOfDoubles(){
		return 0.0;
	}	
	
	public double getLargestInt(){
		int largest= arrayOfInts[0];
		for(int i=1;i< arrayOfInts.length; i++){
			if(arrayOfInts[i] > largest){
				largest = arrayOfInts[i];
			}
		}
	   return largest;
	}
	
	
	//@returns the second largest number in the array
	//NOTE: you CANNOT use a regular for loop here
	//use a while loop
	//postcondition arrayOfInts is unchanged
	public double getSecondLargestInt(){
		return 0.0;
	}
	
	//@returns the smallest int in  the arrayOfInts
	//NOTE: you CANNOT use a regular for loop here
	//use a while loop
	//postcondition arrayOfInts is unchanged
	public int getSmallestInt(){
		return 1;
	}
	
	// gets rid of all 1's that are in arrayOfInts
	public void removeAllOnes(){
	
	}
	

	//@ returns true if nums is either in ascending or descending order
	public boolean isInOrder(int nums[]){
		return false;
	}
	
	//postcondition the length of arrayOfInts  is unchanged
	//sets all elements in arrayOfInts to random numbers between
	//minVal and maxVal inclusive
	public void randomizeInts(int minVal, int maxVal){
		
		
	}
	
}