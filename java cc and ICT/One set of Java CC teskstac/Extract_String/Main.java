package java_lc_cc.Extract_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if (str.length() < 2)
			System.out.println("Length of the string " + str + " is too low");
		else if (str.length() > 10)
			System.out.println("Length of the string " + str + " is too high");
		else {
			int mid = str.length() / 2;
			String newstr = "";
			if (Main.isValid(str)) {
				int c = 0;
				for (int i = 0; i < str.length(); i++) {
					c = i + mid;
					if (c < str.length())
						newstr = newstr + str.charAt(c);
					else
						break;
				}
				//newstr = newstr.replace(newstr.charAt(0), Character.toUpperCase(newstr.charAt(0)));
				String newstr1="";
				for(int i=1;i<newstr.length();i++)
			        newstr1=newstr1+newstr.charAt(i);
				System.out.println(Character.toUpperCase(newstr.charAt(0))+newstr1);
			}

			else
				System.out.println(str + " is Invalid");
		}

	}

	public static boolean isValid(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (((65 <= (int) str.charAt(i)) && ((int) str.charAt(i) <= 90))
					|| ((97 <= (int) str.charAt(i)) && ((int) str.charAt(i) <= 122)) || ((int) str.charAt(i) == 32))
				count++;
		}
		if (count != (str.length()))
			return false;
		else
			return true;
	}

}
