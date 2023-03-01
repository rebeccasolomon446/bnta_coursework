public class ArraysPlayground {
    public static void main(String[] args) {

        // String[] args : how arrays are declared
        //create arrays statically

        String[] trainers = {"Colin", "Anna", "Richard", "Ed", "Iain"};

        System.out.println(trainers[0]); //prints "Colin"

        // reassinging the value of an index:


        // run time error - any value above 4 in the square brackets

        System.out.println(trainers[trainers.length - 1]); // value of the last index

        // in java arrays are fixed.

        //alternative array declaration: need to declare the size of the array in square brackets.
        String[] students = new String[5];
        System.out.println(students[0]); //prints null

        students[0] = "rebecca";
        students[1] = "will";
        System.out.println(students[0]);
        System.out.println(students[1]);


    }
}
