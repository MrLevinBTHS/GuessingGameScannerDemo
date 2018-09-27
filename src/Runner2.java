import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner2 {
    public static void main(String[] args) {
        Scanner stream = new Scanner(System.in);
        String input = "";
        System.out.print("Welcome to the guessing game. What's your name player? ");
        input = stream.nextLine();
        System.out.println("Nice to meet you " + input + ".");
        int mysteryNum = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int tries = 0;
        while (guess != mysteryNum)
        {
            System.out.println("What's your next guess?");

            try
            {
                guess = stream.nextInt();
                tries++;
                if (guess > mysteryNum)
                {
                    System.out.println("Too high.");
                } else {
                    System.out.println("Too low.");
                }

            }
            catch (InputMismatchException e)
            {
                System.out.println("That wasn't a number, please try again.");
                input = stream.next();
            }



        }
        System.out.println("You got it, and it only took" + tries +" tries.");
    }
}








