package animals;

public class Bird extends Animal {

    private int numberOfEggs;

    public Bird(String name, int numberOfEggs){
        super(name);
        this.numberOfEggs = numberOfEggs;
    }

    public String layEgg(){
        return "I laid an egg!";
    }

    public int getNumberOfEggs() {
        return this.numberOfEggs;
    }

}
