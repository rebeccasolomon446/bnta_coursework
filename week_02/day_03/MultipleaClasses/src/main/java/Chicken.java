public class Chicken {

    private String name;
    private int eggs;

    public Chicken(String name, int eggs)  { // method signature
        this.name = name;
        this.eggs = eggs;
    }  //method body

    //GETTERS AND SETTERS

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEggs() {
        return this.eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }
}
