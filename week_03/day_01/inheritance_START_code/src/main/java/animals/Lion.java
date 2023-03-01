package animals;

public class Lion extends Animal {
    // lion class is going to extend the animal class.
    // throws error. for it to work, the lion class must have the same properties the animal clas.

    private boolean canWaitToBeKing;

    public Lion(String name, boolean canWaitToBeKing) {
        // ensuring lion constructor does the same thing as animal constructor by creating a super class
        // extends keyword allows us to call super
        // super() will call the super class constructor (which is Animal class)
        super(name);   // equivalent to new Animal("Lion")

        this. canWaitToBeKing = canWaitToBeKing;

    }
    // Example of overloaded constructors
    public Lion(){
        super("simba");
        this.canWaitToBeKing = true;
    }
    // overriding the makeNose() method from the Animal class.
    // From this point onwards, lions will say "ROAR!"
    public String makeNoise(){
        return "ROAR!";
    }

    // OVERLOADED methods use cases
    // already have eat() method in Animal class.
    public String eat(String meat) {
        return String.format("Chewing on some %s", meat);
    }

    public String eat(Animal animal) {
        return String.format("Whoopsie, ate poor little %s", animal.getName());
    }




}



















