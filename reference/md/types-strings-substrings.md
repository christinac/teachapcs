# Making strings from strings
When a string is made from another string, it is called a substring.

Java provides two methods to make substrings: `substring(int beginIndex)` and `substring(int beginIndex, int endIndex)`. 

**Called on**: the "parent" string

**Arguments**: 

- the index at which to begin searching
- *(optional)* the index at which to stop searching. Defaults to the string's last index.

**Returns**: the substring between `beginIndex` and `endIndex` or the word's end.

## Examples

    String word = "racecar";
    word.substring(0);              // "racecar"
    word;                           // still "racecar"
    word.substring(4);              // "car"
    word;                           // still "racecar"
    word.substring(0, 4);           // "race"
    word;                           // "racecar"

Strings can't be modified, so calling (for example) `word.substring(4);` above creates and returns a new string (`"car"`) but doesn't change the original string (`"racecar"`).

## Saving substrings 

To save the substring that gets returned, assign it to a variable:

    String jewels = "Diamonds, rubies, and emeralds.";
    String shorter = jewels.substring(10,16);
    jewels;                             // "Diamonds, rubies, and emeralds.";
    shorter;                            // "rubies"