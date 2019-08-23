// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int hour = reader.nextInt();
        int min = reader.nextInt();
        int hung = reader.nextInt();
        int incH = reader.nextInt();
        int cost = reader.nextInt();
        int decH = reader.nextInt();
        int tempH = hung;
        double c1 = 0, c2 = 0;

        while (hung > 0) {
            c1 += cost;
            hung -= decH;
        }

        while (hour < 20) {
            while (min < 60) {
                tempH += incH;
                min++;
            }
            min = 0;
            hour++;
        }

        

        while (tempH > 0) {
            c2 += cost;
            tempH -= decH;
        }
        
        
        c2 -= c2 * 20/100;

        if (c1 < c2) {
            System.out.println(c1);
        } else {
            System.out.println(c2);
        }
        
        

    }
}
