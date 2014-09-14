# String comparisons
`compareTo(String)` compares to calling `String` object to the `String` argument and returns a number indicating which String is first in lexigraphical ordering. (Lexigraphical order is the ordering that dictionaries use: A, B, C, ... X, Y, Z, a, b, c, ... x, y, z.)

Which numbers are returned? `0` if the two strings are equal, "something negative" (`<0`) if the calling string is larger, and "something positive" (`>0`) if the argument string is larger.

    String mTitle = "Jessica";
    String mLower = "jessica";
    String sTitle = "Stephanie";
    String cTitle = "Amy";

    mTitle.compareTo(mTitle);
    0
    mTitle.compareTo(mLower);
    -32
    mLower.compareTo(mTitle);
    32
    cTitle.compareTo(mTitle);
    -9
    cTitle.compareTo(mLower);
    -41
    sTitle.compareTo(mTitle);
    9
    sTitle.compareTo(mLower);
    -23
