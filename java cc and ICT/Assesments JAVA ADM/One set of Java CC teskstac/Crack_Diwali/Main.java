package java_lc_cc.Crack_Diwali;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number from the slot");
		int size = Integer.parseInt(sc.nextLine());
		if (size < 5 || size > 15) {
			System.out.println(size+" is not a valid slot number");
		} else {
			
			System.out.println("Enter the "+size+" customer names");
			String[] arr1 = new String[size];
			for (int i = 0; i < size; i++) {
				arr1[i] = sc.nextLine();
			}
			System.out.println("Enter the alphabet from the slot");
			String letter = sc.nextLine();
			
			boolean isFound = false;
			for (int i = 0; i < size; i++) {
				if (arr1[i].toLowerCase().contains(letter.toLowerCase())) {
					isFound = true;
				}
			}
			
			if (!isFound) {
				System.out.println("Letter "+letter+" is not present in any of the customer's name");
			} else {
				System.out.println("Customers List");
				for (int i = 0; i < size; i++) {
					if (arr1[i].toLowerCase().contains(letter.toLowerCase())) {
						System.out.println(arr1[i]);
						isFound = true;
					}
				}
			}
		}

	}

}
