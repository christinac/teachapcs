class Dice{
	public static void rollTrickyDice(){
		/*		Your code here		*/
	}

	public static void rollFairDice(){
		Random gen = new Random();
		int roll = gen.nextInt(6) + 1;
		System.out.println("Fair dice rolls a " + roll);
	}

	public static void main(String[] args){
		for(int i = 0; i < 5; i++){
			rollFairDice();
			rollTrickyDice();
			System.out.println("-----")
		}
	}
}
