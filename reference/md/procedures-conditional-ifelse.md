# If-else statements 
`if` and `if ... else` statements give simple instructions:

    if (/* It's cold outside */){
        /* Put on a coat */
    }

or 

    double temperature = 45.3;
    if (temperature < 50.0){
        putOnACoat();
    }

`else` statements are used if you want to do something *else*:

    double temperature = 45.3; 
    if (temperature < 50.0){
        putOnACoat();
    }else{
        goOutside();
    }

More generally, if-else statements look like:

    if (<expression>){
        <statement>;
    }else{
        <otherStatement>;
    }

and can include as many "layers" of `else if`s as you'd like:

    if (<expression>){
        <statement>;
    }else if(<otherExpression>){
        <otherStatement>;
    }else{
        <anotherStatement>;
    }

The `<expression>` inside the `if` or `else if` parentheses should evaluate to either <word data-key="true">true</word> or <word data-key="false">false</word>. Think of converting the Java-ish to English as you read it: "if true" or "if x equals 4" makes more sense than, "if 4."