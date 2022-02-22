package com.GuruAirways.flights;

import java.util.HashMap;
import java.util.Map;

public class Seating {
    Map<String, Boolean> seatMap = new HashMap<>();

    public Map getOpenSeats(String seat) {
    seatMap.put("1a",true);
    seatMap.put("1b",true);
    seatMap.put("2a",true);
    seatMap.put("2b",true);
    seatMap.put("3a",true);
    seatMap.put("3b",true);
    seatMap.put("4a",true);
    seatMap.put("4b",true);
    seatMap.put("5a",true);
    seatMap.put("5b",true);
    return seatMap;
    }

    public Boolean checkOpenSeats(String seat){
        return seatMap.get(seat);
    }
}
