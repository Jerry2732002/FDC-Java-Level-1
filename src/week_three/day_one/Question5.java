package src.week_three.day_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Question5 {
    static <T> List<T> combine(List<T> list1, List<T> list2) {
        list1.addAll(list2);
        return new LinkedHashSet<>(list1).stream().toList();
    }

    public static void execute() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7, 8));
        System.out.println(combine(list1, list2));
    }
}
