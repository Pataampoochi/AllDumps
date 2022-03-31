package java_lc_cc.Average_Rainfall_calculator;

//package com.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//import com.utility.RMCBO;

public class UserInterface {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		RMCBO obj = new RMCBO();
		while (true) {
			System.out.println("1. Add rainfall details");
			System.out.println("2. Average Rainfall occurred");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			int choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				System.out.println("Enter the Date");
				String date = br.readLine();
				System.out.println("Enter the recorded rainfall in mm");
				int record = Integer.parseInt(br.readLine());
				obj.addRainfallDetails(record);
			}
			if (choice == 2) {
				if(obj.findAverageRainfallOccured()==0)
					System.out.println("No records found");
				else
				{
				System.out.println("Average Rainfall recorded in mm");
				System.out.println(obj.findAverageRainfallOccured());
				}
			}
			if (choice == 3) {
				System.out.println("Thank you for using the application");
				break;
			}

		}

	}

}

