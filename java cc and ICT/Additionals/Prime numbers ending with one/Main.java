import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// fill the code

		int low, high;
		int last=0;
		int flag = 0;
		System.out.println("Enter the first number");
		low = sc.nextInt();
		System.out.println("Enter the last number");
		high = sc.nextInt();
		if (low > high || low < 0 || high < 0 || low == high)
			;
		else {
			int i = low;
			high = high + 30;
			while (i <= high-1) {
				int x = i % 10;
				for (int j = 2; j <= i / 2; j++) {

					if (i % j != 0 && x == 1) {
						flag = 1;
					} else {
						flag = 0;
						break;
					}
				}
				
			

				if (flag == 1 )
					System.out.println(i);
				i++;
			}
		}
	}
}