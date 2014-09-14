Write a script that starts with a <word data-key="string">String</word> variable called `name` that's equal to your name, written in lower case letters, and converts your name into "title case" and "swap case."

More tangibly, that means:

<table class="table table-striped">
    <thead>
        <tr>
            <td>Value of <code>name</code></td>
            <td>Title case</td>
            <td>Swap case</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>anthony</td>
            <td>Anthony</td>
            <td>aNTHONY</td>
        </tr>
        <tr>
            <td>barbara</td>
            <td>Barbara</td>
            <td>bARBARA</td>
        </tr>
        <tr>
            <td>christina</td>
            <td>Christina</td>
            <td>cHRISTINA</td>
        </tr>
        <tr>
            <td>david</td>
            <td>David</td>
            <td>dAVID</td>
        </tr>
    </tbody>
</table>

Your program should work no matter what value `name` holds, which means you'll want to avoid <word data-key="str-replace">replacing</word> any pieces of the String. Instead, stick to the <word data-key="str-uppercase">toUpperCase</word> and <word data-key="str-lowercase">toLowerCase</word>, and <word data-key="str-substring">substring</word> methods.