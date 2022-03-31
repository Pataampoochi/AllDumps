package java_lc_cc.PF_and_Salary_Calculation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name:");
		String name = in.readLine();
		System.out.println("Enter the salary:");
		float salary = Float.parseFloat(in.readLine());
		System.out.println("Enter the pfpercentage:");
		float pfpercentage = Float.parseFloat(in.readLine());

		PermanentEmployee object = new PermanentEmployee();
		if (object.validateInput(salary, pfpercentage)) {
			object.setPfpercentage(pfpercentage);
			object.setSalary(salary);
			object.findNetSalary();
			System.out.println("Enter the name:" + name);
			System.out.printf("PF Amount: %.2f",object.getPfamount());
			System.out.printf("\nNetsalary: %.2f",object.getNetsalary());
		} else
			System.out.println("Error!!! Unable to calculate the NetSalary.");
	}

}