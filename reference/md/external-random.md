#Random numbers
Sometimes when programming, we might want to use random numbers:

+ simulate a dice roll as we're building a game
+ ask the computer to choose a word from a list
+ "flip" a coin and give the result as heads or tails
+ ...

Java's `Random` class provides tools to make <word data-key="pseudo-random">pseudo-random</word> numbers.

## Using the Random class
To use the `Random` class in your program, <word data-key="import">import</word> `java.util.random` at the top.

    import java.util.random

## Making a random generator
In programming, "random" numbers come from random number generators. We can make a generator by making a new `Random` object: 

    Random generator = new Random();

It's common to call the Random object `generator` or `gen`, but like all other variables, you can call it whatever you like.

## Getting random numbers
Your generator can produce random numbers in a few different ways:

### Random integers (whole numbers)

`nextInt(int n)`: returns a randomly-selected integer between [0, n-1]. For example, `nextInt(10)` will return an integer between 0 and 9, inclusive.

    generator.nextInt(10);
    9
    generator.nextInt(10);
    7

### Random doubles (real numbers)

`nextDouble()`: returns a randomly-selected `double d` between 0 (inclusive) and 1 (exclusive), so that `0 <= d < 1`

    generator.nextDouble();
    0.2488107901176655
    generator.nextDouble();
    0.09949381836031079

### Random integers continued (amongst "all" whole numbers)

`nextInt()`: returns an integer between [<word data-key="integer-min">Integer.MIN_VALUE</word>, <word data-key="integer-max">Integer.MAX_VALUE</word>]

    generator.nextInt();
    49370236
    generator.nextInt();
    -22997583

The [official Java documentation](http://docs.oracle.com/javase/6/docs/api/java/util/Random.html) have information for the Random class' other methods.