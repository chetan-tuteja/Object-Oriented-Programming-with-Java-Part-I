
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int p = Integer.parseInt(reader.nextLine());
        
        if(p>0)
        {
            if(p<30)
                System.out.println("failed");
        }
        if(p>29)
        {
            if(p<35)
                System.out.println("Grade: 1");
        }
        if(p>34)
        {
            if(p<40)
                System.out.println("Grade: 2");
        }
        if(p>39)
        {
            if(p<45)
                System.out.println("Grade: 3");
        }
        if(p>44)
        {
            if(p<50)
                System.out.println("Grade: 4");
        }
        if(p>49)
        {
            if(p<61)
                System.out.println("Grade: 5");
        }
        

    }
}
