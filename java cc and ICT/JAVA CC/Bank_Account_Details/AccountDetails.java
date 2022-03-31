package java_lc_cc.Bank_Account_Details;

import java.util.*;

public class AccountDetails {
	
	public static void main(String[] args) {
		
		AccountDetails accountDetails = new AccountDetails();
		Account account = accountDetails.getAccountDetails();
		int amount = accountDetails.getWithdrawAmount();
		account.withdraw(amount);
		System.out.println("Balance amount after withdraw: "+account.getBalance());
	}
	
	public Account getAccountDetails() {
		
		Account account = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account id:");
		int accountId = Integer.parseInt(sc.nextLine());
		System.out.println("Enter account type:");
		String accountType = sc.nextLine();
		int balance = 0;
		int flag = 0;
		do
		{
			System.out.println("Enter balance:");
			balance = Integer.parseInt(sc.nextLine());
			flag = 0;
			if(balance <= 0)
			{
				System.out.println("Balance should be positive");
				flag = 1;
			}
		} while(flag == 1);
		
		account = new Account(accountId, accountType, balance);
		return account;
	}
	
	public int getWithdrawAmount() {
		
		Scanner sc = new Scanner(System.in);
		int amount = 0;
		int flag = 0;
		do
		{
			System.out.println("Enter amount to be withdrawn:");
			amount = Integer.parseInt(sc.nextLine());
			flag = 0;
			if(amount <= 0)
			{
				System.out.println("Amount should be positive");
				flag = 1;
			}
		} while(flag == 1);
		return amount;
	}
	
}
