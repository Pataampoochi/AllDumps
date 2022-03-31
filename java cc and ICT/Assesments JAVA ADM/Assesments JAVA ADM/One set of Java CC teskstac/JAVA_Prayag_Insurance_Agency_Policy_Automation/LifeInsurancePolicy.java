package java_lc_cc.JAVA_Prayag_Insurance_Agency_Policy_Automation;

public class LifeInsurancePolicy extends InsurancePolicy {

	private String  nomineeName;
	private int  noOfYears;

	//Getters and Setters

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public int getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}


	//Constructor

	public LifeInsurancePolicy(int policyId, String policyName,
			String customerName, float amount, String nomineeName, int noOfYears) {

		//Uncomment this statement if you inherit the InsurancePolicy class

		super(policyId, policyName, customerName, amount);
		this.nomineeName = nomineeName;
		this.noOfYears = noOfYears;
	}

	public LifeInsurancePolicy(){

	}

	//Override the calculateBonus method to calculate the bonus as 15% of the insurance amount

	public float calculateBonus(){
		return(15*amount/100);
	}


}

