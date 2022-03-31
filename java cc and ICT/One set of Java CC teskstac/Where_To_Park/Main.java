package java_lc_cc.Where_To_Park;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4 , total, n;
		System.out.println("B1");
		n1 = sc.nextInt();
		if (n1 < 0) {
			System.out.println(n1+" is not a valid input");
		} else {
			
			System.out.println("B2");
			n2 = sc.nextInt();
			if (n2 < 0) {
				System.out.println(n2+" is not a valid input");
			} else {
				
				System.out.println("B3");
				n3 = sc.nextInt();
				if (n3 < 0) {
					System.out.println(n3+" is not a valid input");
				} else {
					
					System.out.println("B4");
					n4 = sc.nextInt();
					if (n4 < 0) {
						System.out.println(n4+" is not a valid input");
					} else {
						
						 total = n1 + n2 + n3 + n4;
						 System.out.println("Car count");
						 n = sc.nextInt();
						 if ( n > total) {
							 System.out.println("Parking slots in full");
						 } else {
							 
							 if (n <= n1) {
								 System.out.println("The car can be parked at B1");
							 } else if (n <= n1 + n2) {
								 System.out.println("The car can be parked at B2");
							 } else if (n <= n1 + n2 + n3) {
								 System.out.println("The car can be parked at B3");
							 } else {
								 System.out.println("The car can be parked at B4");
							 }
						 }
					}
				}
			}
		}
		
	}

}
