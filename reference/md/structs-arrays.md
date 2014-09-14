#Arrays
Arrays are a way to save several pieces of data together.

Let's say we wanted to store a week's worth of temperatures. We could do it with a bunch of variables:

    int day1 = 77;
    int day2 = 72;
    int day3 = 74;
    int day4 = 68;
    int day5 = 71;
    ...

But that gets old pretty quickly.

Instead, we can use an <word data-key="array">array</word> to store all those temperatures at once:
    
    int temps[] = new int[6];
    temps[0] = 77;
    temps[1] = 72;
    temps[2] = 74;
    temps[3] = 68;
    temps[4] = 71;
    ...

To retrieve one of the temperature variables, we use the variable name and its index:

    temp[0];            // returns 77
    temp[4];            // returns 71

As array indices start counting from 0, a seven-item array has indicies 0, 1, 2, 3, 4, 5, and 6 – but not 7!
