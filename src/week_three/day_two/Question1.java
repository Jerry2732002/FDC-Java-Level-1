package src.week_three.day_two;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question1 {
    static void findUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);
    }

    static <T> Set<T> findIntersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    static <T> void findDifference(Set<T> set1, Set<T> set2) {
        Set<T> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);
    }

    public static void execute() {
        Set<Integer> integers1 = new HashSet<>(List.of(1, 2, 3, 4));
        Set<Integer> integers2 = new HashSet<>(List.of(3, 4, 5, 6));
        findUnion(integers1, integers2);

        Set<String> strings1 = new HashSet<>(List.of("H", "I", "J", "K"));
        Set<String> strings2 = new HashSet<>(List.of("J", "K", "L", "M"));
        findIntersection(strings1, strings2);

        findDifference(integers1, integers2);
        findDifference(strings1, strings2);
    }
}
