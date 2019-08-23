
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int res = 0, i = 0;
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        while (i <= num) {
            res = res + (int) Math.pow(2, i);
            i++;

        }
        System.out.println("The result is " + res);

    }
}
