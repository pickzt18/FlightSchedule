package com.GuruAirways.flights;

import java.util.Date;

public class Economy implements Ticket{
    private final int RATE=100;
    private String seat;
    private Date departureDate;
    private final Airports DEPART=Airports.MKE;
    private Airports arrive;
    private String ticketType="Economy";
    private Flights flight;

    @Override
    public String toString() {
        return "Economy{" +
                "RATE=$" + RATE +
                ", seat='" + seat + '\'' +
                ", departureDate=" + departureDate +
                ", DEPART=" + DEPART +
                ", arrive=" + arrive +
                ", ticketType='" + ticketType + '\'' +
                ", flight=" + flight +
                '}';
    }

    public Economy(){}
    public Economy(String seat) {
        this();
        setSeat(seat);
    }

    public Economy(String seat, Airports arrive) {
        this(seat);
        setArrive(arrive);
    }

    public Economy(String seat, Date departureDate, Airports arrive) {
        this(seat, arrive);
        setDepartureDate(departureDate);
    }

    @Override
    public void setSeat(String seat) {
        this.seat=seat;
    }


    @Override
    public void setArrive(Airports arrive) {
        this.arrive=arrive;
    }

    @Override
    public void setDepartureDate(Date departureDate) {
        this.departureDate=departureDate;
        getFlight();
    }
    public void getFlight(){
        this.flight=new Flights(departureDate);
    }
}
