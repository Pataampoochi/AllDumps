package java_lc_cc.BallsBowled;
//package com.ui;

//import com.utility.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class UserInterface {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PlayerBO obj = new PlayerBO();
		while (true) {
			System.out.println("1. Add overs bowled");
			System.out.println("2. Number of balls bowled");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			int choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				System.out.println("Enter the overs bowled");
				int overs = Integer.parseInt(br.readLine());
				obj.addOversDetails(overs);
			}
			if (choice == 2) {
				System.out.println("Total number of balls bowled");
				System.out.println(obj.getNoOfBallsBowled());
			}
			if (choice == 3) {
				System.out.println("Thank you for using the Application");
				break;
			}

		}

	}

}
