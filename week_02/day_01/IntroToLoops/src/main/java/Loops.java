import java.util.ArrayList;
import java.util.List;

public class Loops {

    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("silver");
        colours.add("green");
        colours.add("raspberry");

        // Enhanced For Loop
        System.out.println("----Using enhanced for loop----");

        for (String colour: colours) {
            System.out.println(colour.toUpperCase());  //prints each item in a list format
        }

        List<String> filteredColours = new ArrayList<>();


        // printing items starting with the letter r
        for (String colour : colours) {
            if (colour.charAt(0) == 'r') {
                filteredColours.add(colour);
            }
        }
        System.out.println("filteredColours: " + filteredColours);

        //Classic For loop:
        System.out.println("----Using classic For loop----");

        for (int i = 0; i < colours.size(); i++) {
            String colour = colours.get(i);
            System.out.println(colour);
        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <=10; i +=2) {
            numbers.add(i);

        }
        System.out.println("numbers: " + numbers);

        //Break: to break out of a loop statement
        for (int i = 0; i < 10; i ++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        //continue: skips what happens when i = 4
        System.out.println("----continue----");
        for (int i = 0; i < 10; i ++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }



    }
}
