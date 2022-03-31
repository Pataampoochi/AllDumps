package java_lc_cc.Student_Grade_Count;
//package com.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//import com.utility.StudentBO;

public class UserInterface {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StudentBO obj = new StudentBO();
		while (true) {
			System.out.println("1. Add student details");
			System.out.println("2. Find count of students");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			int choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the student roll number");
				String rollNumber = in.readLine();
				System.out.println("Enter the grade Secured");
				char grade = (char) in.read();
				obj.addStudentDetails(rollNumber, grade);
			}
			if (choice == 2) {
				BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the grade to find the count of students");
				char Grade = (char) rd.read();
				if(obj.findCountofStudents(Grade)==0)
					System.out.println("No students found");
				else
				System.out.println(obj.findCountofStudents(Grade));
			}
			if (choice == 3) {
				System.out.println("Thank you for using the Application");
				break;
			}

		}

	}
}

