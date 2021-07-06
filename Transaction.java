/**
 * @author H. Hay
 */
public class transaction {
    
    private int transactionID;
    private int transactionStockID;
    private int transactionAmount;

    public transaction(int transactionID, int transactionStockID. int transactionAmount) {
        this.setTransactionID(transactionID);
        this.setTransactionStockID(transactionStockID);
        this.setTransactionAmount(transactionAmount);
    }

    /**
	 * Sets the ID of the Transaction
	 * @param transactionID the ID of the Transaction
	 */
    private void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    /**
	 * Sets the ID of the Stock
	 * @param transactionStockID the ID of the Stock
	 */
    private void setTransactionStockID(int transactionStockID) {
        this.transactionStockID = transactionStockID;
    }

    /**
	 * Sets the Amount of the Transaction Order
	 * @param transactionAmount the Amount of the Transaction Order
	 */
    private void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
	 * Returns the ID of the Transaction
	 * @return the ID of the Transaction
	 */
	public int setTransactionID() {
		return transactionID;
	}

    /**
	 * Returns the ID of the Stock
	 * @return the ID of the Stock
	 */
	public int setTransactionStockID() {
		return transactionStockID;
	}

    /**
	 * Returns the Amount of the Transaction Order
	 * @return the Amount of the Transaction Order
	 */
	public int setTransactionAmount() {
		return transactionAmount;
	}

    /**
	 * Completing transactions
	 */
}