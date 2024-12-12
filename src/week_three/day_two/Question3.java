package src.week_three.day_two;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question3 {
    static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);
        symmetricDifference.removeAll(Question1.findIntersection(set1,set2));
        return symmetricDifference;
    }

    public static void execute() {
        Set<Integer> integers1 = new HashSet<>(List.of(1, 2, 3, 4));
        Set<Integer> integers2 = new HashSet<>(List.of(3,4,5,6,7,8));
        System.out.println(symmetricDifference(integers1, integers2));
    }
}
