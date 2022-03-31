package java_lc_cc.JAVA_EZEE_Library_Automation;

public abstract class Book {
	
    protected int ISBNNumber;
    protected String bookName;
    protected double price;
    
	//Constructor
	
    public Book(int ISBNNumber, String bookName, double price) {
		this.ISBNNumber = ISBNNumber;
		this.bookName = bookName;
		this.price = price;
	}
	
	public Book()
	{
	    
	}

	//Getters and Setters
	
	public int getISBNNumber() {
		return ISBNNumber;
	}

	public void setISBNNumber(int iSBNNumber) {
		ISBNNumber = iSBNNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//Make this method calculateDiscount() as abstract
	
	public abstract double calculateDiscount();
	
	//	public abstract float calculateDiscount();

}
