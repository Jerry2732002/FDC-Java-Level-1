package src.week_one;

import java.util.Scanner;

public class PrimeCount {

    public static void primeCount() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter limit");
        int limit = sc.nextInt();

        for (int i = 2; i <= limit; i++) {
            if(PrimeCheck.isPrime(i)) {
                count++;
            }
        }
        System.out.println("Total number of primes : " + count);
    }
}
