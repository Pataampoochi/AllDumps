package java_lc_cc.Unique_Products;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isValid = true;
		
		System.out.println("Enter the number of items:");
		int itemCount = sc.nextInt();
		ArrayList<Integer> uniqueItems = new ArrayList<Integer>();
		
		if (itemCount < 5 || itemCount > 20) {
			System.out.println(itemCount+" is an invalid item count");
		} else {
			
			System.out.println("Enter the bar code ID for "+itemCount+" items:");
			int[] items = new int[itemCount];
			for (int i = 0; i < itemCount; i++) {
				
				items[i] = sc.nextInt();
				if (items[i] < 100 || items[i] > 999) {
					
					System.out.println(items[i]+" is an invalid bar code ID");
					isValid = false;
					break;
				} else {
					
					if (hasUniqueDigits(items[i])) {
						uniqueItems.add(items[i]);
					}
				}
			}
			if (isValid) {
				if (uniqueItems.size() > 0) {
					for (int i = 0; i <uniqueItems.size(); i++) {
						System.out.println(uniqueItems.get(i));
					}
					System.out.println("There are "+uniqueItems.size()+" items with Unique number in the bar code ID");
				} else {
					System.out.print("There are no items with Unique number in ");
					for (int i = 0; i < itemCount; i++) {
						System.out.print(items[i]);
						if (i < itemCount - 1) {
							System.out.print(",");
						}
					}
				}
			}
		}
	}
	
	public static boolean hasUniqueDigits(int n) { 
	    LinkedHashSet<Integer> s = new LinkedHashSet<>(); 
	  
	    while (n != 0) { 
	        
	    	int d = n % 10; 
	        if (s.contains(d)) { 
	            return false; 
	        } 
	        s.add(d); 
	        n = n / 10; 
	    } 
	    return true; 
	}

}
