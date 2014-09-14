Here's the basic outline of what we'll build:

1. A <code>Bottle</code> <word data-key="class">class</word>, which'll be <word data-key="public">public</word>. 
    2. A bottle has one attribute, a <code>String message</code>, that's added to the bottle when it's constructed.
    3. Bottles also have a <code>void scramble()</code> method that, when called, scrambles the letters in the message however you like. The scrambler should maintain all the letters in the message; they should be in a different order but all there. The scrambler should also work no matter what the bottle's message is – including when the bottle doesn't have a message.
2. An <code>Ocean</code> class that has one attribute: a private <word>array</word> of Bottles.
    3. Constructing a new Ocean should initilize the array.
    4. A <code>public Bottle retreiveOne()</code> method that pulls a bottle out of the ocean at random and prints its message.
    5. A <code>public void throw(Bottle b)</code> that adds the <code>Bottle b</code> to the array of bottles in the ocean.