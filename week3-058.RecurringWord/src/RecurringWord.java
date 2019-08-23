
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        while(true)
        {
            System.out.println("Type a word: ");
            String wrd = reader.nextLine();
            if(words.contains(wrd))
            {
                System.out.println("You gave the word "+wrd+" twice");
                break;
            }
            words.add(wrd);
        }
        
    }
}
