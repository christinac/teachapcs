# Converting between wrapped types
Wrapped primitives can be converted to and from Strings, whereas "normal" primitives can't be. For example:

    String s = "159";
    int i = Integer.parseInt(s);
    // Now, i has the value 159

A few things to notice:

`parseInt(String)` returns an `int`, not a wrapped `Integer`. If we wanted an `Integer`, we'd have to make it:

    String s = "159";
    int i = Integer.parseInt(s);
    Integer j = new Integer(i);

or more succinctly: 

    Integer i = new Integer(Integer.parseInt(s));

The `String` class has another method, `valueOf(string)`, that returns an `Integer`:

    String s = "4884";
    Integer i = Integer.valueOf(s);
    // i has the value 4884

If we give `valueOf(string)` a bad <word data-key="string">String</word> we'll get a <word data-key="runtime-exception">runtime exception</word>:

    String willBreak = "I'm going to break!";
    int i = Integer.parseInt(willBreak);
    java.lang.NumberFormatException: for input string s

In practice, there's no difference between `valueOf(string)` and `new Integer(Integer.parseInt(string))`; use whichever makes your code easier to read.