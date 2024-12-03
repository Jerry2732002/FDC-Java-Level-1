package src.week_two.day_two;

public class SquareRoot {
    public double squareRoot(int number) {
        if (number < 0){
            throw new IllegalArgumentException("Number is Negative");
        }
        return Math.sqrt(number);
    }
}
