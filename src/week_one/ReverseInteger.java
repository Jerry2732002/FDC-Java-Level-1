package src.week_one;

public class ReverseInteger {

    public static void reverseDigit(long n) {
        StringBuilder digit = new StringBuilder(Long.toString(n));
        System.out.println(
                Integer.parseInt(digit.reverse().toString())
        );
    }
}
