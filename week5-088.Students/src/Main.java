
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.println("name: ");
            String stName = reader.nextLine();
            if (stName.equals("")) {
                break;
            }
            System.out.println("studentnumber: ");
            String stNo = reader.nextLine();
            list.add(new Student(stName, stNo));
        }
        for (Student i : list) {
            System.out.println(i);
        }

        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");
        for (Student i : list) {
            if (i.getName().contains(search)) {
                System.out.println(i);
            }
        }

    }
}
