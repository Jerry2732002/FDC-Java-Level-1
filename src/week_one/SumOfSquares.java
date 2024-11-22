package src.week_one;

public class SumOfSquares {
    private static int sum = 0;

    public static int sumOfSquare() {
        for (int i = 1; i <= 100; i++) {
            sum += (i * i);
        }
        return sum;
    }
}