package main.java;

public class Main {
    public static void main(String[] args) {
        //data types

        /* 1. Primitive types
        byte, short, int, long: integer types
        float (eg 3.14), double (java default)
        boolean (true, false)
        char (sungle unicode character)
        */

        int age = 60;
        int age2 = 128;
        int age3;

        float myFloatVal = (float) 3.14;  //(float) called casting. switching data types.
        double myDoubleVal = 3.14;

        //console.log() equivalent
        System.out.println(age);  //type 'sout' for shortcut

        //math ops
        System.out.println("combined age: " + (age + age2)); // + symbol for concatenation of strings as well as addition operations.

        //int array
        int[] ages = {24, 32, 46 ,59};
        //enhanced for loop will loop through each value in array which will be represented by 'a'
        // 'var; short for variable, and it uses type inference.
        // : syntax, a is a member or ages

        //calculating average age:
        double avgAge = 0;
        int totalAge = 0;
        for(var a : ages) {
            totalAge += a;
        }

        avgAge = totalAge / ages.length;
        System.out.println("Average age: " + avgAge);

        //product of all ages
        int product = 1;
        for(var a : ages) {
            product = product * a;
        }
        System.out.println("product: " + product);

        /*
        2. reference types (objects)
        have

        char = single character, wrapped in ''
        */
        char firstInitial ='R';

        // boolean

        boolean iLovecats = true;

        if(iLovecats) {
            System.out.println("I am a cat person!");
        } else {
            System.out.println("I prefer dogs :/");
        }

        System.out.println("Random String".getBytes());

        //comparing objects:
        String dog1 = "dog"; // stirng literal
        String dog2 = new String ("dog"); // using new keyword means we are creating a new object in memory, regardless of if the value is the same.
        String dog3 = "dog";
        System.out.println(dog1 == dog2); // output: false
        //but
        System.out.println(dog1 == dog3); // output: true

        System.out.println("equal in value: " + dog1.equals(dog2)); // .equals() examines the content of both variables to see if they are equal in value.
        // output: true
        //

    }
}
