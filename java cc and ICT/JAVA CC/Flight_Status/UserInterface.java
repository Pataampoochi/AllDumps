package java_lc_cc.Flight_Status;

import java.util.*;


public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name");
		String userName=sc.next();
		System.out.println("Enter Password");
		String password= sc.next();
		
		// Fill the Code
		Validator obj = new Validator();
		try {
			if (obj.validatePassword(password))
				System.out.println("Bon Voyage");
		} catch (IncorrectPasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
