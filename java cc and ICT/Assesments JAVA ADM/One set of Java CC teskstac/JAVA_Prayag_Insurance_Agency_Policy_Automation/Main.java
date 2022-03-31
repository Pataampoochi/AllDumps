package java_lc_cc.JAVA_Prayag_Insurance_Agency_Policy_Automation;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Policy Id");
		int pid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Policy Name");
		String pname=sc.nextLine();
		System.out.println("Enter the Customer Name");
		String cname=sc.nextLine();

		System.out.println("Enter the Amount");
		float price=sc.nextFloat();
		System.out.println("Enter the nominee name");
		sc.nextLine();
		String nominee=sc.nextLine();
		System.out.println("Enter the number of years");
		int year=sc.nextInt();

		//Uncomment these lines after LifeInsurancePolicy inherits the InsurancePolicy class


		LifeInsurancePolicy policy=new LifeInsurancePolicy(pid,pname,cname,price,nominee,year);
		System.out.println("Policy Id - "+policy.getPolicyId());
		System.out.println("Policy Name - "+policy.getPolicyName());
		System.out.println("Customer Name - "+policy.getCustomerName());
		System.out.println("Amount - "+policy.getAmount());
		System.out.println("Nominee name - "+policy.getNomineeName());
		System.out.println("Period - "+policy.getNoOfYears()+" years");
		System.out.printf("Bonus amount - %.2f",policy.calculateBonus());


	}

}