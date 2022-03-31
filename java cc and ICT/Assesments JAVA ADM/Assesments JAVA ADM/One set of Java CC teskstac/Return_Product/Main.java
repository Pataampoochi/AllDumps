package java_lc_cc.Return_Product;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int primeCount = 0;
		boolean isInvalid = true;
		System.out.println("Array size");
		int size = sc.nextInt();

		if (size < 1) {
			System.out.println(size+" is an invalid array size");
		} else {

			int[] arr1 = new int[size];
			System.out.println("Array elements");
			int mul = 1;
			for (int i = 0; i < size; i++) {
				arr1[i] = sc.nextInt();
				if (arr1[i] < 1) {
					System.out.println(arr1[i]+" is an invalid array element");
					isInvalid = false;
					break;
				}
				if (isPrime(arr1[i])) {
					primeCount = primeCount + 1;
					mul = mul * arr1[i];
				}
			}
			if (primeCount > 0 && isInvalid) {
				System.out.println(mul);
			} else if (isInvalid) {
				System.out.print("No element found in ");
				for (int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i]);
					if ( i < arr1.length -1) {
						System.out.print(",");
					}
				}
			}
		}
	}

	public static boolean isPrime(int n) {  
		
		if (n == 2) {
			return true;
		} else {
			if (n % 2 == 0) return false; 
			for(int i = 3; i <= Math.sqrt(n); i += 2) { 
				if(n % i == 0) 
					return false; 
			} 
			return true; 
		}
	} 

}
