package java_lc_cc.Vehicle_Capacity_Calculator;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the petrol in the vehicle in liters");
		int availablePetrol=sc.nextInt();
		System.out.println("Enter the petrol to be filled in liters");
		int fillingPetrol= sc.nextInt();
		int petrol=availablePetrol+fillingPetrol;
		
		Validator validator = new Validator();
		try {
			if (validator.validatePetrolUsage(petrol)) {
				System.out.println("Petrol Tank will be sufficient");
			}
		} catch (PetrolOverflowException e) {
			System.out.println(e.getMessage());
		}
	}
}
