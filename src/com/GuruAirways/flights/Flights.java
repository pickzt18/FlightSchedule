package com.GuruAirways.flights;

import java.util.Date;
import java.util.Map;

class Flights {
    Map<Integer, Airports> getFlights(Date date){
        Map<Integer, Airports> flights = null;
        for (int i=0; i< 24; i++){ //"get request" just random airports
            Airports curAirport = Airports.values()[(int)Math.random()*Airports.values().length];
            flights.put(i, curAirport);
        }
        return flights;
    }
}
