
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("First: ");
        int i = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int j = Integer.parseInt(reader.nextLine());
        while (i <= j) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum is " + sum);

    }
}
