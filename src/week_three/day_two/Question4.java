package src.week_three.day_two;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question4 {
    static <T> int countDuplicates(List<T> list){
        int count = 0;
        Set<T> unique = new HashSet<>();
        for (T item : list) {
            if (unique.contains(item)) {
                count++;
            }else {
                unique.add(item);
            }
        }
        return count;
    }
    public static void execute() {
        List<Integer> list = new ArrayList<>(List.of(1,1,1,2,2,3,4,4,4,9));
        System.out.println("No of duplicates: " + countDuplicates(list));
    }
}
