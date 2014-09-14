# Length of arrays
Arrays remember their own length, which saves you from having to count each element. Each array has a <word data-key="instance">instance variable</word> `length`:

    String[] names = new String[25];
    names.length;               // returns 25

An array's `.length` is a variable, not a method, so you don't need parentheses to use it.