Let's write the first few terms in a table to get a better sense for what's happening:

<table class='table table-striped'>
    <thead>
        <tr><td>i</td><td>Equation</td><td>Approximation</td></tr>
    </thead>
    <tbody>
        <tr><td>1</td><td>+ <sup>4</sup>/<sub>1</sub></td><td>4</td></tr>
        <tr><td>2</td><td>+ <sup>4</sup>/<sub>1</sub> - <sup>4</sup>/<sub>3</sub></td><td>~2.666</td></tr>
        <tr><td>3</td><td>+ <sup>4</sup>/<sub>1</sub> - <sup>4</sup>/<sub>3</sub> + <sup>4</sup>/<sub>5</sub></td><td>~3.466</td></tr>
        <tr><td>4</td><td>+ <sup>4</sup>/<sub>1</sub> - <sup>4</sup>/<sub>3</sub> + <sup>4</sup>/<sub>5</sub> - <sup>4</sup>/<sub>7</sub></td><td>~2.895</td></tr>
        <tr><td>5</td><td>+ <sup>4</sup>/<sub>1</sub> - <sup>4</sup>/<sub>3</sub> + <sup>4</sup>/<sub>5</sub> - <sup>4</sup>/<sub>7</sub> + <sup>4</sup>/<sub>9</sub></td><td>~3.339</td></tr>
        <tr><td>6</td><td>+ <sup>4</sup>/<sub>1</sub> - <sup>4</sup>/<sub>3</sub> + <sup>4</sup>/<sub>5</sub> - <sup>4</sup>/<sub>7</sub> + <sup>4</sup>/<sub>9</sub> - <sup>4</sup>/<sub>11</sub></td><td>~2.976</td></tr>
    </tbody>
</table>

Okay. Two things stand out: 

1. The equation goes back and forth between adding and subtracting the next term. That's similar to multiplying by `1` or `-1` ... or maybe multiplying each term by `-1 * (loop + 1)`?
2. As `i` goes up by 1, the fraction's denominator increases by 2. How can we turn `1 --> 1`, `2 --> 3`, `3 --> 5`, etc.?