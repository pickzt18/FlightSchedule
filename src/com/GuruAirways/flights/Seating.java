package com.GuruAirways.flights;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Seating {
    public static final Scanner scan = new Scanner(System.in);
    static Map<String, Boolean> seatMap = new TreeMap<>();

    static {
        seatMap.put("1a", true);
        seatMap.put("1b", true);
        seatMap.put("2a", true);
        seatMap.put("2b", false);
        seatMap.put("3a", true);
        seatMap.put("3b", true);
        seatMap.put("4a", false);
        seatMap.put("4b", true);
        seatMap.put("5a", false);
        seatMap.put("5b", true);
    }

    public static Map<String, Boolean> getOpenSeats() {
        Map<String, Boolean> openSeatMap = new TreeMap<>();
        for (String seat : seatMap.keySet()) {
            if (seatMap.get(seat)) {
                openSeatMap.put(seat, seatMap.get(seat));
            }
        }
        return openSeatMap;
    }

    public static boolean checkOpenSeats(String seat) throws IllegalSeatException {

        if (seatMap.get(seat)) {
            System.out.println("Your selected seat is available");
            return true;
        } else {
            throw new IllegalSeatException("Seat already filled. Please select a different seat");
        }
    }
}

