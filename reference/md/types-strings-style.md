# String styling
Strings also have a few built-in procedures that let you re-style the characters. Maybe you want to convert all of a String's letters to lower case?

    String greeting = "Hello there";
    greeting = greeting greeting.toLowerCase();
    greeting;
    "hello there"

Or upper case?

    String greeting = "Hello there";
    greeting = greeting.toUpperCase();
    greeting;
    "HELLO THERE"

Can you write word that assigns the value "New York, NY" to a variable and then store the same value, though in lower case letters, in the same variable?

    String city = "New York, NY";
    city = city.toLowerCase();
    city;
    "new york, ny"

What is the output of `"I'm so excited".toUpperCase();"?

    "I'm so excited".toUpperCase();
    "I'M SO EXCITED"
