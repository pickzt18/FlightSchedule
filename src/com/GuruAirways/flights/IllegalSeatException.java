package com.GuruAirways.flights;

public class IllegalSeatException extends Throwable {
    public IllegalSeatException(String e) {
        System.out.println(e);
    }
}
