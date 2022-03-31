package java_lc_cc.Fetch_Mid_Characters;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string:");
		while(true)
		{
			String str = br.readLine();
			if (str.length() < 3)
			{System.out.println("The string " + str + " is too short");
			break;
			}
			boolean flag=true;
			for(int j=0;j<str.length();j++)
			{   char c = str.charAt(j);
			if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) 
				flag=false;
			}
			if (flag==false){
				ArrayList<Character> ar = new ArrayList<>();
				System.out.print("The string should not have");
				for (int i = 0; i < str.length(); i++) {
					char c = str.charAt(i);
					if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) 
						ar.add(c);
				}

				for(char a:ar)
					System.out.print(a);
				break;
			}

			else {
				System.out.println("Middle characters:");
				if (str.length() % 2 == 0) {
					System.out.println(str.substring(((str.length() / 2) - 1), ((str.length() / 2) + 1)));
				} else {
					System.out.println(str.charAt(str.length() / 2));
				}
				break;
			}

		}

	}
}
