package java_lc_cc.Hexa_2_Deci;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if (Main.isHexa(str) == false)
			System.out.println(str + " is invalid");
		else if ((4 > str.length()) || (str.length() > 5))
			System.out.println(str + " is a " + str.length() + " digit input");
		else
			System.out.println(Main.HexaToDeciConv(str));
	}

	public static long HexaToDeciConv(String hexa) {
		long sum = 0;int j=0;
		for (int i = hexa.length()-1;i>=0 ; i--)
			sum= (long) (sum+ Main.hexaDecimal(hexa.charAt(i))*Math.pow(16,j++));
		return sum;

	}

	public static int hexaDecimal(char hex) {
		switch (hex) {
		case 'A':
			return 10;
		case 'B':
			return 11;
		case 'C':
			return 12;
		case 'D':
			return 13;
		case 'E':
			return 14;
		case 'F':
			return 15;
		default:
			return Character.getNumericValue(hex);
		}
	}

	public static boolean isHexa(String hexa) {
		int count = 0;
		for (int i = 0; i < hexa.length(); i++) {
			if (!((65 <= (int) hexa.charAt(i)) && ((int) hexa.charAt(i) <= 70))
					&& !((48 <= (int) hexa.charAt(i)) && ((int) hexa.charAt(i) <= 57)))
				count++;
		}
		if (count > 0)
			return false;
		else
			return true;
	}
}
