package java_lc_cc.Product_Equals_Sum;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();

		if (size < 1 || size > 10) {
			System.out.println(size+" is invalid array size");
		} else {

			int[] arr1 = new int[size];
			int[] arr2 = new int[size];
			
			System.out.println("Enter the elements of the first array");
			for (int i = 0; i < size; i++) {
				arr1[i] = sc.nextInt();
				if (arr1[i] < 10 || arr1[i] > 999) {
					System.out.println(arr1[i]+" is not a valid input");
					System.exit(0);
				}
				
			}
			
			System.out.println("Enter the elements of the second array");
			for (int i = 0; i < size; i++) {
				arr2[i] = sc.nextInt();
				if (arr2[i] < 10 || arr2[i] > 999) {
					System.out.println(arr2[i]+" is not a valid input");
					System.exit(0);
				}
				
			}
			
			boolean isFound = false;
			for (int i = 0; i < size; i++) {
				int product = getProduct(arr1[i]);
				int sum = getSum(arr2[i]);
				if (sum == product) {
					isFound = true;
					System.out.println(arr1[i]+","+arr2[i]);
				}
			}
			if (!isFound) {
				System.out.print("No pair found in ");
				for (int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i]);
					if ( i < arr1.length -1) {
						System.out.print(" ");
					}
				}
				System.out.print(" and ");
				for (int i = 0; i < arr2.length; i++) {
					System.out.print(arr2[i]);
					if ( i < arr2.length -1) {
						System.out.print(" ");
					}
				}
			}
		}

	}

	public static int getProduct(int n) { 
		int product = 1; 
		while (n != 0) { 
			product = product * (n % 10); 
			n = n / 10; 
		} 
		return product; 
	}

	public static int getSum(int n) {     
		int sum = 0; 
		while (n != 0) { 
			sum = sum + n % 10; 
			n = n/10; 
		} 
		return sum; 
	} 

}
