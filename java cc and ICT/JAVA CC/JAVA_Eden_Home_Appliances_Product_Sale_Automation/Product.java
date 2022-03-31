package java_lc_cc.JAVA_Eden_Home_Appliances_Product_Sale_Automation;


public class Product {

	protected int productId;
	protected String productName;
	protected float price;
	
	//Getters and Setters
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	//Constructor
	
	public Product(int productId, String productName, float price) {	
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public Product()
	{
	    
	}
	
	
	//Write the method to calculate discount as 12% of price
	
	public float calculateDiscount()
	{
	    return (12*price/100);
	}
	
}
