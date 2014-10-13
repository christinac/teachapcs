#equals(String)

.equals is a built in method for the String type. 

  String a = "Hello";
  String b = "Hello"; 
  
  a.equals(b); //Returns true
  
When comparing two Strings, use .equals rather than ==

  String s4 = new String("Hello");  // String object
  String s5 = new String("Hello");  // String object
  
  s4 == s5;         // false, different pointers in heap
  s4.equals(s5);    // true, same contents

== checks if the object points to the same pointer in memory, so if you want to see if two strings have the same content, use the built in .equals method.
