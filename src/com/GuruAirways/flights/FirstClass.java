package com.GuruAirways.flights;

import java.util.Date;

public class FirstClass implements Ticket {
    private final int RATE = 200;
    private final Airports DEPART = Airports.MKE;
    private Date departureDate;
    private Airports arrive;
    private String seat;
    private String ticketType = "First Class";
    private Flights flight;

    public FirstClass() {
    }

    public FirstClass(String seat) {
        this();
        setSeat(seat);
    }

    public FirstClass(String seat, Airports arrive) {
        this(seat);
        setArrive(arrive);
    }

    public FirstClass(String seat, Date departureDate, Airports arrive) {
        this(seat, arrive);
        setDepartureDate(departureDate);
    }


    @Override
    public void setSeat(String seat) {
        this.seat = seat;
    }


    @Override
    public String toString() {
        return "FirstClass{" +
                "RATE=$" + RATE +
                ", DEPART=" + DEPART +
                ", departureDate=" + departureDate +
                ", arrive=" + arrive +
                ", seat='" + seat + '\'' +
                ", ticketType='" + ticketType + '\'' +
                ", flight=" + flight +
                '}';
    }

    @Override
    public void setArrive(Airports arrive) {
        this.arrive = arrive;
    }

    @Override
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
        getFlight();
    }

    @Override
    public void getFlight() {
        this.flight = new Flights(departureDate);
    }
}
