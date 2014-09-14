# Debugging math
If `NaN` pops up unexpectedly, there's probably an error in your math. One way to debug math errors is by evaluating expressions piece by piece. For example:

    int students = 10 * 10;
    int tables = 4 / 4 - 1;
    int studentsPerTable = students / tables;
    System.out.println("studentsPerTable is " + studentsPerTable);  // prints NaN

Let's go through all the variables:

    System.out.println("students is " + students);
    "students is 100"

    System.out.println("tables is " + tables);
    "tables is 0"       // Ah ha!

If we look at the line that declared the `tables` variable again:

    int tables = 4 / 4 - 1;

Oops – we missed a set of parentheses, and it should've been: 

    int tables = 4 / (4 - 1);
