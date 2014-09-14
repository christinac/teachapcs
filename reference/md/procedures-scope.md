# Variable scope
When we're writing functions, we can declare and use variables wherever we like. Consider this example and output:

    int test = 10;

    public void mainTest(){
        System.out.println("Main test: " + test);
    }

    public void localTest(){
        int test = 20;
        System.out.println("Local test: " + test);
    }

    public void paramTest(int test){
        System.out.println("Param test: " + test);
    }

    public void paramTestFail(int test){
        int test = 4;           // ERROR: duplicate local variable test
        System.out.println("Param test: " + test);
    }

    mainTest();
    Main test: 10
    localTest();
    Local test: 20
    paramTest(30);
    Param test: 30

What's happening?

- Within the scope of the script we've written, `test` has a value of `10`, which was assigned at the top of the script.
- Within the function `localTest()`, `test` has a value of `20`, because the `int test = 20;` assignment supercedes the `int test = 10;` one performed outside the function.
- Within the function `paramTest`, the variable `test` refers to the function parameter, and it takes on whichever value it's passed. (In this case, it's `30`.)
- The last function, `paramTestFail(int)`, wouldn't compile. Instead, you'll see the error message "duplicate local variable test", which means the compiler's gotten confused by having two `int test`s. You'll have to rename one of the variables.
