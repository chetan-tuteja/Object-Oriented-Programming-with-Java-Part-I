
import java.util.Scanner;

public class Main {    
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Database database = new Database();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        while (true) {
            System.out.println("?");
            String in = read(reader);
            if (in.equals("Quit")) {
                break;
            } else if (in.equals("Add")) {
                System.out.println("Name: ");
                String name = read(reader);
                System.out.println("Latin Name: ");
                String latin = read(reader);
                database.addBird(new Bird(name, latin));
            } else if (in.equals("Observation")) {
                System.out.println("What was observed:?");
                String obs = read(reader);
                database.observation(obs);
            } else if (in.equals("Statistics")) {
                database.printAll();
            } else if (in.equals("Show")) {
                System.out.println("What?");
                String obs = read(reader);
                database.show(obs);
            }
        }        
        
    }
    
    public static String read(Scanner scanner) {
        String ret = scanner.nextLine();
        return ret;
    }
    
}
