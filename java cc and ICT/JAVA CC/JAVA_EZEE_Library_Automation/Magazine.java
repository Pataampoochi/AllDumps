package java_lc_cc.JAVA_EZEE_Library_Automation;

public class Magazine extends Book
{
	
	private String magazineType;

	//Constructor
	public Magazine(int ISBNNumber, String bookName, double price,String magazineType) {
		//Uncomment the below statement after you inherit the Book class
		
		super(ISBNNumber,bookName,price);
		this.magazineType=magazineType;
	}
    
	public Magazine()
	{
	    
	}

	//Getters and Setters
	
	public String getMagazineType() {
		return magazineType;
	}

	public void setMagazineType(String magazineType) {
		this.magazineType = magazineType;
	}
	
	
	//Override the calculateDiscount() method to return 15% of price
	
		public double calculateDiscount() { 
			return (double) (15 * price / 100);
		}

}
