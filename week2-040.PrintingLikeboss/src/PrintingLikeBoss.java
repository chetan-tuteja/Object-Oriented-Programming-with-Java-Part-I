
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        for (int j = 0; j < amount; j++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int c = size - 1;
        for (int k = 1; k <= size; k++) {
            printWhitespaces(c);
            printStars(k);
            c--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int spc = height - 1;
        int z = 1;
        for (int a = 1; a <= height; a++) {
            printWhitespaces(spc);
            printStars(z);
            z = z + 2;
            spc--;
        }
        for (int ht = 0; ht < 2; ht++) {
            printWhitespaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
