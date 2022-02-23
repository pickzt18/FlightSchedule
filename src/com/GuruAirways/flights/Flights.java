package com.GuruAirways.flights;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Flights {
    private static int flight;
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

    public static Map<Integer, Airports> fetchFlights(Airports airport){ // fetches next 5 flights to specified airport
        Map<Integer, Airports> flights = new HashMap();
        for(int i=0; i<5; i++){
            Integer integer = (int)(Math.random()*24);
            flights.put(integer,airport);
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

    public static int getDesiredFlight() {
        return flight;
    }

    public static void setDesiredFlight(int desiredFlight) {
        flight = desiredFlight;
    }
}
