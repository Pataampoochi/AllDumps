package java_lc_cc.JAVA_Maria_Mobiles_Mobile_Sale_Automation;


public class Mobile {

	protected int mobileId;
	protected String brandName;
	protected float price;

	

	//Getters and Setters
	
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

	//Constructor
	
	public Mobile(int mobileId, String brandName, float price) {
		super();
		this.mobileId = mobileId;
		this.brandName = brandName;
		this.price = price;
	}
		
	public Mobile()
	{
		
	}		
	
	//Write the method to calculate discount as 10% of the mobile price 
	
	public float calculateDiscount()
	{
	    return (10 * price / 100);
	}
	
	
}
