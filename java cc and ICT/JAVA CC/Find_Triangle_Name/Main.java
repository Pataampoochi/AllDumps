package java_lc_cc.Find_Triangle_Name;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if (a <= 0) {
			System.out.println(a+" is an Invalid Length");
		} else {
			
			int b = sc.nextInt();
			if (b <= 0) {
				System.out.println(b+" is an Invalid Length");
			} else {
				
				int c = sc.nextInt();
				if (c <= 0) {
					System.out.println(c+" is an Invalid Length");
				} else {
					
					if (a == b && b == c) {
						System.out.println(a+", "+b+", "+c+" are the sides of Equilateral Triangle");
					} else if (a == b || a == c) {
						System.out.println(a+", "+b+", "+c+" are the sides of Isosceles Triangle");
					} else if (b == c || b == a) {
						System.out.println(a+", "+b+", "+c+" are the sides of Isosceles Triangle");
					} else {
						System.out.println(a+", "+b+", "+c+" are the sides of Scalene Triangle");
					}
				}
			}
		}

	}

}
