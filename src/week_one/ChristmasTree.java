package src.week_one;

public class ChristmasTree {

    public static void printTree(int n) {
        int space = n / 2;
        for (int i = 1; i <= n; i = i + 2) {
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            space--;
            System.out.println();
        }
    }
}
