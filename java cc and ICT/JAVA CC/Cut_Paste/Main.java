package java_lc_cc.Cut_Paste;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();
		System.out.println("Position:");
		int pos = Integer.parseInt(br.readLine());
		if (pos < 1)
			System.out.println("String cannot contain Position " + pos);
		else if (pos > str.length())
			System.out.println("Position exceeds the string " + str);
		else {
			String newstr = "";
			for (int i = 0; i < str.length(); i++) {
				if ((i+1) == pos)
					continue;
				else
					newstr = newstr + str.charAt(i);
			}
			System.out.println(newstr);
		}
	}

}
