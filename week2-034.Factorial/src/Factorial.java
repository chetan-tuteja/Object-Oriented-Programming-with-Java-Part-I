
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1, fact = 1;
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        if (num == 0) {
            System.out.println("Factorial is 1");
        } else {
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial is " + fact);
        }

    }
}
