/**
 * @author H. Hay
 */
public class bookshop {
    
    private String bookshopName;

    public bookshop(String bookshopName) {
        this.setBookshopName(bookshopName);
    }

    /**
	 * Sets the Name of the Bookshop
	 * @param bookshopName the Name of the Bookshop
	 */
    private void setBookshopName(String bookshopName) {
        this.bookshopName = bookshopName;
    }

    /**
	 * Returns the Name of the Bookshop
	 * @return the Name of the Bookshop
	 */
	public int getBookshopName() {
		return bookshopName;
	}
}