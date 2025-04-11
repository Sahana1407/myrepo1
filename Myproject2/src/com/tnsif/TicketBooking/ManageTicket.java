package com.tnsif.TicketBooking;

public class ManageTicket {

	static int ticket = 10; // Total number of tickets

    // Method to display the total tickets available
    public void displayTickets() {
        System.out.println("Total Tickets Available: " + ticket);
    }

    // Method to book a ticket
    public void bookTicket() {
        if (ticket > 0) {
            ticket--;
            System.out.println("Ticket booked successfully! Remaining tickets: " + ticket);
        } else {
            System.out.println("Sorry, no tickets available.");
        }
    }

}
