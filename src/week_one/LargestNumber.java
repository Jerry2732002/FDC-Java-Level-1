package src.week_one;

import java.util.Scanner;

public class LargestNumber {
    public static void largestNumber() {

        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            if (number > largest)
                largest = number;
        }
        System.out.println("Largest number is : " + largest);
    }
}
