package animals;

public class Parrot extends Bird {



    public Parrot(String name, int numberOfEggs) {
        super(name, numberOfEggs);

    }

    public String makeNoise(){
        return "Squawk!";
    }
}
