package src.week_one.day_two.enum_01;

import java.util.Scanner;

public class Enum01 {


    public static void enum01(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Directions :");
        String val = sc.next();

        Directions dir = Directions.getOpposite(Directions.valueOf(val.toUpperCase()));
        System.out.println("Opposite direction is : " + dir.name());
    }
}
