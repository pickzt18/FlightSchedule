package com.GuruAirways.flights;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class User {
    public String name;
    List<Ticket> tickets = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public User(String name) {
        this.name = name;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void buyTicket() {
        String input;
        Integer month = null;
        Integer day = null;
        Integer year = null;
        Date date = null;
        Boolean another = true;
        try {
            System.out.println("enter Month 01-12");
            input = in.next();
            month = Integer.parseInt(input);
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: {
                    System.out.println("enter Day 01-31");
                    input = in.next();
                    day = Integer.parseInt(input);
                    break;
                }
                case 2: {
                    System.out.println("enter Day 0-28");
                    input = in.next();
                    day = Integer.parseInt(input);
                    break;
                }
                default: {
                    System.out.println("enter Day 0-30");
                    input = in.next();
                    day = Integer.parseInt(input);
                    break;
                }
            }
            System.out.println("enter Year ");
            input = in.next();
            year = Integer.parseInt(input);
            date = makeDate(month, day, year);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            date = null;
        }
        Flights flightsToday = new Flights(date);
        System.out.println("Pick a Flight by entering the departure time");
        System.out.println(flightsToday.getFlights());
        Integer desiredFlight = null;
        while (desiredFlight == null) {
            try {
                input = in.next();
                int integer = Integer.parseInt(input);
                if (integer < 24 && integer > 0) {
                    desiredFlight = integer;
                    Flights.setDesiredFlight(desiredFlight);
                }
            } catch (IllegalArgumentException e) {
                e.getMessage();
                desiredFlight = null;
            }
        }
        Airports destination = flightsToday.getFlights().get(desiredFlight);
        String desiredSeat = null;
        while (another) {
            System.out.println("Please select an available seat: " + Seating.getOpenSeats().keySet());
            String seat = in.next();
            try {
                if (Seating.checkOpenSeats(seat)) {
                    desiredSeat = seat;
                    Seating.seatMap.put(seat, false);
                }
            } catch (IllegalSeatException e) {
                System.out.println(e.getMessage());
            }
            tickets.add(TicketFactory.createTicket(desiredSeat, date, Airports.MKE, destination));
            System.out.println("Book another ticket? Y or N");
            if (in.next().equalsIgnoreCase("N")) {
                another = false;
            }
        }

    }

    private Date makeDate(int month, int day, int year) throws IllegalArgumentException {
        if (month > 12 || month < 1) { // check valid month
            throw new IllegalArgumentException("Invalid month(1-12)");
        }
        switch (month) { //check valid days based on month
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                if (day > 31 || day < 1) throw new IllegalArgumentException("Invalid day(1-31");
            }
            case 2: {
                if (day > 28 || day < 1) throw new IllegalArgumentException("Invalid day(1-28");
            }
            default: {
                if (day > 30 || day < 1) throw new IllegalArgumentException("Invalid day(1-30");
            }
        }
        if (year > 2024 || year < 2022) throw new IllegalArgumentException("Invalid year (2022-2024");
        Date date = new Date(year, month, day);
        if (new Date().after(date)) throw new IllegalArgumentException("Cannot schedule for past flights");
        return date;
    }

    public void exportTickets() {
        File file = new File("output.txt");
        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(new FileWriter(file.getPath()));
            for (Ticket ticket : tickets) {
                writer.println(ticket);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
/*////////////////
        if(true) {
            while (month == null) {
                try {
                    input = in.next();
                    int integer = Integer.parseInt(input);
                    if (integer > 1 || integer < 13) {
                        month = integer;
                    } else {
                        throw new IllegalArgumentException("Enter a number 1-12");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Enter a number 01-12");
                }
            }
            System.out.println("Please enter the day you want to travel");
            while (day == null) {
                try {
                    input = in.next();
                    int integer = Integer.parseInt(input);
                    if (integer > 1 || integer < 31) {
                        day = integer;
                    } else {
                        throw new IllegalArgumentException("Enter a number 1-31");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Enter a number 01-31");
                }
            }
            System.out.println("Enter the year you would like to travel");
            while (year == null) {
                try {
                    input = in.next();
                    int integer = Integer.parseInt(input);
                    if (integer > 1 || integer < 13) {
                        year = integer;
                    } else {
                        throw new IllegalArgumentException("Enter a number 2022-2024");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Enter a number 2022-2024");
                }
            }
            Date date = new Date(month, day, year);
        } else {

        }
        */