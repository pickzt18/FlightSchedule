package com.GuruAirways.flights;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Seating {
    public static final Scanner scan = new Scanner(System.in);
    String input = Seating.scan.next();

    static Map<String, Boolean> seatMap = new HashMap<>();

    static public Map getOpenSeats(String seat) {
        seatMap.put("1a", true);
        seatMap.put("1b", true);
        seatMap.put("2a", true);
        seatMap.put("2b", true);
        seatMap.put("3a", true);
        seatMap.put("3b", true);
        seatMap.put("4a", true);
        seatMap.put("4b", true);
        seatMap.put("5a", true);
        seatMap.put("5b", true);
        return seatMap;
    }

     public void checkOpenSeats(String seat) {
//        return seatMap.get(seat);

        if (seatMap.containsValue(input)) {
            System.out.println("Seat already filled. Please select a different seat");
//            return false;
        } else {
            seatMap.put(seat, false);
            System.out.println("Your selected seat is available");
        }
//        return true;
    }
}

//(input.compareTo((seatMap.keySet(i))))