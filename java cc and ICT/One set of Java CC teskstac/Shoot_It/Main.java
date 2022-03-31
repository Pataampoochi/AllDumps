package java_lc_cc.Shoot_It;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		int count = 1;
		while (score < 100) {
			score = score + sc.nextInt();
			count = count + 1;
		}
		System.out.println("The number of turns is "+count);
	}

}
