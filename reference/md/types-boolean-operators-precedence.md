#Boolean operator precedence
Boolean operators, like mathematical ones, have an order of operations. When you're solving a boolean expression, follow this ordering:

1. `!`
2. `(` and `)`
3. `==` and `!=`
4. `&&`
5. `||`
6. The <word>relational operators</word> and <word>arithmetic operators</word>.

Let's test that with a few more boolean expressions:

<table class="table table-striped">
    <thead>
        <tr>
            <td>Original</td>
            <td>Simplified</td>
            <td>Answer</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>!true || false</td>
            <td>false || false</td>
            <td>false</td>
        </tr>
        <tr>
            <td>true || false && true</td>
            <td>true || false</td>
            <td>true</td>
        </tr>
        <tr>
            <td>true == false && false</td>
            <td>true == false</td>
            <td>false</td>
        </tr>
        <tr>
            <td>true != false || true</td>
            <td>true != true</td>
            <td>false</td>
        </tr>
    </tbody>
</table>