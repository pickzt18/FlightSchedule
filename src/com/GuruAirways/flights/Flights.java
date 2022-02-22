package com.GuruAirways.flights;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

enum Airline{};
class Flights {
    private Map<Integer, Airline> flights;
    Map<Integer, Airline> getFlights(Date date){
        for (int i=0; i< 24; i++){ //"get request" just random airports
            Airline curAirline = Airline.values()[(int)Math.random()*Airline.values().length];
            flights.put(i, curAirline);
        }
        return flights;
    }
}
