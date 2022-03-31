package java_lc_cc.JAVA_Maria_Mobiles_Mobile_Sale_Automation;

//Make this class inherit the Mobile class
public class SmartPhone extends Mobile
{

	private String cameraDetails;
	private String networkSupport;
	
	//Getters and Setters
	public String getCameraDetails() {
		return cameraDetails;
	}

	public void setCameraDetails(String cameraDetails) {
		this.cameraDetails = cameraDetails;
	}

	public String getNetworkSupport() {
		return networkSupport;
	}
	public void setNetworkSupport(String networkSupport) {
		this.networkSupport = networkSupport;
	}
		
	//Constructor

	public SmartPhone(int mobileId, String brandName, float price,
			String cameraDetails, String networkSupport) {

		//Uncomment this statement after you inherit the Mobile class
		
		super(mobileId, brandName, price);
		this.cameraDetails = cameraDetails;
		this.networkSupport = networkSupport;
	}


	public SmartPhone()
	{
		
	}
	

	//OVerride the calculateDiscount method to calculate the discount as 15% of the mobile price
	
	public float calculateDiscount()
	{
	    return (15 * price / 100);
	}
		
}
