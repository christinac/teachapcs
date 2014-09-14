"Chaining methods together" is a way of calling one after the other, without storing the intermediate results in variables. For example:

    String name = "Jenny";
    String lowered = name.toLowerCase();
    lowered.substring(1,2);             // returns e

Which is the same as:

    "Jenny".toLowerCase().substring(1,2);