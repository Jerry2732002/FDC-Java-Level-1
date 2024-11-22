package src.week_one;

import java.util.Scanner;

public class Palindrome {
    public static void isPalindrome() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome : ");
        System.out.println("Enter a String");
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);

        if(s.equalsIgnoreCase(sb.reverse().toString())) {
            System.out.println("The given string is a palindrome");
        }
        else {
            System.out.println("The given string is NOT a palindrome");
        }
        sc.close();
    }
}
