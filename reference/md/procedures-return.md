# Returning from methods

    public double fahrenheitTempConverted(double celsiusTemp){
        double degreesFahrenheit = 9/5 * celsiusTemp + 32;
        return degreesFahrenheit;
    }

Let's step through this word by word:

- `public` is the access specifier, and it determines which objects can call the `fahrenheitTempConverted` function. There's several access specifiers, but for now: <word data-key="public">public</word> means "anyone can use this function."
- `double` is the <word data-key="type">type</word> of the "thing" the method returns; it's the method's return type. This is just a warning though; to <word data-key="_return">return</word> something from the method, we need to include a `return <data>` statement somewhere in the method. Otherwise, we'll get a <word data-key="compiler-error">compiler error</word>.
- `fahrenheitTempConverted` is the method's name.
- `(double celsiusTemp)` is the parameter list. The <word data-key="parameter">parameter list</word> is always surrounded by parentheses, and the list's items are separated by commas. If the list is empty, the parentheses remain: `()`. Parameters are variables, defined only in that method. They're often used to pass information to the function.
- `double degreesFahrenheit = 9/5 * celsiusTemp + 32;` and `return degreesFahrenheit;` is the method body. Each line ends with a semicolon (`;`) and is a complete Java statement. The method body is surrounded by curly braces.
- `return` is a Java keyword that means "send back whatever is on this line." Since we declared the method's <word data-key="_return">return</word> type to be a `double`, Java expects that whatever follows the `return` keyword to be a <word data-key="double">double</word>.