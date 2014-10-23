#Computer Science Dictionary

`dictionary.yaml` tracks the entries that power [http://teachapcs.com/dictionary](http://teachapcs.com/dictionary)

##Format

    word: [string - used as lookup key]
    display: [string - optional - displayed as the dictionary word. If missing, 'word' is shown.]
    defintion: [string]
    succint: [object list - optional - more succinct definition, used when space is constrained.]
       - text: [string - succinct definition]
         example: [string - succinct example]
         wrapper: [string - used for user input; $REPLACE is replaced by highlighted text]
    example: [string - java code - demonstrates word/concept - HTML okay.]
    external: [object list - external resources that also explain the concept]
       - text: [string - describe the link]
         source: [string - source of link]
         url: [string - url]
    related: [object list - other dictionary words related to this one]
       - word: [string - 'word' key of related word]
         reason: [string - short statement that relates the two concepts]

##Order
Order isn't currently being kept in the file. (If you'd like to suggest or impose an ordering scheme, please do!)

###Missing words
A (partial) list of words the (many) Java words the dictionary lacks. If you're looking for a place to start contributing, this is a great one – 

- +=
- access-control
- argument
- cast
- compiler-error
- constant
- control
- import
- inherit
- legible
- method
- new
- overload
- override
- references
- runtime-error
- runtime-exception
- superclass
- void
- wrapper
