#Concatenating strings
Java uses <word data-key="+">+</word> to concatenate, or add, strings.

    String favorite = "Art History"
    favorite = favorite + " is fun!";
    favorite                                // "Art History is fun!"

As strings are <word data-key="immutable">immutable</word>, concatenation re-assigns the variable's reference rather than changing its value.

String concatenation works so long as all the item's you're assigning can be turned into strings:

    String sentence = "My favorite number is ";
    int favNum = 3;
    String sentence = sentence + favNum;
    sentence;                                      // "My favorite number is 3"
