import com.GuruAirways.flights.Airports;
import com.GuruAirways.flights.Flights;
import org.junit.*;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.Map;

public class FlightsTestSuite {
    Flights flights = new Flights(new Date());
    @Before
    public void init(){
        flights = new Flights(new Date());
    }
    @Test
    public void testNoNull(){
        Map<Integer, Airports> testFlights = flights.getFlights();
        for(Airports airport : testFlights.values()){
            assertTrue(airport instanceof Airports);
        }
    }
    @Test
    public void testString(){
        System.out.println(flights.toString());
        assertEquals("Flights{" +
                "flights=" + flights.getFlights() +
                ", date=" + flights.getDate() +
                '}',flights.toString() );
    }
}
