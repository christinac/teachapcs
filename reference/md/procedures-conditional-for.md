#for loops
For loops tell the computer to do something *for* a set of a variable's values. They're particularly useful when we want the same "thing" done several times in succession.

Let's say, for example, we wanted to print out the numbers 0-5 in order. We could do that with several `System.out.println()` statement:

    System.out.println(0);              //      0
    System.out.println(1);              //      1
    System.out.println(2);              //      2
    System.out.println(3);              //      3
    System.out.println(4);              //      4
    System.out.println(5);              //      5

But this manual work is precisely the sort of thing for which a computer is well suited.

Here's some code that prints the whole numbers between 1 and 5, inclusive, using a for loop:

    for(int i = 0; i < 6; i++){
        System.out.println(i);
    }

    0
    1
    2
    3
    4
    5

Here's the general form of a for loop:

    for(<initializing>; <control>; <step>){
        <statement>;
    }

Let's look at the three pieces in the for loop's parentheses:

1. *Initializing*, e.g. `int i = 0`, is where the counter starts. The variable can be of any type, called anything, and start with any value, though `int`s called `i` or `j` are standard choices.
2. *Control*, e.g. `i < 6`, is a <word data-key="boolean">boolean</word> statement that tells us how long to continue the loop. We continue so long as this statement is `true`. (In this case, as long as `i` is less than 6.) If you write a control statement that never becomes false, your loop will continue forever – or, at least, until it crashes your program.
3. *Step*, e.g. `i++`, is how we change the value of `i` after all the code that's in the loop has executed. Even though the step expression appears before the statements inside the loop, the stuff inside the loop is executed first.

All for loops can be re-written as while loops. For example, our for loop above can be re-written as:

    int i = 0;
    while(i < 6){
        System.out.println(i);
        i++;
    }
