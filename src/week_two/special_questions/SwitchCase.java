package src.week_two.special_questions;

import java.util.Scanner;

enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

public class SwitchCase {


    static WeekDays getNextDay(WeekDays weekday) {
        return switch (weekday) {
            case MONDAY -> WeekDays.TUESDAY;
            case TUESDAY -> WeekDays.WEDNESDAY;
            case WEDNESDAY -> WeekDays.THURSDAY;
            case THURSDAY -> WeekDays.FRIDAY;
            case FRIDAY -> WeekDays.SATURDAY;
            case SATURDAY -> WeekDays.SUNDAY;
            case SUNDAY -> WeekDays.MONDAY;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a week day");

        String weekday = sc.next().toUpperCase();
        sc.close();

        try {
            WeekDays nextday = getNextDay(WeekDays.valueOf(weekday));
            System.out.println("Next Day : " + nextday);
        } catch (IllegalArgumentException e) {
            System.out.println("Not a weekday");
        }
    }
}
