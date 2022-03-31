package java_lc_cc.BattingAverage;

//package com.ui;

//import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		PlayerBO pbo = new PlayerBO();
		int choice;
		do {
			System.out.println("1. Add Runs Scored");
			System.out.println("2. Average Score of the Player");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			choice = Integer.parseInt(sc.nextLine());
			
			if (choice == 1) {
				System.out.println("Enter the runs scored");
				pbo.addScoreDetails(Integer.parseInt(sc.nextLine()));
			} else if (choice == 2) {
				System.out.println("Average runs secured");
				System.out.println(pbo.getAverageRunsSecured());
			}
			
		} while(choice != 3);
		System.out.println("Thank you for using the Application");
	}

}