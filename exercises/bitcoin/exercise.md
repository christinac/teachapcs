You're given an outline of two classes: <code>Transaction</code>, which stores records in the blockchain, and <code>Ledger</code>, which maintains a list of all the transactions that have occured.

Neither class is quite finished yet; it's up to you to do that. Specifically:

1. Implement the Transaction <word>constructor</word> and <word>getter</word>, <word>toString</word>, and <word>compareTo</word> methods.
2. Implement the <code>verify</code> and <code>add</code> methods of the <code>Ledger</code> class.
3. Bitcoin doesn't allow anyone to remove transactions from the list; you can only add on to the end of it. What can you do to make sure the only way to change the <code>ledger</code> is with the methods you provide?
4. Finally: in the starter code, <code>Transaction</code> <word>implements</word> Comparable. Why was that useful?
<p><textarea class='form-control' rows='2'></textarea></p>
