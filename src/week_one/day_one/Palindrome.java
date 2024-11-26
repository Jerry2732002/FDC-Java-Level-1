package src.week_one.day_one;

import java.util.Scanner;

public class Palindrome {
    public static void isPalindrome() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome : ");
        System.out.println("Enter a String");
        String s = sc.next();
        StringBuilder rev = new StringBuilder();

        for(char ch : s.toCharArray()) {
            rev.insert(0, ch);
        }

        if(s.equalsIgnoreCase(rev.toString())) {
            System.out.println("The given string is a palindrome");
        }
        else {
            System.out.println("The given string is NOT a palindrome");
        }
        sc.close();
    }
}
