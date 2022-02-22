package com.GuruAirways.flights;

import java.util.Date;

public interface Ticket {
    void setSeat(String seat);
    void setArrive(Airports arrive);
    void setDepartureDate(Date departureDate);
    public void getFlight();
}
