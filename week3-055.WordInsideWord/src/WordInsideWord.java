
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String w1 = reader.nextLine();
        System.out.println("Type the second word: ");
        String w2 = reader.nextLine();
        int index = w1.indexOf(w2);
        if (index == -1) {
            System.out.println("The word '" + w2 + "' is not found in the word '" + w1 + "' .");
        } else {
            System.out.println("The word '" + w2 + "' is found in the word '" + w1 + "' .");
        }
    }
}
