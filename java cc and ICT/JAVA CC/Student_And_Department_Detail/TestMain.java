package java_lc_cc.Student_And_Department_Detail;

import java.util.*;

public class TestMain {

	public static void main(String[] args) {
		
		Student student = createStudent();
		System.out.println("Department id:"+student.getDepartment().getDid());
		System.out.println("Department name:"+student.getDepartment().getDname());
		System.out.println("Student id:"+student.getSid());
		System.out.println("Student name:"+student.getSname());
	}
	
	public static Student createStudent() {
		
		Student student = new Student();
		Department department = new Department();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Department id:");
		department.setDid(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter the Department name:");
		department.setDname(sc.nextLine());
		
		student.setDepartment(department);
		
		System.out.println("Enter the Student id:");
		student.setSid(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter the Student name:");
		student.setSname(sc.nextLine());
		
		return student;
	}
	
}
