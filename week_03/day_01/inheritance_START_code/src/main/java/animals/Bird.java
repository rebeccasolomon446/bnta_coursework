package animals;

public abstract class Bird extends Animal {

    private int numberOfEggs;

    public Bird(String name, int numberOfEggs) {
        super(name);
        this.numberOfEggs = numberOfEggs;
    }

    public int getNumberOfEggs() {
        return this.numberOfEggs;
    }

}
