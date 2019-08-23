
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            String wrd = reader.nextLine();
            if (wrd.isEmpty()) {
                break;
            }
            words.add(wrd);
        }
        Collections.sort(words);
        
        System.out.println("You typed the following words: ");
        for (String help : words) {
            System.out.println(help);
        }

    }
}
