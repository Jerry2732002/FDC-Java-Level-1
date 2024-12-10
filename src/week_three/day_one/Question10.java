//Rotate elements of a list by a given number of positions.

package src.week_three.day_one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Question10 {
    public static void execute() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Before rotation");
        System.out.println(list);
        System.out.println("After rotation");
        Collections.rotate(list,4);
        System.out.println(list);
    }
}
