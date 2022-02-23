
import com.GuruAirways.flights.Ticket;
import com.GuruAirways.flights.User;
import java.util.List;
import java.util.Scanner;

public class FlightClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name= in.nextLine();
        User passenger=new User(name);
        passenger.buyTicket();
        List<Ticket> tickets=passenger.getTickets();
        for(var ticket:tickets){
            System.out.println(ticket);
        }
        passenger.exportTickets();
    }


}

