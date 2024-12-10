package src.week_three.day_one;

import java.util.ArrayList;
import java.util.List;

public class Question9 {
    static void getMinMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer item : list) {
            max = Math.max(item, max);
            min = Math.min(item, min);
        }
        System.out.println("Min : " + min + ", Max : " + max);
    }
    public static void execute() {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, -4, 5, 66));
        getMinMax(integers);
    }
}
