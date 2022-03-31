package java_lc_cc.Passenger_Details;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. of passengers:");
		int no_of_passengers = Integer.parseInt(br.readLine());
		int ticketid = 0;
		String name = "";
		String gender = "";
		String address = "";
		for (int i = 0; i < no_of_passengers; i++) {
			System.out.println("Passenger " + (i + 1));
			System.out.println("Enter the ticketid");
			ticketid = Integer.parseInt(br.readLine());
			System.out.println("Enter the name");
			name = br.readLine();
			System.out.println("Enter the gender");
			gender = br.readLine();
			System.out.println("Enter the address");
			address = br.readLine();
		}
		for (int i = 0; i < no_of_passengers; i++) {
			Passenger obj = new Passenger(ticketid, name, gender, address);
			System.out.println(obj);
		}
	}

}