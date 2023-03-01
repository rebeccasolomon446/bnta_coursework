import java.util.ArrayList;
import java.util.Scanner;

public class runner {

    public static void main(String[] args) {

        // Initialising a new airline object to add flights to
        Airline bestAirlines = new Airline();

        // Initialising new flight
        Flight flight1 = new Flight("Tokyo", 2675, "active");
        Flight flight2 = new Flight("Singapore", 3693, "active");
        Flight flight3 = new Flight("Thailand", 3693, "cancelled");

        // Adding flights to airline
        bestAirlines.addFlight(flight1);
        bestAirlines.addFlight(flight2);
        bestAirlines.addFlight(flight3);

        // Printing out available flights to the command line:
        // Need to loop through flights and print
        for(Flight flight : bestAirlines.getFlights()) {
            System.out.println(String.format("Flight destinations: %s. Flight ID: %s. Flight status: %s",flight.getDestination(),flight.getId(), flight.getStatus()));
        }

        // Allowimg user to input a new destination to add to available flights
        Scanner scanner = new Scanner(System.in);
        ArrayList<Flight> newflights = new ArrayList<Flight>();
        System.out.println("Enter a new flight destination");
        String destination1 = scanner.nextLine();
        Flight flight = new Flight("France", 22334, "active");
        flight.setDestination(destination1);
        newflights.add(flight);





    }
}
