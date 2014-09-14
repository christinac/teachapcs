It can be hard to <word data-key="debug">debug</word> a program that has something random because you can't tell if the output is changing because of a bug or because of the randomness.

One tactic is making your program *not* random temporarily. Just replace the random part with a fixed number and a <word data-key="comment">comment</word>, like this:

    int temperature = 85; // getTemperature();

Once you think you have the program working without the randomness, add it back in.