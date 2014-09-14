#ArrayList emptiness
ArrayLists have a `boolean isEmpty()` method that returns true if there's no items in the list.

For example:

    ArrayList<String> myList = new ArrayList<String>();
    myList.isEmpty();             // returns true
    myList.add("Hello");
    myList.isEmpty();             // returns false
