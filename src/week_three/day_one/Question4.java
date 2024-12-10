//Find pairs of numbers in the ArrayList that sum up to a given target.

package src.week_three.day_one;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question4 {
    static void checkPairs(List<Integer> list, Integer target) {
        Set<Integer> visited = new HashSet<>();
        System.out.println("Pairs are : ");
        for (Integer item : list) {
            if (list.contains(target - item) && !visited.contains(item)) {
                System.out.println(item + ":" + (target - item));
                visited.add(target - item);

            }
        }
        if (visited.isEmpty()) {
            System.out.println("No pairs found");
        }
    }

    public static void execute() {
        List<Integer> list =new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        checkPairs(list, 17);
    }
}
