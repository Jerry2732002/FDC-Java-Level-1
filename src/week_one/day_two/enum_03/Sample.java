package src.week_one.day_two.enum_03;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void ordinalAndValues() {

        //array of status which is converted to string
        System.out.println(Arrays.toString(Status.values()));

        //list of status
        System.out.println("Using loops : ");
        List<Status> list = List.of(Status.values());
        for(Status status : list) {
            System.out.println(status);
        }

        System.out.println("COMPLETE ordinal : " + Status.COMPLETE.ordinal());
        System.out.println("IN_PROGRESS ordinal : " + Status.IN_PROGRESS.ordinal());
        System.out.println("INCOMPLETE ordinal : " + Status.INCOMPLETE.ordinal());
        System.out.println("OVER_DUE ordinal : " + Status.OVER_DUE.ordinal());

    }
}
