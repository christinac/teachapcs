#Escaping strings
Since we denote strings with double quotes (`"` and `"`), we need to do something special to save a string *with* double quotes:

    String question = "Which is your \"favorite\" number?";

A backslash escapes a `"` character. "Escaping" means treating the `"` as a normal character, rather than as part of the programming language.

What if we want to include include a backslash in our string? By using another backslash to anti-escape the first! For example:

    String sentence = "A backslash looks like this: \\.";
    sentence;                       // "A backslash looks like this: \."

