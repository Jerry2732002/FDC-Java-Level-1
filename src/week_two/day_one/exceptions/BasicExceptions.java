package src.week_two.day_one.exceptions;

public class BasicExceptions {

    public int divide(int numOne, int numTwo) {
        try {
            return numOne / numTwo;
        }catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
            return 0;
        }
    }
}
