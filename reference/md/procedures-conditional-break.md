# break
When you have a loop, you may want to use the <code data-key="break">break</code> statement to stop the loop early. For instance,

    int i = 0;
    while (i < 100) {
        i++;
        System.out.println("i is:  " + i);
        if (i == 3) {
            System.out.println("Three? That's probably enough.");
            break;
        }
    }

    "i is:  1"
    "i is:  2"
    "i is:  3"
    "Three? That's probably enough."
