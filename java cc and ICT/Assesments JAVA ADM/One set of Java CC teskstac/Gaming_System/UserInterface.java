package java_lc_cc.Gaming_System;

import java.util.Scanner;


public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the RAM capacity (in GB)");
		int rCapacity=sc.nextInt();
		System.out.println("Enter the HD capacity available (in GB)");
		int hdCapacity = sc.nextInt();
		System.out.println("Enter the Net Connection speed (in KBPS)");
		int speed = sc.nextInt();
		
 		//fill in the code
 		Validator obj = new Validator();
 		try{
 		if(obj.validateConfiguration(rCapacity,hdCapacity,speed))
 		System.out.println("Thank you for installing the game");
 		}
 		catch (ConfigurationMisMatchException e) {
			System.out.println(e.getMessage());
 		}

	}

}
