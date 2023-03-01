import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the guessing game!");

        // generating random number. 1-100
        Random random = new Random();
        int secretNumber = random.nextInt(1, 101);

        boolean running = true;

        while (running ) {

            System.out.println("Guess a number between 1 and 100");

            int userGuess = 0;

            try {
                userGuess = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("That's not a number, try again!");
                scanner.nextLine();
                continue;
            }

            if(secretNumber == userGuess) {
                System.out.println("Congratulations, you guessed correctly!");
            } else if(secretNumber < userGuess) {
                System.out.println("Unlucky, your guess was too high!");
            } else {
                System.out.println("Unlucky, your guess was too low");
            }


        }


    }
}
