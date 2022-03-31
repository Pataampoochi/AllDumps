package java_lc_cc.Average_And_Grade_Calculation;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student = getStudentDetails();
		System.out.println("Id:"+student.getId());
		System.out.println("Name:"+student.getName());
		System.out.println("Average:"+student.getAverage());
		System.out.println("Grade:"+student.getGrade());
		
	}
	
	public static Student getStudentDetails() {
		
		Student student = null;;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id:");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		int flag = 0;
		int numberOfSubjects = 0;
		do {
			System.out.println("Enter the no of subjects:");
			numberOfSubjects = Integer.parseInt(sc.nextLine());
			if(numberOfSubjects <= 0) {
				System.out.println("Invalid number of subject");
				flag = 1;
			}
		} while(flag == 1);
		int[] marks = new int[numberOfSubjects];
		for (int i = 0; i < numberOfSubjects; i++) {
			flag = 0;
			do {
				System.out.println("Enter mark for subject "+(i+1)+":");
				marks[i] = Integer.parseInt(sc.nextLine());
				if(marks[i] < 0 && marks[i] > 100) {
					System.out.println("Invalid Mark");
					flag = 1;
				}
			} while(flag == 1);
		}
		student = new Student(id, name, marks);
		return student;
	}

}
