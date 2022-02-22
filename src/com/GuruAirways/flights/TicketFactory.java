package com.GuruAirways.flights;

import java.util.Date;

public class TicketFactory {
    static public Ticket createTicket(String seat, Date departureDate, Airports depart, Airports arrive) throws IllegalSeatException {
        switch(seat){
            case "1a", "1b", "2a", "2b":return new FirstClass(seat, departureDate, depart, arrive);
            case "3a", "3b", "4a", "4b", "5a", "5b":return new Economy(seat, departureDate,depart,arrive);
            default: throw new IllegalSeatException("Invalid seat");
        }
    }
}
