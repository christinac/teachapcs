"Hello".substring(0);               // "Hello"
"Hello".substring(1);               // "ello"
"Hello".substring(2);               // "llo"
"Hello".substring(3);               // "lo"
"Hello".substring(4);               // "o"
"Hello".substring(5);               // ""
"Hello".substring(6);               // StringIndexOutOfBoundsError


"Hello".substring(0, 5);            // "Hello"
"Hello".substring(0, 4);            // "Hell"
"Hello".substring(0, 3);            // "Hel"
"Hello".substring(0, 2);            // "He"
"Hello".substring(0, 1);            // "H"
"Hello".substring(0, 0);            // ""