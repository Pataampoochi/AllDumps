public class GoldMembers extends Members {
    public GoldMembers(String customerId,String  customerName,long mobileNumber,String memberType,String emailId){
        super(customerId,customerName,mobileNumber,memberType,emailId);
    }
    
	// Fill the code
	
	public boolean validateCusomerId(){
	    boolean b=true;
	    String s1 = this.customerId.toUpperCase();
	    String regex="[GOLD]{4}[0-9]{3}";
	    if(s1.matches(regex)){
	        b=true;
	        }
	        else{
	            b=false;
	        }
	        
	       return b;
		// Fill the code
	}
	 public double calculateDiscount(double purchaseAmount){
		// Fill the code
		double discount=purchaseAmount*0.15;
		double updateamount=purchaseAmount-discount;
		return updateamount;
	}

}
