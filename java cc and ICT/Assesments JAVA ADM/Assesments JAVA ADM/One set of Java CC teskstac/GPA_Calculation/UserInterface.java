package java_lc_cc.GPA_Calculation;
//package com.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//import com.utility.*;

public class UserInterface 
{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		GradeBO obj = new GradeBO();
		while (true) {
			System.out.println("1. Add GradePoint");
			System.out.println("2. Calculate GPA");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			int choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				System.out.println("Enter the gradePoint scored");
				int grade = Integer.parseInt(br.readLine());
				obj.addGradeDetails(grade);
			}
			if (choice == 2) {
				if (obj.getGPAScored() == 0)
					System.out.println("No GradePoints available");
				else
				{	System.out.println("GPA Scored");
				System.out.println((int)obj.getGPAScored());
				}
			}
			if (choice == 3) {
				System.out.println("Thank you for using the Application");
				break;
			}

		}

	}

}


