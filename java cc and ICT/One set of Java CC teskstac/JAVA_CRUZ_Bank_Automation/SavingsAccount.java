package java_lc_cc.JAVA_CRUZ_Bank_Automation;

public class SavingsAccount extends Account 
{

	private double minimumBalance;

	//Constructor

	public SavingsAccount(int accNumber, String holderName, double balance,double minimumBalance) {

		//Uncomment the below statement after you inherit the Account class

		super(accNumber,holderName,balance);
		this.minimumBalance=minimumBalance;

	}

	public SavingsAccount()
	{

	}

	//Getters and Setters

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}


	//Override the calculateInterest() method to return 5% of balance

	public double calculateInterest() { 
		return (5 * balance / 100);
	}

}
