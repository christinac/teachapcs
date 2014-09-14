#Casts and division
<word data-key="casting">Casting</word> becomes more important when we're doing math problems because Java's got two ways of doing division:

1. Floating point division
2. Integer division

## Floating point division
Floating point division is the division you know:

    3.0/4           // = 0.75
    5/4.0           // = 1.25
    1.0/4           // = 0.25

## Integer division
Integer division is a special kind of division that computers can do. In integer division, all answers are integers (whole numbers), and any decimals are dropped.

    3/4           // = 0
    5/4           // = 1
    1/4           // = 0

## Using each
Integer division happens when all the numbers being divided are integers. Floating point division's used when at least one number's a double.

You can also force floating point division with casts. Just keep in mind the order of operations!

    (double) 3/4       // = 0.75
    (double) 5/4       // = 1
    (double) (1/4)     // = 0.0 because integer division came before the cast
