#Overloading methods

Imagine we had two <word data-key="method">methods</word> to convert a temperature from degrees fahrenheit to degrees celsius. One took in an int and the other a double:

    celsiusTempConverted(int degreesF){
        // converted a temperature, stored as an int in degrees fahrenheit, to celsius.
    }
    celsiusTempConverted(double){
        // converted a temperature, stored as a doubel in degrees fahrenheit, to celsius.
    }

This is legal Java; method names can be the same (as these are, `celsiusTempConverted`) but method signatures – the name and the parameter type(s) – must be different.

If a method name takes different parameters, like `celsiusTempConverted` above, we say that method has been <word data-key="overloaded">overloaded</word>. The Java complier uses the parameter types to tell apart overloaded methods. For example:

    celsiusTempConverted(32);         // calls the celsiusTempConverted(int) method
    celsiusTempConverted(32.3);       // calls the celsiusTempConverted(double) method

Or, more verbose: when you call `celsiusTempConverted(32)`, the Java compiler scans over the methods it can see, looking for something in the format `celsiusTempConverted(int)`. When it finds a match, it calls that method with the parameter you passed (in this case, `32`.)

Method signatures don't consider return types, which means you can't have two methods with the same name, same parameters, and different return types. This, for example, would result in a <word data-key="compiler-error">compiler error</word>:

    int celsiusTempConverted(int);
    double celsiusTempConverted(int);

because Java would interpret both of their signatures as:

    celsiusTempConverted(int);

and wouldn't know which to use.
