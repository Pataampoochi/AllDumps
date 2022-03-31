package java_lc_cc.Ticket_Price_Calculation_Static;

public class Ticket {
	
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public Ticket() {
		
	}
	
	public Ticket(int ticketid, int price) {
		this.ticketid = ticketid;
		this.price = price;
	}
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = (availableTickets > 0) ? availableTickets : Ticket.availableTickets;
	}
	
	public int calculateTicketCost(int nooftickets) {
		if(Ticket.availableTickets - nooftickets >= 0 ) {
			Ticket.availableTickets = Ticket.availableTickets - nooftickets;
			return nooftickets * this.price;
		} else {
			return -1;
		}
	}
	
}
