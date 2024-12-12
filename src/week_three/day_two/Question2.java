package src.week_three.day_two;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question2 {
    static <T> boolean isSubSet(Set<T> set, Set<T> subset) {
        return set.containsAll(subset);
    }

    public static void execute() {
        Set<Integer> integers1 = new HashSet<>(List.of(1,2,3,4));
        Set<Integer> integers2 = new HashSet<>(List.of(3));
        System.out.println(isSubSet(integers1,integers2));
    }
}
