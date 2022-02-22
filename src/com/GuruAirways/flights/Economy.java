package com.GuruAirways.flights;

import java.util.Date;

public class Economy implements Ticket{
    private String seat;
    private Date departureDate;
    private Airports depart;
    private Airports arrive;
    private String ticketType="Economy";

    @Override
    public String toString() {
        return "Economy{" +
                "seat='" + seat + '\'' +
                ", departureDate=" + departureDate +
                ", depart=" + depart +
                ", arrive=" + arrive +
                ", ticketType='" + ticketType + '\'' +
                '}';
    }

    public Economy(String seat) {
        setSeat(seat);
    }

    public Economy(String seat, Airports arrive) {
        this(seat);
        setArrive(arrive);
    }

    public Economy(String seat, Airports depart, Airports arrive) {
        this(seat, arrive);
        setDepart(depart);
    }

    public Economy(String seat, Date departureDate, Airports depart, Airports arrive) {
        this(seat, depart, arrive);
        setDepartureDate(departureDate);
    }

    @Override
    public void setSeat(String seat) {
        this.seat=seat;
    }

    @Override
    public void setDepart(Airports depart) {
        this.depart=depart;
    }

    @Override
    public void setArrive(Airports arrive) {
        this.arrive=arrive;
    }

    @Override
    public void setDepartureDate(Date departureDate) {
        this.departureDate=departureDate;
    }
}
