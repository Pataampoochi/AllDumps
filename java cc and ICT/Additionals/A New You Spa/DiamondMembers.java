
public class DiamondMembers extends Members{
	
	// Fill the code
	public DiamondMembers(String customerId,String  customerName,long mobileNumber,String memberType,String emailId){
	    super(customerId,customerName,mobileNumber,memberType,emailId);
        /*this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.memberType = memberType;
		this.emailId = emailId;*/
    }
    
	
	public boolean validateCusomerId(){
		// Fill the code
		boolean b=true;
	    String s1 = this.customerId.toUpperCase();
	    String regex="[DIAMOND]{7}[0-9]{3}";
	    if(s1.matches(regex)){
	        b=true;
	        }
	        else{
	            b=false;
	        }
	        
	       return b;
		
	}
	 public double calculateDiscount(double purchaseAmount){
		// Fill the code
		double discount=purchaseAmount*0.45;
		double updateamount=purchaseAmount-discount;
		return updateamount;
	}
	 
}
