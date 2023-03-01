public class Person {

   private String name;
   private String town;
   private int age;

    // constructor (needs the same name s class defined in)
    public Person(String inputName, String inputTown, int inputAge){   //can tell constructor what to expect in the parentheses:
        this.name = inputName;                            // properties name and town being assigned to the specific object inputs
        this.town = inputTown;
        this.age = inputAge;

    }

    //two parts to methods, method signature, then method body (what happens when its called)
    //void(return type): not expecting anything back

    void greet(String timeOfDay) {
        System.out.println("Good " + timeOfDay + "!" + this.name);

    }

    String generateBio() {
        return "My name is " + this.name + " and i live in " + this.town + ".";                   //always must return the data type
    }

    //GETTERS AND SETTERS:

    //name getter
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    //town getter and setter:
    public String  getTown() {
        return this.town;
    }

    public void setTown(String newTown) {
        this.town = newTown;
    }


    // age getter and setter:
    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
}
