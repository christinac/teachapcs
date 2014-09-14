#toString()
Most objects in Java have a `toString()` method, which returns a `String`-ified version of the object. This is one of the methods that you will most frequently <word data-key="override">override</word>, since only you know how to display the objects you <word data-key="constructor">construct</word>.

Some things in Java are *self evaluating*, which means they'll return themselves. You may've realized this initially, when we were evaluating primative data types - <word data-key="int">ints</word>, <word data-key="double">doubles</word>, and <word data-key="boolean">booleans</word>:

    System.out.println(true);           // Prints 'true'
    System.out.println(42);             // Prints 42
    System.out.println(87.18);          // Prints 87.18

<word data-key="string">Strings</word> are also self-evaluating: 

    String greeting = "Hello";
    System.out.println(greeting);           // Prints "Hello"
    String goodbye = new String("Goodbye");
    System.out.println(goodbye);            // Prints "Goodbye"

Arrays and other "container" objects are self-evaluating if they contain self-evaluating objects. For example, an array of `boolean`s is self evaluating, while an array of `Car`s is not.
