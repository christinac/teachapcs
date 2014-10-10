Random gen = new Random();
int chosen = gen.nextInt(5);
// chosen will be 0, 1, 2, 3 or 4

Random dice = new Random();
int roll = dice.nextInt(6) + 1;
// roll is a whole number between 1 and 6, inclusive.