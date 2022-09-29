import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess(3);
    }


    private static void  makeAGuess(int Utries){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        System.out.println("You have " + Utries + " tries left!");
        if (Utries < 1){
            System.out.println("Too bad!");
            return;
        }
        if (userInput == rnd_number && Utries >= 1 ) {
            System.out.println("Congrats! You've guessed the right number!");
            makeAGuess(Utries -1);
        }
        if (userInput < rnd_number && Utries >= 1) {
            System.out.println("Your number is below my number, guess again.");
            makeAGuess(Utries -1);
        }
        if (userInput > rnd_number && Utries >= 1) {
            System.out.println("Your number is above my number, guess again.");
            makeAGuess(Utries -1);
        }

        // Create a Scanner object
        // Read user input

        //use hasNextInt to check if input is numeric,
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison (was it the right number?)
        //   If it was NOT the rigth number, let the user try again by calling this method recursively
        //   (If you are not sure how to do recursion, you can use a loop instead)
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }


}