# Converting primitives to strings
Java's static `toString(int)` and `toString(double)` <word data-key="method">methods</word> turn an <word data-key="int">int</word>, <word data-key="double">double</word>, or <word data-key="boolean">boolean</word> into a <word data-key="string">String</word>.

    int i = 104;
    String s = Integer.toString(i);
    // s now has the value "104"

    double d = 994.4;
    String t = Double.toString(d);
    // t now has the value "994.4"

More generally, it looks like:

    String <stringName> = <WrapperClassName>.toString(<primative>);