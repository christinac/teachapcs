int x = 1; 
int y = ++x;

System.out.println(y);          // prints 2
System.out.println(x);          // prints 2

// Versus ...
int x = 1;
int y = x++;

System.out.println(y);          // prints 1
System.out.println(x);          // prints 2

