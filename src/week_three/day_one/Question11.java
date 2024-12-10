package src.week_three.day_one;

import java.util.ArrayList;
import java.util.List;

public class Question11 {
    static <T> boolean checkPalindrome(List<T> list) {
        return list.equals(list.reversed());
    }

    public static void execute() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 1));
        System.out.println(checkPalindrome(list));
    }
}
