package com.GuruAirways.flights;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class TicketTest {
    @Test
    public void checkTicket() throws ParseException, IllegalSeatException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyy HH:mm");
        Ticket tick=TicketFactory.createTicket("1a", formatter.parse("12-24-2022 12:30"), Airports.MKE, Airports.MSP);
        Ticket tick2=TicketFactory.createTicket("4b", formatter.parse("12-24-2022 12:30"), Airports.MKE, Airports.MSN);
        System.out.println(tick);
        System.out.println(tick2);
    }
}