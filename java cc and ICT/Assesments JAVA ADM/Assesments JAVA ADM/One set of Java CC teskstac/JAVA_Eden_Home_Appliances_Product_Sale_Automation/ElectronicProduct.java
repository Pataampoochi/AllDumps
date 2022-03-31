package java_lc_cc.JAVA_Eden_Home_Appliances_Product_Sale_Automation;

//Make this class inherit the Product class

public class ElectronicProduct extends Product {
	
	private String  dimension;
	private int  warranty;
	
	
	//Constructor
	public ElectronicProduct(int productId, String productName, float price,String dimension, int warranty) {
		
		//Uncomment this statement if you inherit the Product class
		
		super(productId, productName, price);
		this.dimension = dimension;
		this.warranty = warranty;
	}
	public ElectronicProduct()
	{
	    
	}
	
	//Getters and Setters
	
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}	

	//Override the calculateDiscount method to calculate the discount as 25% of price
	
	public float calculateDiscount() 
	{
	    return (25*price/100);
	}
	
}
