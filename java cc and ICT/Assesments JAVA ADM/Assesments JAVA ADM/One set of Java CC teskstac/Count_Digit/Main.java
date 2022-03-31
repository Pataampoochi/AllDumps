package java_lc_cc.Count_Digit;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int r, count = 0;
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number < 1) {
			System.out.println(number+" falls behind the limit");
		} else if (number > 999999999) {
			System.out.println(number+" exceeds the limit");
		} else {
			
			int digitToFind = sc.nextInt();
			if (digitToFind < 0 || digitToFind > 9) {
				System.out.println(digitToFind+" is not valid");
			} else {
				
				int temp = number;
				while(temp > 0) {
		            r = temp % 10;
		            temp = temp / 10;
		            if (digitToFind == r) {
		            	count = count + 1;
		            }
		        }
				if (count == 0) {
					System.out.println(digitToFind+" is not available in "+number);
				} else {
					System.out.println("Count of "+digitToFind+" in "+number+" is "+count);
				}
			}
		}
	}

}
