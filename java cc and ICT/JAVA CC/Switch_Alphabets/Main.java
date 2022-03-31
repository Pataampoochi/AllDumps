package java_lc_cc.Switch_Alphabets;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o')
					|| (str.charAt(i) == 'u')) {
				str = str.replace(str.charAt(i), '#');
				count++;
			}
		}
		if (count == 0)
			System.out.println(str + " has no vowels");
		else
			System.out.println(str);

	}

}
