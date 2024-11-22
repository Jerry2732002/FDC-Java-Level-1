package src.week_one;

public class ReverseInteger {

    public static void reverseDigit(long n) {
        long reverse = 0;
        while (n > 0) {
            reverse = reverse + (n % 10);
            n /= 10;
            reverse = (n > 0) ? reverse * 10 : reverse;

        }
        System.out.println(reverse);
    }
}
