import java.util.*;

public class Runner {

    public static void main(String[] args) {

        // Array List creation:

        ArrayList<String> trainerList = new ArrayList<>();

        trainerList.add("Colin");
        trainerList.add("Ed");
        trainerList.add("Eoan");

        System.out.println(trainerList);

        // Stack creation

        Stack<String> trainerStack = new Stack<>();
        trainerStack.add("Colin");
        trainerStack.add("Ed");
        trainerStack.add("Eoan");

        System.out.println(trainerStack);

        // Stacks maintain the idea of indexes.
        System.out.println(trainerStack.get(0));

        // pop() removes the last index value
        System.out.println(trainerStack.pop());
        System.out.println(trainerStack);

        // peek() gives the most recent added value
        System.out.println(trainerStack.peek());
        System.out.println(trainerStack);


        Queue<String> trainerQueue = new LinkedList<>();

        trainerQueue.add("Colin");
        trainerQueue.add("Ed");
        trainerQueue.add("Eoan");

        System.out.println(trainerQueue);
        // working with queues and Fifo, peek() prints out the first value.
        System.out.println(trainerQueue.peek());
        // poll() removes the first value.
        System.out.println(trainerQueue.poll());
        System.out.println(trainerQueue);

        // MAPS
        HashMap<String, Integer> trainerAges = new HashMap<>();

        trainerAges.put("Colin", 26);
        trainerAges.put("Ed", 19);
        trainerAges.put("Eoan", 23);
        trainerAges.put("Zsolt", 53);
        System.out.println(trainerAges);

        System.out.println(trainerAges.get("Colin"));

        System.out.println(trainerAges.values());


    }



}
