package java_lc_cc.WhatsApp;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mode of message(text,video, photo)");
		String mode=sc.next();
		System.out.println("Enter number of groups");
		int groups = sc.nextInt();

		//Fill the code here
		Validator obj = new Validator();
		try {
			if (obj.validateNumberOfGroups(groups))
				System.out.println("Forwarded");
			else
				throw new NumberOfGroupsExceedException("You can only share with up to 5 chats");
		} 
		catch (NumberOfGroupsExceedException e) {
			System.out.println(e.getMessage());
		}

	}
}