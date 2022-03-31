package java_lc_cc.Substract_The_Max;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		
		if (size < 3 || size > 20) {
			System.out.println(size+" is an invalid size");
		} else {
			
			Integer[] items = new Integer[size];
			System.out.println("Enter array elements:");
			for (int i = 0; i < size; i++) {
				items[i] = sc.nextInt();
			}
			
			int max = (int) Collections.max(Arrays.asList(items));
			for (int i = 0; i < items.length; i++) {
				System.out.println(max-items[i]);
			}
		}
	}

}
