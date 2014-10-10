/* Prints
 Spent another $25!
 Spent another $25!
 Spent another $25!
 Spent another $25!
 No money left!
 */
int wallet = 100;
while(wallet > 0){
    wallet = wallet - 25;
    System.out.println("Spent another $25!");
}
System.out.println("No money left!");


/* Prints
 Spent another $25! Now my wallet has $75
 Spent another $25! Now my wallet has $50
 Spent another $25! Now my wallet has $25
 Spent another $25! Now my wallet has $0
 No money left!
 */
int wallet = 100;
while(wallet > 0){
    wallet = wallet - 25;
    System.out.println("Spent another $25! Now my wallet has $" + wallet);
}
System.out.println("No money left!");

/* Prints
 My wallet has $100
 Spent another $25! 
 My wallet has $75
 Spent another $25! 
 My wallet has $50
 Spent another $25!
 My wallet has $25
 Spent another $25!
 No money left!
 */
int wallet = 100;
while(wallet > 0){
    System.out.println("My wallet has $" + wallet);
    wallet = wallet - 25;
    System.out.println("Spent another $25!");
}
System.out.println("No money left!");