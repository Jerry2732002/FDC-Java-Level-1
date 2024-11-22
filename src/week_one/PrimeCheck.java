package src.week_one;

import java.util.Scanner;

public class PrimeCheck {

    static boolean isPrime(int n) {
        if (n <= 1 || n == 4) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void checkPrime() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a Prime");
        } else {
            System.out.println(number + " is NOT a Prime");
        }
        sc.close();
    }
}
