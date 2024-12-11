package src.week_three.day_one;

import java.util.ArrayList;
import java.util.List;

public class Question11 {
    static <T> boolean checkPalindrome(List<T> list) {
        int size = list.size();
        int i = size % 2 != 0 ? size / 2 : size / 2 - 1;
        int j = size / 2;
        while (i >= 0) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    public static void execute() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 1, 1, 2, 1));
        System.out.println(checkPalindrome(list));
    }
}
