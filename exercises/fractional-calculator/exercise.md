 - No numbers in the fraction will exceed the limits of a Java int (between -2,147,483,648 and 2,147,483,647) after they are multiplied – which means the input will be between -32,768 and 32767.
 - As you make changes think about how you are going to ensure all different scenarios still work. In other words figure out how you want to test this in advance.

##Checkpoint 1: 10 Points
Accept fraction string as input and display corresponding improper fraction.

    Enter the fraction: 1_1/2
    Improper Fraction: 3/2
    Goodbye!

Breakdown of Points:

*  2 Points: Comments: Header, Methods, Logic
*  1 Points: Proper formatting/Indentation
*  3 Points: Handling Whole number, fractions, Mixed Numbers
*  2 Points: Calculating Correct improper fraction
*  1 Points: Correct input/output formatting
*  1 Points: Breaking into reusable code for future checkpoints


##Checkpoint 2: 20 Points
Parsing the fractions: displays mixed and improper fractions and operation entered. Interpret Quit command: exit on this command otherwise continue processing.

    Enter an expression (or "quit"): 1/4 + 1_1/2
    Fraction 1: 1/4 = 1/4
    Operator: +
    Fraction 2: 1_1/2 = 3/2
    Enter an expression (or "quit"): quit 
    Goodbye!

Breakdown of Points:

*  4 Points: Comments, formatting, Indentation, modular code o 3 Points: Handling Whole number, fractions, Mixed Numbers o 2 Points: Calculating Correct improper fraction
*  4 Points: Correct Parsing of Equation String
*  2 Points: Handling Quit
*  3 Points: Correct loop implementation
*  2 Points: Correct input/output formatting

##Checkpoint 3: 20 Points
Do one operation (+) fully functional including improper, mixed fractions.
Welcome to the Fraction Calculator!

    Enter an expression (or "quit"): 1_1/2 + 1/4
    1_3/4
    Enter an expression (or "quit"): 8/4 + 2
    4
    Enter an expression (or "quit"): quit
    Goodbye!
  
Breakdown of Points:

*  3 Points: Comments, formatting, Indentation, modular code
*  2 Points: Handling Whole number, fractions, Mixed Numbers
*  3 Points: Correct loop implementation, Quit
*  2 Points: Correct Parsing of Equation String
*  2 Points: Calculating Correct improper fraction
*  3 Points: Correct Addition implementation
*  3 Points: Correct Result calculation in reduced format
*  2 Points: Correct input/output formatting


##Final Submission: 50 Points
Everything should work as described in section 2.

Breakdown of Points:

*  5 Points: Comments, formatting, Indentation, modular code
*  5 Points: Handling Whole number, fractions, Mixed Numbers
*  4 Points: Correct loop implementation, Quit
*  5 Points: Correct Parsing of Equation String
*  10 Points: All operations implementation
*  5 Points: Calculating Correct improper fraction
*  10 Points: Correct Result calculation in reduced format
*  5 Points: Correct input/output formatting
*  6 Points: Handling corner cases (divide by 0, wrong fractions etc)

##Extra Credit:

- 5 points: calculators that can handle more than one operation (e.g. 1 + 1 + 1 - 1/2)
- 5 points: correctly handling the order of operations with more than two inputs (e.g. 1 - 2 * 4 returning -7 instead of -4)
- 5 points: handling bad input gracefully (e.g. 1 + + 1/2 does not cause the program to crash)
- 10 points: an infinite precision calculator. This means your calculator can handle very large numbers and still produce the right results. You may look at Java BigInteger class. This involves a lot of extra work, so consider it carefully or do it only after you have finished the required parts.

Additional extra credit for other advanced behavior based on complexity and completeness. Maximum extra credit available 30 points.
