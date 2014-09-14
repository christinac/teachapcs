#Constant variables
"Constant variables" isn't a misnomer; they actually end up fairly useful to refer to values that don't change. Java indicates a variable can't change with the keyword <word data-key="final">final</word>.

    final double PI = 3.14159265;
    final int MAX_CLASS_SIZE = 30;
    final String TEACHER_NAME = "Charles Babbage";

`final` variables can receive one value. If you try to reassign the variable later, you'll get a compile-time error:

    final int MAX_CLASS_SIZE = 30;
    MAX_CLASS_SIZE = 35;
    ERROR The final field MAX_CLASS_SIZE cannot be assigned

It's convention, but not required, that the names of final variables are written in capital letters, with words separated by an underscore (`_`). This style makes it clear to you and anyone reading your word that these variables can't change.