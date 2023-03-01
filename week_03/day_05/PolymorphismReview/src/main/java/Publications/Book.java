package Publications;

public class Book extends Publication {

    private String author;
    private int rating;


    public Book(String title, int numberOfPages, String propietor, String author, int rating) {
        super(title, numberOfPages);
        this.author = author;
        this.rating = rating;
    }

    // METHODS
    public void turnIntoFilm() {

    }

    public void addBookmark(int pageNumber) {

    }

    public boolean getRecommendation() {
        return this.rating > 7;
    }
    // using method overriding to implement
    public int calculateMarkup() {
        return 5;
    }


    // GETTERS AND SETTERS
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


}
