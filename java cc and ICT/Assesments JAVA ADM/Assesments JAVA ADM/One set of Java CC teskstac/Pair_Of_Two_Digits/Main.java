package java_lc_cc.Pair_Of_Two_Digits;

import java.util.*;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int temp1 = n1;
		int n2 = sc.nextInt();
		int temp2 = n2;
		int rev ;
		
		rev = 0;
		while(n1 != 0) {
			int digit = n1 % 10;
			rev = rev * 10 + digit;
			n1 /= 10;
		}
		int rn1 = rev;
		
		rev = 0;
		while(n2 != 0) {
			int digit = n2 % 10;
			rev = rev * 10 + digit;
			n2 /= 10;
		}
		int rn2 = rev;
		
		if ((temp1 * temp2) == (rn1 * rn2)) {
			System.out.println(temp1+" and "+temp2+" are correct pair");
		} else {
			System.out.println(temp1+" and "+temp2+" are not correct pair");
		}

	}
}
