import java.util.ArrayList;

public class Airline {

    private ArrayList<Flight> flightsList;

    public Airline() {

        this.flightsList = new ArrayList<Flight>();
    }

    // METHODS

    public void addFlight(Flight flight ) {
        flightsList.add(flight);
    }

    public void removeFlight(Flight flight) {
        flightsList.remove(flight);
    }

    // GETTERS AND SETTERS

    public ArrayList<Flight> getFlights() {
        return this.flightsList;
    }
}
