
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

        copied[0] = 99;
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copied: " + Arrays.toString(copied));
        System.out.println("Reversed: "+Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] copy = new int[array.length];
        int j = array.length-1;
        for (int i=0;i<array.length;i++) {
            copy[i] = array[j];
            j--;
        }
        return copy;
    }

}
