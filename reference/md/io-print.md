#Printing

When programming, it is useful to print information to the terminal screen/console output window. 

Here is a basic example of printing to the screen: 
  
    System.out.println("Hello World!");         // prints Hello World! on its own line

The `System` part of the statement accesses all of the methods/classes associated with the `System` <word data-key="class">class</word>. The `out` part accesses all of the methods/classes related to output. `println` is a method contained in `System.out`. It is abbreviated and stands for "Print Line," or "print the following information and then a new line." 

The new line comes from outputing a `\n`, or newline character, which is like pressing enter on your keyboard. You can use the `System.out.print method` if you do not want to print a newline character by default, like this:

    System.out.print("Hello World!");           // prints Hello World! on the line

You might use a print statement if your program takes an integer `dollarAmount` from the user, then prints the final amount with sales tax / meals tax to the screen. 
