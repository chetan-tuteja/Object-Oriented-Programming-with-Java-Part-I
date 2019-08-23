
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1, sum = 0;
        System.out.println("Until what?");
        int j = Integer.parseInt(reader.nextLine());
        while (i <= j) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is " + sum);

    }
}
