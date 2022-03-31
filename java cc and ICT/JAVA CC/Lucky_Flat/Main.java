package java_lc_cc.Lucky_Flat;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isFound = false;
		boolean isValid = true;
		ArrayList<Integer> luckynumbers = new ArrayList<Integer>();
		System.out.println("Enter the number of flats available:");
		int size = sc.nextInt();
		if (size < 5 || size > 15) {
			System.out.println(size+" is an invalid availability");
		} else {
			
			System.out.println("Enter the flat numbers:");
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
				
				if (arr[i] < 100 || arr[i] > 999) {
					System.out.println(arr[i]+" is an invalid flat number");
					isValid = false;
					break;
				} else {
					
					if (String.valueOf(arr[i]).startsWith("8")) {
						System.out.println(arr[i]+" will not be considered");
						isValid = false;
						break;
					} else {
						if (digSum(arr[i]) == 5) {
							luckynumbers.add(arr[i]);
							isFound = true;
						}
					}
				}
			}
			if (isValid) {
				if (isFound) {
					for (int i = 0; i < luckynumbers.size(); i++) {
						System.out.println(luckynumbers.get(i));
					}
				} else {
					System.out.print("There is no lucky flat in ");
					for (int i = 0; i < arr.length; i++) {
						System.out.print(arr[i]);
						if (i < arr.length-1) {
							System.out.print(",");
						}
					}
				}
			}
		}
		
	}
	
	public static int digSum(int n) { 
        if (n == 0)  
        return 0; 
        return (n % 9 == 0) ? 9 : (n % 9); 
    }
}
