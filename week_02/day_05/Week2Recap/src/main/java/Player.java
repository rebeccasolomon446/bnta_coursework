import java.util.List;

public class Player {

    // making properties private, and using public getters and setters
    // gives the class control over who can acess and/or modify the state/data
    private String name;
    private List<Item> items;

    public Player(String name) {
        this.name = name;
    }


    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }


}
