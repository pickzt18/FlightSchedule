package com.GuruAirways.flights;

import java.util.Date;

public class FirstClass implements Ticket {
    Date departureDate;
    Airports depart;
    Airports arrive;
    private String seat;
    private String ticketType="First Class";

    public FirstClass() {
    }

    public FirstClass(String seat) {
        setSeat(seat);
    }

    public FirstClass(String seat, Airports arrive) {
        this(seat);
        setArrive(arrive);
    }

    public FirstClass(String seat, Airports depart, Airports arrive) {
        this(seat, arrive);
        setDepart(depart);
    }

    public FirstClass(String seat, Date departureDate, Airports depart, Airports arrive) {
        this(seat, depart, arrive);
        setDepartureDate(departureDate);
    }



    @Override
    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "departureDate=" + departureDate +
                ", depart=" + depart +
                ", arrive=" + arrive +
                ", seat='" + seat + '\'' +
                ", ticketType='" + ticketType + '\'' +
                '}';
    }

    @Override
    public void setDepart(Airports depart) {
        this.depart = depart;
    }

    @Override
    public void setArrive(Airports arrive) {
        this.arrive = arrive;
    }

    @Override
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
}
