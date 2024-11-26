package src.week_two.special_questions;

import java.util.Scanner;


public class SwitchCase {
    public enum WeekDays {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }

    static void getNextDay(WeekDays weekday) {
        switch (weekday) {
            case MONDAY:
                System.out.println(WeekDays.TUESDAY);
                break;
            case TUESDAY:
                System.out.println(WeekDays.WEDNESDAY);
                break;
            case WEDNESDAY:
                System.out.println(WeekDays.THURSDAY);
                break;
            case THURSDAY:
                System.out.println(WeekDays.FRIDAY);
                break;
            case FRIDAY:
                System.out.println(WeekDays.SATURDAY);
                break;
            case SATURDAY:
                System.out.println(WeekDays.SUNDAY);
                break;
            case SUNDAY:
                System.out.println(WeekDays.MONDAY);
                break;
            default:
                System.out.println("Not a Week Day");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a week day");

        String weekday = sc.next().toUpperCase();

        try {
            getNextDay(WeekDays.valueOf(weekday));
        } catch (IllegalArgumentException e) {
            System.out.println("Not a weekday");
        }


    }
}
