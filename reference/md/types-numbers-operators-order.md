# Order of operations
Math in computer science follows the rules you already know about the order in which calculations should be performed:

1. First, do things in parentheses
2. Then, calculate the exponents 
3. Multiply, divide, and modulo afterward
4. Finally, add and subtract
5. <word data-key="casting">Cast</word> at the very end.

For example:

    2 + 5 * 2               // 12
    2 + 8 * 4 % 6 - 4       // 30
    5 + 36 % 6 - 10         // 1
    (5 + 6) / (11 - 9.0)    // 5.5
    (double)(3/4)           // 0.0
