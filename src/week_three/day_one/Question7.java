package src.week_three.day_one;

import java.util.ArrayList;
import java.util.List;

public class Question7 {
    static void partition(List<Integer> list, int pivot) {
        List<Integer> lesser = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for (Integer item : list) {
            if (item >= pivot) {
                greater.add(item);
            } else {
                lesser.add(item);
            }
        }
        System.out.println("Lesser : " + lesser);
        System.out.println("Greater : " + greater);
    }

    public static void execute() {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        partition(list, 6);
    }
}
