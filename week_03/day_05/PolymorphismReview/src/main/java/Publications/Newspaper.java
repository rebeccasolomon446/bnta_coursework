package Publications;

import java.util.ArrayList;

public class Newspaper extends Publication{

    private ArrayList<String> sections;
    private String propietor;


    private Newspaper(String title, int numberOfPages, String propietor) {
        super(title, numberOfPages);
        this.propietor = propietor;
        this.sections = new ArrayList<>();
    }

    // METHODS
    public String getCrosswordSolution() {
        return "this crossword is hard!";
    }
    // method overloading
    public int calculateMarkup(boolean isSundayEdition) {
       return isSundayEdition ? 5 : 10;
    }

    // GETTERS AND SETTERS

    public ArrayList<String> getSections() {
        return sections;
    }

    public void setSections(ArrayList<String> sections) {
        this.sections = sections;
    }

    public String getPropietor() {
        return propietor;
    }

    public void setPropietor(String propietor) {
        this.propietor = propietor;
    }
}
