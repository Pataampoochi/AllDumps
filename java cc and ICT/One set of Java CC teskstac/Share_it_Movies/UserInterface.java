package java_lc_cc.Share_it_Movies;

import java.util.Scanner;

public class UserInterface {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Available Storage(in GB)");
		int gb = sc.nextInt(); 
		System.out.println("Enter the Bluetooth Connectivity");
		String bt = sc.next();
		System.out.println("Enter the WLAN Connectivity"); 
		String wlan = sc.next();
		
		Validator obj = new Validator();
		
		try {
				if (obj.validateRequirement(gb,bt, wlan))
					System.out.println("Thank you!!! Transfer success");
			}
			catch (RequirementMisMatchException e) {
				System.out.println(e.getMessage());
			}
	}
}