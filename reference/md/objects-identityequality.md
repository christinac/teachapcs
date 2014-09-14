#Identity and equality
Java tests for identity – whether two things are the same – and equality – whether two things hold the same value – differently.

We do this every day; think of two US quarters. Both are equal – they represent the same value ($0.25 US) – but they're not identical – they're two quarters, not one. 

The <word data-key="==">==</word> operator tests for identity:

    2 == 2;
    true
    true == true;
    true
    true == false;
    false
    12 == 12.0;
    true

The function `int equals()` tests for equality:

    Integer i = new Integer(4);
    Integer j = new Integer(4);
    i == j;
    false
    i.equals(j);
    true

**ADD MORE WRITEME**
