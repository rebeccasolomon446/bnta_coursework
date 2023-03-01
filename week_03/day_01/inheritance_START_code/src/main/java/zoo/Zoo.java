package zoo;

import animals.Animal;
import animals.Bird;
import enclosures.Enclosure;

public class Zoo {

    private Enclosure reptileHouse;
    private Enclosure birdCage;
    private Enclosure mammalField;

    public Zoo(Enclosure reptileHouse, Enclosure birdCage, Enclosure mammalField) {
        this.reptileHouse = reptileHouse;
        this.birdCage = birdCage;
        this.mammalField = mammalField;
    }

    // METHODS

    public int countBirdEggs() {
        int totalEggs=0;
        // grab each animal inside the birdcage's getAnimals() method. birdcage is an Enclosure. Enclosure has a getAnimal() method.
        for(Animal animal : this.birdCage.getAnimals()) {
//            Bird bird = (Bird) animal;              //CASTING
            totalEggs += bird.getNumberOfEggs();

        // errpr because getNumberOfeggs() is not in Animal but in bird.
        // all inclosures take in an arraylist of animals.
        // bird.getNumberOAnimals does not work because the compiler sees bird as an Animal
        // the above is because of birdCage.getAnimals().
        // to solve this problem we have to use casting swo that bird.getNumberOfEggs() works.


        }
    }

    public Enclosure getReptileHouse() {
        return reptileHouse;
    }

    public void setReptileHouse(Enclosure reptileHouse) {
        this.reptileHouse = reptileHouse;
    }

    public Enclosure getBirdCage() {
        return birdCage;
    }

    public void setBirdCage(Enclosure birdCage) {
        this.birdCage = birdCage;
    }

    public Enclosure getMammalField() {
        return mammalField;
    }

    public void setMammalField(Enclosure mammalField) {
        this.mammalField = mammalField;
    }

    public void addAnimalToEnclosure(Animal animal, Enclosure enclosure){
        enclosure.addAnimal(animal);
    }
}
