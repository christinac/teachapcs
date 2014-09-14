#Truth tables
<a href="http://en.wikipedia.org/wiki/Truth_tables">Truth tables</a> are tools to generalize a logic expression, even as its arguments change. 

Here's the process behind making a truth table for the <word data-key="&&">&&</word> operator:

    boolean a = true;
    boolean b = true;
    a && b;                     // true

    a = true;
    b = false;
    a && b;                     // false

    a = false;
    b = false;
    a && b;                     // false

    a = false, b = true;
    a && b;                     // false

If we put that information into a table, we get a truth table:

<table class="table table-striped">
    <thead>
        <tr>
            <td>a</td>
            <td>b</td>
            <td>(a && b)</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>true</td>
            <td>true</td>
            <td>true</td>
        </tr>
        <tr>
            <td>true</td>
            <td>false</td>
            <td>false</td>
        </tr>
        <tr>
            <td>false</td>
            <td>true</td>
            <td>false</td>
        </tr>
        <tr>
            <td>false</td>
            <td>false</td>
            <td>false</td>
        </tr>
    </tbody>
</table>

From the truth table, it's easier to see that `(a && b)` is true only if both `a` *and* `b` are `true`. 

Here's the truth table for `(a || b)`:

<table class="table table-striped">
    <thead>
        <tr>
            <td>a</td>
            <td>b</td>
            <td>(a || b)</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>true</td>
            <td>true</td>
            <td>true</td>
        </tr>
        <tr>
            <td>true</td>
            <td>false</td>
            <td>true</td>
        </tr>
        <tr>
            <td>false</td>
            <td>true</td>
            <td>true</td>
        </tr>
        <tr>
            <td>false</td>
            <td>false</td>
            <td>false</td>
        </tr>
    </tbody>
</table>


`(a || b)` is true more often than `(a && b)`, as the <word>||</word> operator is more forgiving; only *one* of `a` and `b` are `true` in order for the entire expression to be `true`.

Every expression has a truth table. For example, here's one for `(!a || b && c)`:

<table class="table table-striped">
    <thead>
        <tr>
            <td>a</td>
            <td>b</td>
            <td>c</td>
            <td>(!a || b && c)</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>true</td>
            <td>true</td>
            <td>true</td>
            <td>true</td>
        </tr>
        <tr>
            <td>true</td>
            <td>true</td>
            <td>false</td>
            <td>false</td>
        </tr>
        <tr>
            <td>true</td>
            <td>false</td>
            <td>true</td>
            <td>false</td>
        </tr>
        <tr>
            <td>true</td>
            <td>false</td>
            <td>false</td>
            <td>false</td>
        </tr>
        <tr>
            <td>false</td>
            <td>true</td>
            <td>true</td>
            <td>true</td>
        </tr>
        <tr>
            <td>false</td>
            <td>true</td>
            <td>false</td>
            <td>true</td>
        </tr>
        <tr>
            <td>false</td>
            <td>false</td>
            <td>true</td>
            <td>true</td>
        </tr>
        <tr>
            <td>false</td>
            <td>false</td>
            <td>false</td>
            <td>false</td>
        </tr>
    </tbody>
</table>
