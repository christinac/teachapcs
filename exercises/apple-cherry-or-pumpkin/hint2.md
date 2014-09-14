Let's re-write the table in terms of `i`: 

<table class='table table-striped'>
    <thead>
        <tr><td>i</td><td>Multiply</td><td>Add</td><td>~Pi</td></tr>
    </thead>
    <tbody>
        <tr><td>1</td><td>1 (= -1<sup>2</sup>)</td><td> 
<sup>4</sup>/<sub>(2*1-1)</sub></td><td>4</td></tr>
        <tr><td>2</td><td>-1 (= -1<sup>3</sup>)</td><td> 
<sup>4</sup>/<sub>(2*2-1)</sub></td><td>~2.666</td></tr>
        <tr><td>3</td><td>1 (= -1<sup>4</sup>)</td><td> 
<sup>4</sup>/<sub>(2*3-1)</sub></td><td>~3.466</td></tr>
        <tr><td>4</td><td>-1 (= -1<sup>5</sup>)</td><td> 
<sup>4</sup>/<sub>(2*4-1)</sub></td><td>~2.895</td></tr>
        <tr><td>5</td><td>1 (= -1<sup>6</sup>)</td><td> 
<sup>4</sup>/<sub>(2*5-1)</sub></td><td>~3.339</td></tr>
        <tr><td>6</td><td>-1 (= -1<sup>7</sup>)</td><td> 
<sup>4</sup>/<sub>(2*6-1)</sub></td><td>~2.976</td></tr>
    </tbody>
</table>

Now that's starting to look a bit more like something that could be turned into a <word data-key="for">for loop</word> ... all that's left is turning the exponents (like -1<sup>3</sup>) and denominators (like (2*3 - 1)) into expressions with `i`s.