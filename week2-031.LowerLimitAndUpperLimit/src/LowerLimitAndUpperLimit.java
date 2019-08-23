
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int i = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int j = Integer.parseInt(reader.nextLine());
        while (i <= j) {
            System.out.println(i);
            i++;
        }

    }
}
