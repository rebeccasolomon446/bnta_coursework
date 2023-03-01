import java.util.ArrayList;

public class Flight {

    private String destination;
    private Integer id;
    private String status;
    private ArrayList<Passenger> passengers;



    public Flight(String destination, Integer id, String status) {
        this.destination = destination;
        this.id = id;
        this.status =status;
        this.passengers = new ArrayList<>();

    }

    // METHODS

    public void addPassenger(Passenger passenger) {

        passengers.add(passenger);
    }

 // GETTERS AND SETTERS

    public String getDestination() {
        return this.destination;
    }

    public Integer getId() {
        return this.id;
    }

    public String getStatus() {
        return this.status;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

}
