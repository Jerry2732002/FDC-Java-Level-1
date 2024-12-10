package src.week_three.day_one;

//Given an ArrayList with duplicate values, the task is to remove the duplicate values from this ArrayList in Java. (use generics)
//
//        Input: List = [1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]
//
//        Output: List = [1, 10, 2, 3, 4, 5]
//
//        Input: List = ["G", "e", "e", "k", "s"]
//
//        Output: List = ["G", "e", "k", "s"]
//
//        Do the same for linked list.

import java.util.*;

public class Question2_3 {
    public <T> List<T> removeDuplicatesUsingList(List<T> list) {
        return new LinkedHashSet<>(list).stream().toList();
    }
    public <T> List<T> removeDuplicates(List<T> list) {
        return new LinkedHashSet<>(list).stream().toList();
    }
    public static void execute () {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5));
        List<String> strings = new LinkedList<>(Arrays.asList("G", "e", "e", "k", "s"));
        Question2_3 obj = new Question2_3();
        integers = obj.removeDuplicates(integers);
        strings = obj.removeDuplicates(strings);
        System.out.println(integers);
        System.out.println(strings);
    }
}