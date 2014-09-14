# Declaring variables
Multiple variables can be declared on one line if you'd like to save space. For example:

    int first = 5, second;
    first;                                      //    5
    second;                                     // Uninitialized
    second = 10;
    second;                                     // 10
    int sum = first + second;
    sum;                                        // 15

Above, we declared the variables `first` and `second` on the same line, but we only initialized `first` with a value – in this case, the value `5`. Though `second` is a valid variable, it didn't have a value until line 6, which is why the interpreter yelled when we asked it to evaluate its non-existent value on line 4. On line 9, we declared a variable called `sum` and initialized it with a value – the sum of the values of the variables `first` and `second`, which happened to evaluate to `15`.

Variables can only have one value at once, but which value they have can change (or vary). For example:

    number                                         // 4
    number = 10
    number                                         // 10

Now, whenever you type `number`, you'll get back `10`, because that's the variable's current value. You might notice we didn't have to tell the interpreter that our `number` variable is an integer this time. That's because we told the interpreter that `number` was an integer before, and the interpreter remembered that.
