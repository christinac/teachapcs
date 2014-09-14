class Transaction implements Comparable{
	final String sender;
	final String recipient;
	final double amount;

	/* @param send – sender's name as a String
	 * @param recip – recipient's name as a String
	 * @param amoun – Transaction amount  
     * Constructs a Transaction object
	 */
	public Transaction(String send, String recip, double amoun){
		// Construct a transaction object with the given sender, recipient, and amount
	}

	public String getSender(){
		// returns the sender
	}

	public String getRecipient(){
		// returns the recipient
	}

	public double getAmount(){
		// returns the amount
	}

	public String toString(){
		// returns the Transaction object in String form
	}

	public int compareTo(Object o){
		/* Compares two transaction objects and returns:
		   -1 if the first is larger, 0 if they're equal,
		   and 1 if the second is larger.	
		 */
	}
}

class Ledger{
	ArrayList<Transaction> ledger;

	public Ledger(){
		ledger = new ArrayList<Transaction>;
	}

	public boolean verify(Transaction t){
		/* Returns true if Transaction t is in the ledger;
		   returns false otherwise						*/
	}

	public void add(Transaction t){
		/* Adds Transaction t to the ledger array.
		   Make sure to check whether you need to
		   increase the size of the ledge array. */
	}
}