package src.week_one;

public class Palindrome {
    public static boolean checkPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equalsIgnoreCase(sb.toString());
    }
}
