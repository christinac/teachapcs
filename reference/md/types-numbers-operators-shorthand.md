#Operator shorthand

Increment and decrement operators are two special assignment operators that are used to add and subtract 1 from a number. (Why do we care so much about adding and subtracting by 1? They're often used in loops, which we'll look at soon.)

First, increment operators. The following four statements are equivalent:

Increment and decrement operators – assignment shortcuts
    n = n + 1;
    n += 1;
    ++n;
    n++;

The <word data-key="++">++</word> operator, like the others we've seen, returns a value: the value of `n`, incremented by 1. Take a look at this example:

    int n = 4;
    n
    4
    n+= 2;
    n
    6
    n++;
    n
    7

Similarly, the following four statements are equivalent:
    n = n - 1;
    n -= 1;
    --n;
    n--;

Putting the `++` in front (e.g. `++n`) is called prefix notation, and putting it at the back (e.g. `n++`) is called postfix notation. `++` is an operator just like `+` and it changes the variable's value wherever it's placed. Try this:

    int x = 1;
    int y = x++;
    y;
    1
    x;
    2

    int x = 1;
    int y = ++x;
    y;
    2
    x;
    2

At the end of each block, `x` is equal to `2`, but y is equal to either `1` or `2` depending on where the `++` operator was placed. In the first example, the second line says "give y the value of x, and then increment x" while the second line of the second example says "increment x and give y that new value."
