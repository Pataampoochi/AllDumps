package java_lc_cc.Employee_Salary_Calculation;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = getEmployeeDetails();
		int pfpercentage = getPFPercentage();
		employee.calculateNetSalary(pfpercentage);
		System.out.println("Id : "+employee.getEmployeeId());
		System.out.println("Name : "+employee.getEmployeeName());
		System.out.printf("Salary : %.1f", employee.getSalary());
		System.out.println();
		System.out.printf("Net Salary : %.1f", employee.getNetSalary());
	}
	
	public static Employee getEmployeeDetails() {
		
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Enter Id:");
		employee.setEmployeeId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Name:");
		employee.setEmployeeName(sc.nextLine());
		System.out.println("Enter salary:");
		employee.setSalary(Double.parseDouble(sc.nextLine()));
		return employee;
	}
	
	public static int getPFPercentage() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PF percentage:");
		int percentage = Integer.parseInt(sc.nextLine());
		return percentage;
	}
}
