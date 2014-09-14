#Casting
Converting between two different data types is called casting, and it looks like this in practice: 

    (int) 11.0           // = 11
    (int) 11.84          // = 11
    (double) 11          // = 11.0
    (double) 11/2        // = 5.5

Or this generally: 

    (type) value

Casting has to do with how the computer stores <word data-key="byte">information</word>; it's basically your way of telling the computer "yes, I know I'm changing the type and storing less information here. That's OK."

If you want the computer to store more information than it had been, as when you convert an <word data-key="int">int</word> to a <word data-key="int">double</word>, you don't need to cast: the computer simply keeps what you had and appends whatever specificity it needs:

    int i = 94;
    double d = i;
    d;                  // d = 94.0

If you want to store less information, like going from a `double` to an `int`, you need to tell the computer you understand you're dropping information – you need to cast.

    double d = 94.19;
    int i = (int) d;
    i;                  // i = 94

Writing `(int)` is the cast: it's shorthand for "make whatever is on the right of the parentheses into an int."

If you try the same calculation without a cast:

    double d = 94.19;
    int i = d;
    ERROR: Type mismatch: cannot convert from double to int

Java will <word data-key="runtime-error">throw an error</word> because it wants you to be really, really sure you're okay with losing information.

Here's a few other examples:

<table class='table table-striped'>
    <thead>
        <tr><td>n</td><td>(int) n</td><td>(double) n</td></tr>
    </thead>
    <tbody>
        <tr><td>4</td><td>4</td><td>4.0</td></tr>
        <tr><td>12.9</td><td>12</td><td>12.9</td></tr>
        <tr><td>10/3</td><td>3</td><td>3.333333</td></tr>
        <tr><td>2.5 * 12 </td><td>27</td><td>27.5</td>
    </tr>
    </tbody>
</table>
