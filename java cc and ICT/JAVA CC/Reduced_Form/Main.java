package java_lc_cc.Reduced_Form;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		
		if (size < 5 || size > 10) {
			System.out.println(size+" is an invalid array size");
		} else {
			
			int[] items = new int[size];
			for (int i = 0; i < size; i++) {
				items[i] = sc.nextInt();
			}
			items = convert(items);
			for (int i = 0; i < items.length; i++) {
				System.out.print(items[i]);
				if (i < items.length -1) {
					System.out.print(" ");
				}
			}
		}

	}
	
	public static int[] convert(int arr[]) { 
        
        int temp[] = arr.clone(); 
        Arrays.sort(temp); 
  
        HashMap<Integer, Integer> umap = new HashMap<>(); 
  
        int val = 0; 
        for (int i = 0; i < arr.length; i++) {
        	umap.put(temp[i], val++); 
        }

        for (int i = 0; i < arr.length; i++) {
        	arr[i] = umap.get(arr[i]); 
        }
        return arr;
    }

}
