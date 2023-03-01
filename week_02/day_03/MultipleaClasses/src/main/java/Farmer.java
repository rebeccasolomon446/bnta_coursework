import java.util.ArrayList;

public class Farmer {

    private String name;
    private int collectedEggs;

    public Farmer(String name) {
        this.name = name;
        this.collectedEggs = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCollectedEggs() {
        return this.collectedEggs;
    }

    public void setCollectedEggs(int collectedEggs) {
        this.collectedEggs = collectedEggs;
    }

    public void collectEggs(Farm farm) {
        // keep track of number of found eggs
        int totalEggs = 0;
        // look at farm's collection of ckickens
        // collect eggs from each chicken
        ArrayList<Chicken> chickens = farm.getChickens();  // going to check every chicken to ssee if they have eggs and collect. so should use enhanced for loop)
        for (Chicken chicken : chickens) {
            //update running total
            // set chicken's egg count to zero.
            if(chicken.getEggs() > 0 ) {
                totalEggs += chicken.getEggs();
                chicken.setEggs(0);
            }

        }
        // Update collectedEggs property;
        this.collectedEggs = totalEggs;

    }

    public void assignEggsForSale(Farm farm) {
        farm.setEggsForSale(this.collectedEggs - 2);
        this.collectedEggs = 2;
    }

}
