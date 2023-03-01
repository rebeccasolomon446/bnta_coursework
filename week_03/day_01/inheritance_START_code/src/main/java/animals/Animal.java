package animals;

public abstract class Animal {

// protected' can be seen and accessed in subclasses
    protected String name;
    private boolean healthy;

    public Animal(String name) {
        this.name = name;
        this.healthy = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    // Abstract methods provide the method signature.
    // It is up to the subclass to choose its method body
    // every subclass that extends from the parent method has to use abstract metohds
    public abstract String makeNoise();


    public String makeNoise(String noise) {
        return String.format("Hello, my name is %s, and I go: %s", this.name, noise);
    }

    public String eat(){
        return "Mmm, that was tasty!";
    }
}



// what is the reason for this whole thing:
// code should always be something easy to maintain.
