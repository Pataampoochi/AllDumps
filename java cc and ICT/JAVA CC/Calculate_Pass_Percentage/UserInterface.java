package java_lc_cc.Calculate_Pass_Percentage;
//package com.ui;

//import com.utility.StudentBO;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class UserInterface 
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StudentBO obj = new StudentBO();
		while (true) {
			System.out.println("1. Add student marks");
			System.out.println("2. Find pass percentage");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			int choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				System.out.println("Enter the marks Secured");
				int marks = Integer.parseInt(br.readLine());
				obj.addStudentDetails(marks);
			}
			if (choice == 2) {
				if (obj.findPassPercentage() == -1)
					System.out.println("No Marks available");
				else
					System.out.println(obj.findPassPercentage());
			}
			if (choice == 3) {
				System.out.println("Thank you for using the application");
				break;
			}

		}

	}

}

