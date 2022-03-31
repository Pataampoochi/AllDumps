package java_lc_cc.Ticket_Price_Calculation_Static;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ticket ticket = new Ticket();
		
		System.out.println("Enter no of bookings:");
		int bookingCount = sc.nextInt();
		System.out.println("Enter the available tickets:");
		int availableTickets = sc.nextInt();
		Ticket.setAvailableTickets(availableTickets);
		
		for (int i = 0; i < bookingCount; i++ ) {
			
			System.out.println("Enter the ticketid:");
			ticket.setTicketid(sc.nextInt());
			System.out.println("Enter the price:");
			ticket.setPrice(sc.nextInt());
			System.out.println("Enter the no of tickets:");
			int nooftickets = sc.nextInt();
			System.out.println("Available tickets: "+Ticket.getAvailableTickets());
			System.out.println("Total amount:"+ticket.calculateTicketCost(nooftickets));
			System.out.println("Available ticket after booking:"+Ticket.getAvailableTickets());
		}
	}
}
