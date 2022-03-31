import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args){
	    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id");
		String cid=sc.nextLine();
		System.out.println("Enter Customer name");
		String cname=sc.nextLine();
		System.out.println("Enter mobile number");
		long mob=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Member type");
		String mem=sc.nextLine();
		System.out.println("Enter Email Id");
		String email=sc.nextLine();
		System.out.println("Enter amount Purchased");
		double amount=sc.nextDouble();
		DiamondMembers d=new DiamondMembers(cid,cname,mob,mem,email);
		GoldMembers g=new GoldMembers(cid,cname,mob,mem,email);
		PlatinumMembers p=new PlatinumMembers(cid,cname,mob,mem,email);
		
		
		double res=0.0;
		if(d.validateCusomerId()){
		   res= d.calculateDiscount(amount);
		   System.out.println("Name :"+d.getCustomerName());
		   System.out.println("Id :"+d.getCustomerId());
		   System.out.println("Email Id :"+d.getEmailId());
		   System.out.println("Amount to be paid :"+res);
		   
	} else if(g.validateCusomerId()){
		    res= g.calculateDiscount(amount);
		   System.out.println("Name :"+g.getCustomerName());
		   System.out.println("Id :"+g.getCustomerId());
		   System.out.println("Email Id :"+g.getEmailId());
		   System.out.println("Amount to be paid :"+res);
		   
    } else if(p.validateCusomerId()){
		    res= p.calculateDiscount(amount);
		   System.out.println("Name :"+p.getCustomerName());
		   System.out.println("Id :"+p.getCustomerId());
		   System.out.println("Email Id :"+p.getEmailId());
		   System.out.println("Amount to be paid :"+res);
		   
    } else{
        System.out.println("Provide a valid Customer Id");
    }
		
		// Fill the code
	}
}
