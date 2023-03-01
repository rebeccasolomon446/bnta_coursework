import java.util.ArrayList;
import java.util.List;

public class Room {
    //property declaration create a space in memory and give it a label
    private String name;
    private String description;
    private List<Room> adjacentRooms;
   private Li
    private NPC npc;

    public Room(String name, String description, List<Room> adjacentRooms) {
        //initialisation of the variables.
        this.name = name;
        this.description = description;
        this.adjacentRooms = adjacentRooms;
        this.items = new
    }

    //this. ... if parameters
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void addRoom(Room room) {
        this.adjacentRooms.add(Room);
    }
}

