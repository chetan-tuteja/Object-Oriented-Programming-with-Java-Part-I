
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;

    }

    public String createPassword() {
        // write code that returns a randomized password
        String help = "";
        for (int i = 0; i < length; i++) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            help = help + symbol;
        }
        return help;
    }
}
