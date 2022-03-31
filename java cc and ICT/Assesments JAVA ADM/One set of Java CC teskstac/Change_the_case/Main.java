package java_lc_cc.Change_the_case;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if (str.length() < 3)
			System.out.println("String length of " + str.length() + " is too short");
		else if (str.length() > 10)
			System.out.println("String length of " + str.length() + " is too long");
		else {
			
			if (Main.checkValidity(str).size() == 0) {
				char ch = (char) br.read();
				if (Main.alterString(str, ch).equals(str))
					System.out.println("Character not found");
				else
					System.out.println(Main.alterString(str, ch));
			} else {
				System.out.print("String should not contain ");
				for (char c : Main.checkValidity(str))
					System.out.print(c);
			}
		}
	}

	public static String alterString(String str, char ch) {
		     String newstr = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(ch))
				newstr = newstr + Main.altercase(str.charAt(i));
			else
				newstr = newstr + str.charAt(i);
		}
		return newstr;
	}

	public static char altercase(char c) {
		if (Character.isUpperCase(c))
			return Character.toLowerCase(c);
		else
			return Character.toUpperCase(c);

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
