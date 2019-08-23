
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        return findSmallest(array, 0);
    }

    public static int indexOfTheSmallest(int[] array) {
        return indexOfTheSmallestStartingFrom(array, 0);
    }

    public static int findSmallest(int[] array, int index) {
        int ret = array[index];
        for (int i = index; i < array.length; i++) {
            if (ret > array[i]) {
                ret = array[i];
            }
        }
        return ret;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int temp = findSmallest(array, index);
        int ret=0;
        for (int i = index; i < array.length; i++) {
            if (temp == array[i]) {
                ret = i;
            }
        }
        return ret;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
            System.out.println(Arrays.toString(array));
        }
    }

}
