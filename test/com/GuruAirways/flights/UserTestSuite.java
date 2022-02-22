package com.GuruAirways.flights;

import org.junit.Test;

import java.util.Scanner;

public class UserTestSuite {
    @Test
    public void testBuyTicket(){
        Scanner in = new Scanner(System.in);
        User user = new User("test");
        user.buyTicket(in);
    }
}
