package java_lc_cc.Busy_Day_of_the_week;
//package com.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//import com.utility.LMCBO;

public class UserInterface {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LMCBO obj = new LMCBO();
		while (true) {
			System.out.println("1. Add appointment details");
			System.out.println("2. Day to find Count");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			int choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				System.out.println("Enter the patient name");
				String patient = br.readLine();
				System.out.println("Enter the requesting appointment day");
				String day = br.readLine();
				obj.addAppointmentDayDetails(day);
			}
			if (choice == 2) {
				System.out.println("Enter the day to find the count ");
				String dayToCount = br.readLine();
				System.out.println(obj.findAppointmentCount(dayToCount));
			}
			if (choice == 3) {
				System.out.println("Thank you for using the application");
				break;
			}

		}

	}

}


