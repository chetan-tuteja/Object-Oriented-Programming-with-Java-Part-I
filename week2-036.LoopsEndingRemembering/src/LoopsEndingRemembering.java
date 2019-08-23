
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int c = 0, sum = 0, even = 0, odd = 0;
        System.out.println("Type numbers: ");
        while (true) {
            int num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + c);
                System.out.println("Average: " + ((double) sum / c));
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            }
            sum = sum + num;
            c++;
            if (num % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }

        }

    }
}
