A [mode](https://www.khanacademy.org/math/cc-seventh-grade-math/cc-7th-probability-statistics/cc-7th-central-tendency/v/statistics-intro-mean-median-and-mode) is a value in an <word data-key="array">array</word> that is larger than both the value immediately before it in the array and the value immediately after it. 

In other words, a mode occurs at index k in the array A if A[k] > A[k-1] and A[k] > A[k+1]

The array is [unimodal](http://mathworld.wolfram.com/Unimodal.html) if the value increase until they reach a mode, then decrease, so that there is only one mode. 

For example, the array A shown below is unimodal with its mode occurring at index 4:

    Index k A[k]
    0       3 
    1       5 
    2       9 
    3       10 
    4       12 
    5       11 
    6       9 
    7       4 

Assume that the mode does not occur at the first or last entry in the array.