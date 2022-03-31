
public class PlatinumMembers extends Members {
	
	// Fill the code
        public PlatinumMembers(String customerId,String  customerName,long mobileNumber,String memberType,String emailId){
        super(customerId,customerName,mobileNumber,memberType,emailId);
        /*customerId = customerId;
		customerName = customerName;
		mobileNumber = mobileNumber;
		memberType = memberType;
		emailId = emailId;
    */
        }
    
	
	public boolean validateCusomerId(){
		// Fill the code
		boolean b=true;
	    String s1 = this.customerId.toUpperCase();
	    String regex="[PLATINUM]{8}[0-9]{3}";
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
		 double discount=purchaseAmount*0.3;
		double updateamount=purchaseAmount-discount;
		return updateamount;
	}

}
