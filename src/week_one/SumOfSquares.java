package src.week_one;

public class SumOfSquares {
    private static int sum = 0;

    public static void sumOfSquare() {
        for (int i = 1; i <= 100; i++) {
            sum += (i * i);
        }
        System.out.println("Sum of Squares : ");
        System.out.println(sum);
    }
}