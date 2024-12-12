package src.week_three.day_three;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static void execute() {
        Map<Integer, String > student = new HashMap<>();
        student.put(1,"Jerry");
        student.put(2,"Sam");
        student.put(3,"Alex");
        student.put(4,"Thasleena");
        student.put(5,"Johns");
        System.out.println(student.get(1));
        System.out.println(student.remove(1));
        System.out.println(student.containsKey(4));
        System.out.println(student.containsValue("Alex"));
        System.out.println(student.containsKey(1));
        System.out.println(student.containsValue("fdbhfdahaefdhah"));
    }
}
