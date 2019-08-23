
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes:");
        
        while (true) {
            int numb = read(reader);
            if (numb == -1) {
                break;
            }
            list.add(numb);

        }
        int[] grade = distribution(list);
        int total = 0;

        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStar(grade[i]);
            System.out.println("");
            total = total + grade[i];
        }

        int accepted = total - grade[0];
        System.out.println("Acceptance percentage: " + (double) 100 * accepted / total);

    }

    public static int read(Scanner scanner) {
        int i = Integer.parseInt(scanner.nextLine());
        return i;
    }

    public static int[] distribution(ArrayList<Integer> inList) {
        int five = 0, four = 0, three = 0, two = 0, one = 0, zero = 0;

        for (int i : inList) {
            if (i < 0) {

            } else if (i <= 29) {
                zero++;
            } else if (i <= 34) {
                one++;
            } else if (i <= 39) {
                two++;
            } else if (i <= 44) {
                three++;
            } else if (i <= 49) {
                four++;
            } else if (i <= 60) {
                five++;
            }
        }
        int[] ret = {zero, one, two, three, four, five};
        return ret;
    }

    public static void printStar(int total) {
        for (int i = 0; i < total; i++) {
            System.out.print("*");
        }
    }
}
