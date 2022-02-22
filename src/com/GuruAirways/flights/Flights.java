package com.GuruAirways.flights;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Flights {
    private Map flights;
    private Date date;

    public Flights(Date date){
        setDate(date);
    }

    //sets date of object and "fetches the flights of that day"
    public void setDate(Date date){
        this.date=date;
        flights = fetchFlights();
    }
    public Date getDate(){
        return date;
    }
    public Map<Integer, Airports> getFlights(){
        return flights;
    }

    //pulls flights of specified date from "server"
    private Map<Integer, Airports> fetchFlights(){
        Map<Integer, Airports> flights = new HashMap<>();
        for (int i=0; i< 24; i++){ //"get request" just random airports
            Airports curAirport = Airports.values()[(int)(Math.random()*(Airports.values().length-1))+1];
            flights.put(i, curAirport);
        }
        return flights;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flights=" + flights +
                ", date=" + date +
                '}';
    }
}
