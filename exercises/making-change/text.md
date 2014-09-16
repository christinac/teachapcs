Some cash register systems use automatic change machines where the coinage is automatically dispensed. This lab will investigate the problem solving and programming behind such machinery. 

You should use integer mathematics to solve this problem. You will need to extract the amount of cents from dollar amounts expressed in real numbers. 

This will require using the <word data-key="casting">type cast operator</word> and dealing with the approximate nature of real number storage. 

Here is an example:

    double purchaseAmount, cashPaid, temp;
    int change;
    ... data input stuff
    temp = cashPaid - purchaseAmount;
    temp = temp – (int) (temp);
    change = (int) (temp * 100);

    // Example Values (as done in a math class):
    // 8.06 = 30.00 - 21.94 
    // 0.06 = 8.06 - 8
    // 6 = (int) (0.06 * 100)

However, when the above example was run on a computer, the answer of 5 was given. Because real numbers are stored as approximations, the value of `change` comes out incorrect. You must investigate why and solve the problem.

You should solve this part of the problem **FIRST**, before you go on and calculate the correct number of quarters, dimes, nickels, and pennies.
