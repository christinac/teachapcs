#Using for loops
Here's a procedure that prints the set of odd integers between 1 and 9:

    for(int i = 1; i<10; i+=2){
        System.out.println(i);
    }

Here's another procedure that also prints the set of odd integers between 0 and 9:

    for(int i = 1; i<10; i++){
        if (i % 2 == 1){
            System.out.println(i);
        }
    }

Here's a procedure that sums the numbers between 0 and 100:

    int sum = 0;
    for(int i = 0; i < 100; i++){
        sum+=i;
    }
    sum;
    4950

Here's another that calculates the factorial of 10, when 10! = 10 * 9 * 8 * ... * 1

    int factorial = 1;
    for(int i = 10; i > 0; i--){
        factorial *= i;
    }
    factorial;
    3628800
