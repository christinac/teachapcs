# Using random numbers
Sometimes, we'll use the `nextInt(int n)` or `nextDouble()` on its own; other times, we'll need to translate what they give back to a range that's useful.

For example, say you want to pick a random whole number between 0 and 100:

    Random gen = new Random();
    int i = gen.nextInt(101);

Or you could do it this way:

    Random gen = new Random();
    double d = gen.nextDouble() * 100;
    int i = (int) d;

Or, maybe you're building a dice game, and you need to make and roll a [six-sided die](http://en.wikipedia.org/wiki/Dice) in your program:

    Random gen = new Random();
    int die = gen.nextInt(6) + 1;

Perhaps you're making a program that randomly assigns students test scores (the horror!) between 60 and 100, inclusive of both:

    Random gen = new Random();
    int i = 60 + gen.nextInt(41);

## Sequences of random numbers
If you need more than one random number, use a <word data-key="for">for loop</word>:

    import java.util.Random

    ...

    Random generator = new Random();
    for(int i = 0; i < 100; i++){
    	int r = 60 + gen.nextInt(41);
    	System.out.println(r);
    }

    93
    73
    68
    85
    99
    ...
