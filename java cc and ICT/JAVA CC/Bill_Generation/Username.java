package java_lc_cc.Bill_Generation;

import java.util.Scanner;

public class Username {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought");
		int pizzas = sc.nextInt();
		System.out.println("Enter the no of puffs bought");
		int puffs = sc.nextInt();
		System.out.println("Enter the no of cool drinks bought");
		int drinks = sc.nextInt();
		
		System.out.println("Bill Details");
		System.out.println("No of pizzas");
		System.out.println(pizzas);
		System.out.println("No of puffs");
		System.out.println(puffs);
		System.out.println("No of cool drinks");
		System.out.println(drinks);
		System.out.println("Total price");
		System.out.println((pizzas*100)+(puffs*20)+(drinks*10));
		System.out.println("ENJOY THE SHOW!!!");

	}

}
