#Removing from an ArrayList
To remove an item at a particular index in an arraylist, use the `Object remove(int index)` method.

Let's say we set up a list that will look like `["Hello", "Goodbye"]`:

    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Hello");
    myList.add("Goodbye");

Now, let's remove the element at index 1: 

    myList.remove(1);       // Will return the String "Goodbye"

`myList` will be only `["Hello"]`.

If we wanted to save the String we removed, we could do that too:

    String gone = myList.remove(1);         // Now, gone refers to "Goodbye"
