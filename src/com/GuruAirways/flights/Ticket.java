package com.GuruAirways.flights;

import java.util.Date;

public interface Ticket {
    public void setSeat(String seat);
    public void setDepart(Airports depart);
    public void setArrive(Airports arrive);
    public void setDepartureDate(Date departureDate);
}
