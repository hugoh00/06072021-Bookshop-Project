/**
 * @author H. Hay
 */
public class stock {

    private int stockID;
    private String stockName;
    private int stockPrice;

    public stock(int stockID, String stockName, int stockPrice) {
        this.setStockID(stockID);
        this.setStockName(stockName);
        this.setStockPrice(stockPrice);

    } 

    /**
	 * Sets the ID of the stock that this item of stock is about
	 * @param stockID the ID of the stock
	 */
    private void setStockID(int stockID) {
        this.stockID = stockID;
    }

    /**
	 * Sets the Name of the stock that this item of stock is about
	 * @param stockName the Name of the stock
	 */
    private void setStockName(int stockName) {
        this.stockName = stockName;
    }

    /**
	 * Sets the Price of the stock that this item of stock is about
	 * @param stockPrice the Price of the stock
	 */
    private void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    /**
	 * Returns the ID of the stock item
	 * @return the Name of the Stock
	 */
	public int getStockID() {
		return stockID;
	}

    /**
	 * Returns the Name of the stock item
	 * @return the Name of the Stock
	 */
	public String getStockName() {
		return stockName;
	}

    /**
	 * Returns the Price of the stock item
	 * @return the Price of the Stock
	 */
	public int getStockPrice() {
		return stockPrice;
	}

}