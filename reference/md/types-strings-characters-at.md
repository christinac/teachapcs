#Character indices 
Use Java's `charAt(int)` function to find the character at a specifix index.

**Called on**: a string

**Arguments**: the index at which you'd like the character

**Returns**: the character at the index passed as an argument

## Example

    String book = "handbook";
    book.charAt(4);                     // 'b'
    book.charAt(0);                     // 'h'

If you pass index that's larger than the string is long, you'll get a <word data-key="StringIndexOutOfBoundsException">StringIndexOutOfBoundsException</word>:

    String hello = "Hello!";
    hello.charAt(29);
    java.lang.StringIndexOutOfBoundsException: String index out of range: 29
