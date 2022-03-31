package java_lc_cc.Bank_Account_Details;

public class Account {
	
	private int accountId;
	private String accountType;
	private int balance;
	
	public Account() {
		
	}
	
	public Account(int accountId, String accountType, int balance) {
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(int amount) {
		
		if (this.balance - amount > 0) {
			this.balance = this.balance - amount;
			return true;
		} else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
	}
}
