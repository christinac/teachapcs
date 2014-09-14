# Wrapper classes
Each of Java's <word data-key="primitive">primatives</word> data types – <word data-key="int">int</word>, <word data-key="double">double</word>, and <word data-key="boolean">boolean</word> – can be "wrapped" in a class and become an <word data-key="object">object</word>. 

In general, wrapping a primitive looks like: 

    <WrapperClassName> <variableName> = new <WrapperClassName>(<primative>);

and in practice, it looks like:

    Double d = new Double(3.45);
    Integer i = new Integer(4);
    Boolean b = new Boolean(false);

There's wrapper classes for each type of primative:

<table class="table table-striped">
    <thead>
        <td>primitive</td>
        <td>Wrapper class</td>
    </thead>
    <tbody>
        <tr>
            <td>boolean</td>
            <td>Boolean</td>
        </tr>
        <tr>
            <td>int</td>
            <td>Integer</td>
        </tr>
        <tr>
            <td>double</td>
            <td>Double</td>
        </tr>
        <tr>
            <td>char</td>
            <td>Character</td>
        </tr>
    </tbody>
</table>