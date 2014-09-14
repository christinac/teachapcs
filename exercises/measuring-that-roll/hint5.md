If you try to access an <word data-key="array">array</word> element that doesn't exist – say the index is too large or small – you'll get an ArrayIndexOutOfBounds error.

For example, this code: 

    int numbers[] = new int[1];
    numbers[0] = 100;

    for(int i = 0; i < numbers.length; i++){
        System.out.println(numbers[i + 1]);
    }

will give an ArrayIndexOutOfBounds error, because `numbers[1]` doesn't exist.