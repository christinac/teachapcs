#Two-dimensional arrays
Just as we can put <word data-key="int">int</word>s or <word data-key="string">String</word>s in an array, so too can we put arrays in an array. When we put arrays in an array, we say we have a two-dimensional array.

Here's what a two-dimensionsional array might look like:

    boolean[][] board = new boolean[5][5];

    // [false] [false] [false] [false] [false] 
    // [false] [false] [false] [false] [false] 
    // [false] [false] [false] [false] [false] 
    // [false] [false] [false] [false] [false] 
    // [false] [false] [false] [false] [false] 

    board[2][1] = true;

    // When assigning to an array, start counting rows first, then columns, and remember each starts at 0.

    // [false] [false] [false] [false] [false] 
    // [false] [false] [true] [false] [false] 
    // [false] [false] [false] [false] [false] 
    // [false] [false] [false] [false] [false] 
    // [false] [false] [false] [false] [false] 

    board [4][2] = true;

    // [false] [false] [false] [false] [false] 
    // [false] [false] [true] [false] [false] 
    // [false] [false] [false] [false] [true] 
    // [false] [false] [false] [false] [false] 
    // [false] [false] [false] [false] [false] 

    board.length;
    5

    board[0].length;
    5
    board[1].length;
    5
    board[4].length;
    5

A single for loop is the best tool to cycle through a one-dimensional array, and nested for loops are the best tools to cycle through a two-dimensional array:

    int[][] counts = new int[2][2];

    counts[0][0] = 0;
    counts[0][1] = 1;
    counts[1][0] = 2;
    counts[1][1] = 3;

    // Which looks like:
    // [0] [1]
    // [2] [3]

    for(int i = 0; i < counts.length; i++){
        for(int j = 0; j < counts[i].length; j++){
            System.out.println(counts[i][j] + " for i: " + i + " and j: " + j);
        }
    }

    0 for i: 0 and j: 0
    1 for i: 0 and j: 1
    2 for i: 1 and j: 0
    3 for i: 1 and j: 1

Can you construct a 10 x 10 two-dimensional array that alternates between `boolean` values of `true` and `false` in each square? When you're done, your program should look like: 

    // [false] [true] [false] [true] [false] [true] [false] [true] [false] [true]
    // [true] [false] [true] [false] [true] [false] [true] [false] [true] [false]
    // [false] [true] [false] [true] [false] [true] [false] [true] [false] [true]
    // [true] [false] [true] [false] [true] [false] [true] [false] [true] [false]
    // [false] [true] [false] [true] [false] [true] [false] [true] [false] [true]
    // [true] [false] [true] [false] [true] [false] [true] [false] [true] [false]
    // [false] [true] [false] [true] [false] [true] [false] [true] [false] [true]
    // [true] [false] [true] [false] [true] [false] [true] [false] [true] [false]
    // [false] [true] [false] [true] [false] [true] [false] [true] [false] [true]
    // [true] [false] [true] [false] [true] [false] [true] [false] [true] [false]

    boolean[][] board = new boolean[10][10];
    for(int i = 0; i < board.length; i++){
        boolean first = i % 2 == 1;
        for(int j = 0; i < board[i].length; i++){
            board[i][j] = first;
            first = !first;
        }
    }


