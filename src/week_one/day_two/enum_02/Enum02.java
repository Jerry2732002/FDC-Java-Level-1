package src.week_one.day_two.enum_02;

import java.util.Scanner;

public class Enum02 {
    public static void combineColor() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first primary color");
        PrimaryColor colorOne = PrimaryColor.valueOf(sc.next().toUpperCase());

        System.out.println("Enter second primary color");
        PrimaryColor colorTwo = PrimaryColor.valueOf(sc.next().toUpperCase());

        sc.close();

        if (colorOne.equals(PrimaryColor.BLUE) && colorTwo.equals(PrimaryColor.GREEN)
                || colorOne.equals(PrimaryColor.GREEN) && colorTwo.equals(PrimaryColor.BLUE)
        )
            System.out.println(SecondaryColor.CYAN);

        else if (colorOne.equals(PrimaryColor.BLUE) && colorTwo.equals(PrimaryColor.RED)
                || colorOne.equals(PrimaryColor.RED) && colorTwo.equals(PrimaryColor.BLUE)
        )
            System.out.println(SecondaryColor.MAGENTA);

        else if (colorOne.equals(PrimaryColor.RED) && colorTwo.equals(PrimaryColor.GREEN)
                || colorOne.equals(PrimaryColor.GREEN) && colorTwo.equals(PrimaryColor.RED)
        )
            System.out.println(SecondaryColor.YELLOW);
        else
            System.out.println(colorOne);
    }

    public static void checkColor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter color code");
        String colorCode = sc.next();

        sc.close();

        if (PrimaryColor.checkHexaCode(colorCode) != null) {
            System.out.println("Color is : " + PrimaryColor.checkHexaCode(colorCode));
        } else if (SecondaryColor.checkHexaCode(colorCode) != null) {
            System.out.println("Color is : " + SecondaryColor.checkHexaCode(colorCode));
        } else
            System.out.println("Incorrect hexacode !!!");
    }
}
