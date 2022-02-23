package com.GuruAirways.flights;

import org.junit.Test;

import java.util.Scanner;

public class UserTestSuite {
    @Test
    public void testBuyTicket(){
        User user = new User("test");
        user.buyTicket();
    }
}
