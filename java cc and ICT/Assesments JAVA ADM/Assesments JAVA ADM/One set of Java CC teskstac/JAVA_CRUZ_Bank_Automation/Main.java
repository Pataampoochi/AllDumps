package java_lc_cc.JAVA_CRUZ_Bank_Automation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Number");
		int accnum= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Holder Name");
		String name=sc.nextLine();
		System.out.println("Enter the Balance");
		double bal=sc.nextDouble();
		System.out.println("Enter the minimum Balance");
		double minBal = sc.nextDouble();		

		//Uncomment these lines after performing the necessary changes in Account and SavingsAccount class 


		SavingsAccount saving=new SavingsAccount(accnum,name,bal,minBal);	 
		double interest = saving.calculateInterest();		
		System.out.println("Account Number "+accnum);
		System.out.println("Interest Amount "+interest);		 

	}

}
