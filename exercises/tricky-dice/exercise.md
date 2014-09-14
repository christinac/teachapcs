Below is a simple script that uses Java's built in <word data-key="random">random number generator</word> to make a dice. Specifically, it:

1. Creates a new Random number generator, and saves it in a variable called `gen`.
2. Asks `gen` to give its next integer in the range [0, 6). Then, we add 1 to what the `nextInt` function returns, because we want our dice to give back 1, 2, 3, 4, 5, or 6.

That makes a normal dice from code.

Let's make a tricky dice instead. It's up to you how to do this, but there's a few rules (even for tricky die):

1. A dice is "tricky" when the likelihood of it giving back a 1, 2, 3, 4, 5, or 6 isn't equivalent – as in, it'll give back a 6 more than 18.33% of the time (on average.)
2. Your dice can only give back 1, 2, 3, 4, 5, or 6 – we want this to *seem* like a valid dice at first.
3. Which numbers your dice over-emphasizes, and which it understates, is entirely up to you.``