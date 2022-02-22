package com.GuruAirways.flights;

import org.junit.Test;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SeatingTest {

    @Test
    public void getOpenSeats() {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter input");
        String input = scan.nextLine();*/
        Map<String, Boolean> openSeats = (TreeMap<String, Boolean>) Seating.getOpenSeats();
        System.out.println(openSeats);
        for (var s : openSeats.keySet()) {
            System.out.println(s);
        }
    }


    @Test
    public void checkOpenSeats() {
        try {
            Seating.checkOpenSeats("1a");
            Seating.checkOpenSeats("5a");
            Seating.checkOpenSeats("1a");
        } catch (IllegalSeatException e) {
            System.out.println(e);
        }

    }
}


