#while loops
While loops ask the program to do something *while* something else is true. For example:

    int age = 15;
    while(age < 18){
        System.out.println("Age is " + age);
        age++;
    }

    "Age is 15"
    "Age is 16"
    "Age is 17"

Translated into English, we're saying that while `age` is less than 18:
1. Print a sentence that's "Age is " and then the value of the `age` variable
2. Increment age by 1. (Remember `age++` is the same as `age=age+1`)

More generally, they look like:

    while(<expression is true>){
        <statement>;
    }