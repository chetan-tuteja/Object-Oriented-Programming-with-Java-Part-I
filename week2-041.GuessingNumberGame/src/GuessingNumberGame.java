
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number: ");
        int i=1;
        while (true) {
            int n = Integer.parseInt(reader.nextLine());
            if (n > numberDrawn) {
                System.out.println("The number is lesser, guesses made: "+i);
            } else if (n < numberDrawn) {
                System.out.println("The number is greater,guesses made: "+i);
            } else if (n == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            i++;
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
