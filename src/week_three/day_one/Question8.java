//Intersection of Two Linked Lists:
//
//Problem:Write a program to find the node at which the intersection of two singly linked lists begins.
//
//        Example:Given two linked lists that intersect, return the intersecting node.

package src.week_three.day_one;

import java.util.LinkedList;
import java.util.List;

public class Question8 {
    static <T> T  checkIntersection(LinkedList<T> list1, LinkedList<T> list2) {
        for (T item : list2) {
            if (list1.contains(item)) {
                return item;
            }
        }
        return null;
    }
    public static void execute() {
        LinkedList<Integer> list1 = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        LinkedList<Integer> list2 = new LinkedList<>(List.of(9, 8, 7, 6, 5, 4));
        System.out.println(checkIntersection(list1, list2));
    }
}
