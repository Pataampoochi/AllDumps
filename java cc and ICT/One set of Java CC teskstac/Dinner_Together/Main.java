package java_lc_cc.Dinner_Together;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int sam, riya, max, step, lcm = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day interval of Sam:");
		sam = sc.nextInt();
		System.out.println("Enter the day interval of Riya:");
		riya = sc.nextInt();
		
		if (sam < 1 || riya < 1) {
			System.out.println(sam+" to "+riya+" is not a valid interval");
		} else {
			if(sam > riya) {
				max = step = sam;
			} else {
				max = step = riya;
			}

			while(sam!= 0) {
				if(max % sam == 0 && max % riya == 0) {
					lcm = max;
					break;
				}
				max += step;
			}
			System.out.println("Sam and Riya will have their dinner on day "+lcm);
		}
		
	}

}


