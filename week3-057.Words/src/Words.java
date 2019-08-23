
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            String wrd = reader.nextLine();
            if (wrd.isEmpty()) {
                System.out.println("You typed the following words: ");
                for (String help : words) {
                    System.out.println(help);
                }
                break;
            } else {
                words.add(wrd);
            }
        }
    }
}
