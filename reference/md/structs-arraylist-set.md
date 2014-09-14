#Setting values in an ArrayList
Setting a value in an ArrayList performs an overwrite: it combines an addition and removal.

For example:

    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Hello");
    myList.add("Goodbye");
    myList.add("Hi");

produces an ArrayList called `myList` that looks like `["Hello", "Goodbye", "Hi"]`. Now, lets set `"Hiya"` in index 1:

    myList.set(1, "Hiya");

Now, `myList` looks like `["Hello", "Hiya", "Hi"]` – the "Hiya" string was inserted into the second position (index 1), overwriting the "Goodbye" that was there.