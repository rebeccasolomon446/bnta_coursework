package Newsagent;

import Publications.Publication;

import java.util.ArrayList;

public class Newsagent {

    private ArrayList<Publication> stock;

    public Newsagent() {
        this.stock = new ArrayList<>();
    }

    public void addItemToStock(Publication publication) {
        this.stock.add(publication);
    }
}
