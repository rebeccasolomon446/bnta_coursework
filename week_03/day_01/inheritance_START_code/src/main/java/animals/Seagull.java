package animals;

import static java.lang.String.format;

public class Seagull extends Bird{

    private int numberOfEggs;

    public Seagull(String name, int numberOfEggs) {
        super(name, numberOfEggs);

    }

    public String makeNoise() {
        return String.format("%s: Mine!Mine!Mine!", this.name);
    }
}
