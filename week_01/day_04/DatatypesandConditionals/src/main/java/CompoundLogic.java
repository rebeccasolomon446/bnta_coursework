package main.java;

public class CompoundLogic {
    public static void main(String[] args) {
        boolean loggedIn = true;
        boolean admin = true;

        // logical AND &&
        if (loggedIn && admin) {
            System.out.println("You are authorised");
        } //negator ! (looks for inverse value)
        else if (!loggedIn) {
            System.out.println("not logged in");
        }

        //logical OR || {
        if(loggedIn || admin)
        System.out.println("you are at least half way there");
    }
}
