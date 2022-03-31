import java.time.format.DateTimeFormatter;

import java.time.temporal.ChronoUnit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;

import java.util.TreeMap;
import java.util.Date;
import java.util.Map;

import java.util.Map.Entry;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("In-time");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate currTime = LocalDate.of(2019, 01, 01);
		String fdt=currTime.format(formatter);
	//	System.out.println(fdt);
		int no = sc.nextInt();
		Map<String, String> m = new TreeMap<>();
		for (int i = 1; i <= no; i++) {
			String id = sc.next();
			String date = sc.next();
			m.put(id, date);
		}
		int count = 0;
		int val = 0;
		for (Entry<String, String> entry : m.entrySet()) {
			if (entry.getValue().matches("(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/[0-9]{4}")) 
			{
				val++;
				LocalDate InTime = LocalDate.parse(entry.getValue(), formatter);
				Period in = Period.between(InTime, currTime);
				long lin = in.get(ChronoUnit.YEARS);
				if (lin >= 5) 
				{
					count++;
					System.out.println(entry.getKey());
				}
			} 
			else
			{
				System.out.println("Invalid date format");
				break;
			}
		}
		if (count == 0 && val == no)
			System.out.println("No one is eligible");
	}
}