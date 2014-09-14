# null
In Java, `null` is a special keyword that means "empty" or "nothing." It can help you check whether an object hasn't yet received a value:

    String empty;
    empty == null;              // returns true
    
    String blank = "";
    blank == null;              // returns false
    
    Object alsoEmpty;
    alsoEmpty == null;          // returns true
