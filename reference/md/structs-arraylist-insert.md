#Inserting into an ArrayList
If there's a particular place, or an index, you'd like to put an item in your ArrayList, you can use the `void add(int index, Object o)` method.

For example:

    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Hello");
    myList.add("Goodbye");
    myList.insert(1, "Hiya");

produces an ArrayList called `myList` that looks like `["Hello", "Hiya", "Goodbye"]` – the "Hiya" string was inserted into the second position (index 1), and everything after was shifted one to the left.