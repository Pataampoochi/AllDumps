package com.ui;
import com.utility.*;
import java.util.*;
public class UserInterface {
	public static void main(String []args)
	{
		GPACalculator gpa = new GPACalculator();
		gpa.setGradePointList(new ArrayList<Integer>());
		int option=0;
		double gpa1=0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1. Add Grade\n2. Calculate GPA\n3. Exit");
			System.out.println("Enter your choice");
			option = Integer.valueOf(sc.nextLine());
			switch(option) 
			{
			case 1: System.out.println("Enter the obtained grade");
					char grade = sc.nextLine().charAt(0);
					gpa.addGradePoint(grade);
					break;
					
			case 2 : gpa1 = gpa.calculateGPAScored();
			            if(gpa1 > 0)
			            {
			                System.out.println("GPA Scored");
					        System.out.println(gpa1);
			            }
			            else
			            {
			                System.out.println("No GradePoints available");
			            }
					 break;
			case 3 : break;
			
			}
		}while(option!=3);
		System.out.println("Thank you for using the Application");
	}

}

