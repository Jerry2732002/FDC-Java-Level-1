package src.week_one;

import java.util.Scanner;

public class Palindrome {
    public static void isPalindrome() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome : ");
        System.out.println("Enter a String");
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);

        System.out.println(s.equalsIgnoreCase(sb.reverse().toString()));
        sc.close();
    }
}
