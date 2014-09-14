# Searching strings
Use Java's `indexOf(String)` or `indexOf(String, int)` function to find out whether one string contains another.

**Called on**: the "parent" string

**Arguments**: 

- the String that might be inside the parent string
- *(optional)* the index from which to start searching. Defaults to 0.

**Returns**: the index of the inner string's first character in the parent string. `-1` if the inner string wasn't found.

## Example

    String str = "Hello world!";
    
    str.indexOf("World");
    // Return -1 – searching is case-sensitive
    str.indexOf("world");               // Returns 7
    str.indexOf("world", 10)            // Returns -1
    str.indexOf("hi");                  // Returns -1
    str.indexOf("Hello world!");        // Returns 0
    str.indexOf("!", 10)                // Returns 12
