# Using if-else statements
Here's an if-else statement used in a card-playing program:

    import java.util.Random;
    ...
    int HEARTS = 0, DIAMONDS = 1, SPADES = 2, CLUBS = 3;
    Random gen = new Random();
    int card = gen.nextInt(4);

    if(card == HEARTS || card = DIAMONDS){
        System.out.println("You drew a red card!");
    }else if(card == SPADES){
        System.out.println("You drew a spade!");
    }else if (card == CLUBS){
        System.out.println("You drew a club!");
    }

Java only executes the code nested underneath the first true statement. In other words, if the `card` variable is equal to `0` or `1`, it'll print *only* the statement about drawing a red card; if it's equal to `2`, it'll print *only* the statement about spades, and if it's equal to `3`, you'll *only* see the statement about a club.

## Nested if-else statements

You can nest if-else statements too, which can be helpful:

    /*  We have two ints, grade (a student's most recent test score) and age (a student's age.)  */

    if (grade >= 85){
        if (age >= 18){
            System.out.println("My grade is high, and I'm an adult.");
        }else{
            System.out.println("My grade is high, but I'm not an adult.");
        }
    }else{
        System.out.println("My grade is not high.");
    }

## Longer statements

The statements inside the if blocks can be as many lines as you'd like:

    if (<expression>){
        <statement>;
        <anotherStatement>;
        <aThirdStatement>;
    }else{
        <statement>;
    }

## Shorter statements
For short (one line) if-else statements, Java gives you a shorthand:

    (condition) ? statementIfTrue : statementIfFalse;

The shorthand is useful when assigning variables:

    int a = 5, int b = 4;
    int max = (a > b) ? a : b;

or inside a function:

    public int max(int a, int b){
        return (a > b) ? a : b;
    }
