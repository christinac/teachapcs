# Math operators
Java provides five math operators, familiar from mathematics:

<table class="table table-striped">
    <tr>
        <td> + 
        </td>
        <td>Addition
        </td>        
    <tr>
        <td> - 
        </td>
        <td>Subtraction
        </td>        
    <tr>
        <td> * 
        </td>
        <td>Multiplication
        </td>        
    <tr>
        <td> / 
        </td>
        <td>Division
        </td>        
    </tr>
    <tr>
        <td> % 
        </td>
        <td>Modulus (remainder of integer/floating point division)
        </td>        
    </tr>
</table>

## Addition, subtraction, and multiplication
Addition, subtraction, and multiplication work like you've seen elsewhere:

    2 + 5 = 7
    5.2 + 8.1 = 13.3
    4 - (-2) = 6
    13.23 - 1.179 = 12.051
    10 * 8 = 80
    4.82 * 4 = 19.28

## Division 
Division can be trickier because if you're dividing two <word data-key="int">int</word>s, the answer will also be an int, a whole number. (The decimal is cut off.) If at least one of the numbers is a <word data-key="double">double</word>, your answer will also be a double.

    11 / 2 = 5
    // int division; the 0.666666.. is dropped
    
    11.0 / 3 = 3.66666666..
    11 / 3.0 = 3.66666666..

## Modulus
The modulus operator returns the remainder of dividing the first number by the second: 

    10 % 3 = 1
    20 % 2 = 0
    1 % 3 = 1
    25.5 % 2.25 = 0.75
