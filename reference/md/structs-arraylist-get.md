#Getting from an ArrayList
To retrieve an item from a particular index of an arraylist, use the `Object get(int index)` method:

    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Hello");
    myList.add("Goodbye");
    myList.get(1);      // will return the String "Goodbye"

From the code above, the ArrayList stored in the `myList` variable looks like `["Hello", "Goodbye"]`. So `myList.get(1)` will return the String at index 1 (in this case `"Goodbye"`) without changing the list itself.