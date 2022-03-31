package java_lc_cc.Volume_of_Sphere;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int radius;
				
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,##0.0"); 
		
		System.out.println("Enter radius:");
		radius=sc.nextInt();
				
			// create object
		Shape obj = new Sphere(radius);
		System.out.println("Volume of Sphere is "+df.format(obj.calculateVolume()));
		
	}
}
