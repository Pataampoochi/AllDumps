package java_lc_cc.JAVA_CRUZ_Bank_Automation;

//Make the necessary changes to make this class abstract 
public abstract class Account {

	protected int accNumber;
	protected String holderName;
	protected double balance;

	//Constructor

	public Account(int accNumber, String holderName, double balance) {
		super();
		this.accNumber = accNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public Account()
	{

	}

	//Getters and Setters

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	//	Make this method calculateInterest() as abstract

	public abstract double calculateInterest();

}