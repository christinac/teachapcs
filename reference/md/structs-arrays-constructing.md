#Making arrays
The easiest way to make an array is by enclosing its values in squiggly brackets (`{` and `}`), separated by commas:

    int a[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
    boolean b[] = {true, false, false};

Arrays can also be made by:



<ol>
    <li>Slowly listing out all the variables, index by index:<br/>
        <pre><code>int a[] = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        ...
        </code></pre>
</li><li>
Combining the squiggly-bracket shorthand and the <word data-key="new">new</word> syntax:<br/>
        <pre><code>int a[] = new int[]{0, 1, 1, 2, 3, 5, 8};
        </code></pre>
    </li>
</ol>
All three are equivalent ways of making an array.