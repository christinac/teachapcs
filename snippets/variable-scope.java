//The variable 'even' is scoped to the 'isEven' function
boolean isEven(int num){
	boolean even = num % 2 == 0;
	return even;
}