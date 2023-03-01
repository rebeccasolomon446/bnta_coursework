package Publications;

import Interfaces.ISell;

import java.util.ArrayList;

public abstract class Publication implements ISell {

    private String title;
    private int numberOfPages;
    private ArrayList<String> awards;


    public ArrayList<String> getAwards() {
        return awards;
    }

    public void setAwards(ArrayList<String> awards) {
        this.awards = awards;
    }

    public Publication(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.awards = new ArrayList<>();
    }

    // METHODS
    public int countAwards() {
        return this.awards.size();
    }
    // METHOD implemented from interface
    public int calculateMarkup() {
        return 10;
    }

    // GETTERS AND SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

}
