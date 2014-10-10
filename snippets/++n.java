int x = 1; 
int y = ++x;
y;
2
x;
2

Notice how the y variable takes on the already-incremented value of x? If we'd instead written x++, we'd end with y = 1 and x = 2.