import java.util.ArrayList;

public class ArrayListPlayground {

    public static void main(String[] args) {

        //Array lists are a datatype of lists.

        ArrayList<String> trainers = new ArrayList<>(); // brackets invoking constructor

        // Array lists can be dynamically increased in size.

        trainers.add("zsolt");
        trainers.add("Anna");
        trainers.add("Colin");

        //.get method to access the array list.
        System.out.println(trainers.get(0));

        //Array lists are dynamic which is useful for data.

        // reassigning value of 0 index:
        trainers.set(0, "Eoan");
        System.out.println(trainers.get(0));


        System.out.println(trainers.size()); //prints how many items in an array list

    }
}
