package com.GuruAirways.flights;

import java.util.Date;

public class TicketFactory {
    static public Ticket createTicket(String seat, Date departureDate, Airports depart, Airports arrive) {
        switch (seat) {
            case "1a":
            case "2b":
            case "2a":
            case "1b":
                return new FirstClass(seat, departureDate, arrive);
            case "3a":
            case "3b":
            case "4a":
            case "4b":
            case "5a":
            case "5b":
                return new Economy(seat, departureDate, arrive);
        }
        return null;
    }
}
