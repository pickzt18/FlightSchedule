import com.GuruAirways.flights.IllegalSeatException;
import com.GuruAirways.flights.Seating;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FlightClient {
    public static void main(String[] args) {
        Boolean filled = true;
        Scanner scan = new Scanner(System.in);
        Map<String, Boolean> openSeats = (TreeMap<String, Boolean>) Seating.getOpenSeats();
        do {
            System.out.println("Please select an available seat: " + openSeats.keySet());
            String seat = scan.nextLine();
            try {
                if (Seating.checkOpenSeats(seat)) {
                    filled = false;
                    System.out.println("Book");
                }

            } catch (IllegalSeatException e) {
                System.out.println(e.getMessage());
            }
        } while (filled);
    }


}

