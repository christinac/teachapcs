#Math class
Java's `Math` class contains data and procedures helpful when we perform mathematics. You can read all about the Math class in the <a href="http://docs.oracle.com/javase/7/docs/api/java/lang/Math.html">official Java documentation</a>.

## Functions
Here's a few functions built-in to the `Math` class that might be helpful:

###Absolute value
`Math.abs(int x)` and `Math.abs(double x)` returns the absolute value of x:

    Math.abs(4);             // 4
    Math.abs(-98.88);        // 98.88

###Exponents
`Math.pow(double b, double c)` raises b to the c power:

    Math.pow(2, 4);         // 16.0
    Math.pow(4.4, 1.1);     // 5.102675423469089

###Square roots
`Math.sqrt(double x)` returns the square root of x:

    Math.sqrt(16);          // 4.0
    Math.sqrt(33.5);        // 5.787918451395113
    Math.sqrt(-25.0);       // NaN

If you take the square root of a negative number, Java returns <word data-key="nan">NaN</word>, shorthand for "not a number."

###Rounding
`Math.round(double x)` return the value of x, rounded to the nearest whole number.

    Math.round(4.3);        // 4.0
    Math.round(-2.4);       // -2.0
    Math.round(8904.5);     // 8905.5

###Rounding up
`Math.ceil(double x)` returns the next whole number that's larger than x:

    Math.ceil(49.0);        // 49.0
    Math.ceil(4.29);        // 5.0
    Math.ceil(-85.9);       // -85.0

###Rounding down
`Math.floor(double x)` returns the prior whole number that's smaller than x:

    Math.floor(49.0);       // 49.0
    Math.floor(4.29);       // 4.0
    Math.floor(-85.9);      // -86.0

###Finding a smaller value
Both `Math.min(double a, double b)` and `Math.min(int a, int b)` return the smaller of a and b:

    Math.min(4.3, 2.4);         // 2.4
    Math.min(-2.01,-5.4);       // -5.4
    Math.min(4, 2);             // 2
    Math.min(-2,-5);            // -5

###Finding a larger value
Both `Math.max(double a, double b)` and `Math.max(int a, int b)` return the smaller of a and b:

    Math.max(4.3, 2.4);         // 4.3
    Math.max(-2.01,-5.4);       // -2.01
    Math.max(4, 2);             // 4
    Math.max(-2,-5);            // -2

###Random numbers
`Math.random()` returns a random double between 0 (inclusive) and 1 (exclusive.) It's the same as `Random gen = new Random(); gen.nextDouble();` from the <word data-key="random">Random class</word>:

    Math.random();      // 0.753596711450498
    Math.random();      // 0.35743909737853485
    Math.random();      // 0.1801937322144781

##Variables
Java's `Math` class also has a few constants that might be useful:

###e
`E` returns the value of [e](http://en.wikipedia.org/wiki/E_(mathematical_constant), the base of [natural logarithms](http://en.wikipedia.org/wiki/Natural_logarithm):

    Math.E;             //  2.71828

###Pi
`PI` returns the value of [pi](http://en.wikipedia.org/wiki/Pi):

    Math.PI;            // 3.141592653589793
