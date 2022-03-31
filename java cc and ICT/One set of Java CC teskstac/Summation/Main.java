package java_lc_cc.Summation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		if (size > 10 || size < 1) {
			System.out.println(size+" is an invalid array size");
		} else {
			
			int[] arr1 = new int[size];
			int[] arr2 = new int[size];
			int[] arr3 = new int[size];
			System.out.println("Enter the elements in first array");
			for (int i = 0; i < size; i++) {
				arr1[i] = sc.nextInt();
			}
			System.out.println("Enter the elements in second array");
			for (int i = 0; i < size; i++) {
				arr2[i] = sc.nextInt();
			}
			
			int count = 0;
			for (int i = 0; i < size; i++) {
				
				if ((arr1[i] == 0 || arr1[i]%2 == 0) && (arr2[i] == 0 || arr2[i]%2 == 0)) {
					arr3[i] = arr1[i] + arr2[i];
					count++;
				} else {
					arr3[i] = 0;
				}
			}
			if (count == 0 && size > 1) {
				System.out.println("There are no even elements in the arrays");
			} else {
				for (int i : arr3) {
					System.out.println(i);
				}
			}
		}
	}
}
