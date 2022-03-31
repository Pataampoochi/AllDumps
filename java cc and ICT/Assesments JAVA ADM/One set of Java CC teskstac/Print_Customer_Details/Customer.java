package java_lc_cc.Print_Customer_Details;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter age:");
		String age = sc.nextLine();
		System.out.println("Enter gender:");
		String gender = sc.nextLine();
		System.out.println("Hailing from:");
		String city = sc.nextLine();
		
		System.out.println("Welcome, "+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("City:"+city);

	}

}
