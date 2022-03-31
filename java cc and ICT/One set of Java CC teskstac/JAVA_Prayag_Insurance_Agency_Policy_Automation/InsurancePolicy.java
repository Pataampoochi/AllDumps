package java_lc_cc.JAVA_Prayag_Insurance_Agency_Policy_Automation;



public class InsurancePolicy {

	protected int policyId; 
	protected String policyName;
	protected String customerName;
	protected float  amount;

	//Getters and Setters

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	} 

	//Constructor

	public InsurancePolicy(int policyId, String policyName,String customerName, float amount) {

		this.policyId = policyId;
		this.policyName = policyName;
		this.customerName = customerName;
		this.amount = amount;
	}

	public InsurancePolicy(){

	}


	//Write the method to calculate bonus as 8% of the insurance amount 

	public float calculateBonus(){
		return(8*amount/100);
	}
}

