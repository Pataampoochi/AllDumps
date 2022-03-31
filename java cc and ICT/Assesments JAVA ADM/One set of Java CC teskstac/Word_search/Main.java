package java_lc_cc.Word_search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	static int a, b;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str = br.readLine();
		if (Main.checkValidity(str).size() == 0) {
			System.out.println("Enter the string to be searched");
			String tbsearched = br.readLine();
			if (Main.checkValidity(tbsearched).size() == 0) {
				if (Main.findOccurrence(str, tbsearched) == 0)
					System.out.println(tbsearched + " not found");
				else if (Main.findOccurrence(str, tbsearched) == 1)
					System.out.println(a + (b - 1));
				else
					System.out.println(tbsearched + " is found more than once");
			} else
				{
				    System.out.print("String should not contain ");
				    for (char c : Main.checkValidity(tbsearched))
					System.out.print(c);
				}

		} else
			{System.out.print("String should not contain ");
			    for (char c : Main.checkValidity(str))
				System.out.print(c);
			    
			}
	}

	public static int findOccurrence(String str, String sub) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				if (str.substring(i, j).equalsIgnoreCase(sub)) {
					count++;
					a = i;
					b = j;
				}
			}
		}
		return count;
	}

	public static List<Character> checkValidity(String str) {
		List<Character> ch = new ArrayList<>();
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (((65 <= (int) str.charAt(i)) && ((int) str.charAt(i) <= 90))
					|| ((97 <= (int) str.charAt(i)) && ((int) str.charAt(i) <= 122)) || ((int) str.charAt(i) == 32))
				continue;
			else
				ch.add(str.charAt(i));
		}
		return ch;

	}
}
