package Handsons;

public class Ticket {
	
	
	     private int ticketid;
	     private int price;
	     private static int availableTickets;
	     public void setTicketid(int id)
	     {
	         this.ticketid=id;
	     }
	     public int getTicketid()
	     {
	         return this.ticketid;
	     }
	     public void setPrice(int p)
	     {
	         this.price=p;
	     }
	     public int getPrice()
	     {
	         return this.price;
	     }
	     public static void setAvailableTickets(int ticket)
	     {
	         if(ticket<=0)
	         System.out.println("Available Tickets should be greater than 0");
	        else 
	         availableTickets=ticket;
	     }
	     public static int getAvailableTickets()
	     {
	         return availableTickets;
	     }
	     public int calculateTicketCost(int nooftickets)
	     {
	         int ticket=getAvailableTickets();
	         if(ticket<nooftickets)
	         return -1;
	         else
	         {
	             int price=getPrice();
	             int available=ticket-nooftickets;
	             setAvailableTickets(available);
	             int amount=nooftickets*price;
	             return amount;
	         }
	     }
	 

}
