
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private Random random = new Random();
    
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        for (int i = 0; i < 7; i++) {
            this.drawNumbers();
        }
    }
    
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }
    
    public void drawNumbers() {
        // We'll format a list for the numbers

        // Write the number drawing here using the method containsNumber()
        if (numbers.size() == 7) {
            numbers.remove(0);
        }
        int temp = (this.random.nextInt(39) + 1);
        if (containsNumber(temp)) {
            this.drawNumbers();
        } else {
            this.numbers.add(temp);
        }
        
    }
    
    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
        
    }
}
