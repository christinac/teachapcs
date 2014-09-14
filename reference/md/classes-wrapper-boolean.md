#Boolean
The `Boolean` class is a <word data-key="wrapper">wraps</word> <word data-key="boolean">boolean</word> primitives into `Boolean` <word data-key="object">objects</word>.

## Creating a Boolean object
The <word data-key="new">constructor</word> for Boolean objects takes one of four values: 

A `true` or `false` primitive:

    Boolean b = new Boolean(false);
    b;                                  // Returns false

A variable of a boolean primitive:

    Boolean b = true;
    Boolean c = new Boolean(b);
    b;                                  // Returns true

Another Boolean object:

    Boolean b = new Boolean(false);
    b;                                  // Returns false
    Boolean c = new Boolean(b);
    c;                                  // Returns false

Simple assignment:

    Boolean b = true;                 // Returns true; b is a Boolean object
    boolean c = true;                 // Returns true; c is a boolean primitive