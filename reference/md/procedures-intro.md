#Functions introduction
Functions are ways to group several statements together. Grouping statements into methods could save you time when programming and make your program more <word data-key="legible">legible</word>.

Here's an example of a method. This one adds 2 to whatever it's passed:

    addsTwo(int initial){
        return initial + 2;
    }

Like math, in programming, functions don't do anything on their own; they just sit there, waiting to be used.

Sometimes in computer science, people say "call a method" to mean "use a function." The two phrasings are equivalent. To call a method, simple write its name and pass it the necessary <word data-key="parameter">parameters</word>:

    addsTwo(5);         // returns 7
    addsTwo(0);         // returns 2
    addsTwo(-3);        // returns -1

Calling the `addsTwo` method made the computer jump into action and run our statement.
