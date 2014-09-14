# Constructing a String
To make a string, you can enclose text on the same line in double quotation marks (`"` and `"`) as if they were a <word data-key="primitive">primitive</word>:

    String favorite = "Computer Science";

Or, you can initialize them as you would an <word data-key="object">object</word>:

    String favorite = new String("Computer Science");

Strings can be empty. Here's two ways to define an empty string:

    String empty = "";
    String alsoEmpty = new String();

String objects are <word data-key="immutable">immutable</word> – there's no way to change them once they've been made – but their <word data-key="references">references</word> can be reassigned:

    String favorite = "Computer Science";
    // favorite is "Computer Science"
    favorite = "Art History";
    // favorite is now "Art History"

The third line reassigns the `favorite` variable from "Computer Science" to "Art History".
