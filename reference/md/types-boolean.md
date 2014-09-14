#booleans
A `boolean` stores the result of a logical comparison and can take on one of two values: <word data-key="true">true</word> or <word data-key="false">false</word>.

Booleans were named after the nineteenth-century mathematician <a href="http://en.wikipedia.org/wiki/George_Boole">George Boole</a>, who devised an arithmetic system based on the logic of true and false properties.

Booleans help us store a statement's truth or falsehood in a standard way. We evaluate true or false expressions everyday: "do I have my housekeys?" "Should I carry an umbrella?" "Have I called mom yet?"

## Creating a boolean
Create a boolean by giving a boolean variable a true or false value:

    boolean b = true;
    boolean c = (5 < 4);        // c is false
    boolean e;                  // e doesn't yet have a value, but it's been initliazed

## Comparing booleans
Two booleans are equal if they have the same value; that is, if they are both true or both false. For example:

    true == true;                   // true
    false == true;                  // false
    false != true;                  // true

## Values
Suppose we have `int x = 4` and `int y = 12`. What can we say about the following statements?

    boolean b = x > y;              
    // false, because 4 isn't larger than 12
    boolean c = x == y;             
    // false, because 4 isn't equal to 12
    boolean d = y > x;              
    // true, because 12 is greater than 4

Booleans can also be written with more complicated expressions:

    boolean e = (20 - 10) > (9 * 1)  // true
    boolean f = (39 - 30) * 9 != 81 // false