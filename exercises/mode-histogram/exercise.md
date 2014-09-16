Write <word data-key="function">method</word> `isMode` which returns <word data-key="true">true</word> if data[k] is larger than data[k-1] and larger than data[k+1]; otherwise, it returns <word data-key="false">false</word>.

In the example above, the call isMode(A, 4) <word data-key="_return">returns</word> true and the call isMode(A, 5) returns false. 

Write method `modeIndex` which returns the index of the mode of data. You may assume that data is unimodal and the mode occurs at an index k, where 
0 < k < data.length() – 1. In the example above, the call modeIndex(A) returns 4. 

Write method `printHistogram` which returns a <word data-key="string">String</word> containing a character histogram of a unimodal array of nonnegative values, data, such that the longest bar of the histogram (the mode) has longestBar characters barChar, and all other bars have a number of barChar characters proportional to the corresponding value in the array data (rounding down)