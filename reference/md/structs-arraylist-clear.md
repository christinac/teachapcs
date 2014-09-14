#Clearing an ArrayList
ArrayLists have a `void clear()` method that removes all the items in the list.

For example:

    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Hello");
    myList.add("Goodbye");

After that code, `myList` looks like `["Hello", "Goodbye"]`

    myList.clear();

Now, after clearing the list, `myList` is empty: `["Hello", "Goodbye"]`