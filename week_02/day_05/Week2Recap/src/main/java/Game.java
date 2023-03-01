import java.util.List;


public class Game {
    // Can think of classes as...
    // Main class is usually a SINGLETON, so you will only make one instance.
    // "REFACTOR" change your code around to make it more readable, more efficient,
    // or to improve its structure (DRY).

    //properties are variables that will be used to form objects
    private Player player;
    private Room currentRoom;
    private List<Room> rooms;

    // constructor used to create methods in a class
    //static methods belong to the class, all other methods belong to the object.
    // Main can be accessed before....

    //this. allows the object property to be assigned to the input of that variable.
    public void Game(Player player) {
        this.player = player;

    }

    public static void main(String[] args) {  // class signature is entry point for app instance.

        //below is creating an instance called app of the class main.
        Game app = new Game();
    }


}
