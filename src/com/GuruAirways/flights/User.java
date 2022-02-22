package com.GuruAirways.flights;

import java.util.Date;
import java.util.Scanner;

public class User {
    String name;
    Ticket[] tickets;

    public User(String name){
        this.name = name;
    }

    public void getFlights()

    public void buyTicket(Scanner in){
        String input;
        Integer month = null;
        Integer day = null;
        Integer year = null;
        System.out.println("Please enter the month you want to travel");
        while(month==null){
            try{
                input = in.next();
                int integer = Integer.parseInt(input);
                if(integer>1 || integer<13){
                    month = integer;
                } else {
                    throw new IllegalArgumentException("Enter a number 1-12");
                }
            } catch(IllegalArgumentException e){
                System.out.println("Enter a number 01-12");
            }
        }
        System.out.println("Please enter the day you want to travel");
        while(day==null){
            try{
                input = in.next();
                int integer = Integer.parseInt(input);
                if(integer>1 || integer<31){
                    day = integer;
                } else {
                    throw new IllegalArgumentException("Enter a number 1-31");
                }
            } catch(IllegalArgumentException e){
                System.out.println("Enter a number 01-31");
            }
        }
        System.out.println("Enter the year you would like to travel");
        while(year==null){
            try{
                input = in.next();
                int integer = Integer.parseInt(input);
                if(integer>1 || integer<13){
                    year = integer;
                } else {
                    throw new IllegalArgumentException("Enter a number 2022-2024");
                }
            } catch(IllegalArgumentException e){
                System.out.println("Enter a number 2022-2024");
            }
        }
        Date date = new Date(month,day,year);

    }
}
