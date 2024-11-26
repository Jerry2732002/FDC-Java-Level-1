package src.week_two.special_questions;

public class WrapperClasses {

    public static void main(String[] args) {

        byte a1 = 5;

        Byte a2 = a1; // autoboxing

        byte a3 = a2; // unboxing

        System.out.println("a1 = " + a1 + ", a2 = " + a2 + ", a3 = " + a3);


        short b1 = 550;

        Short b2 = b1; // autoboxing

        short b3 = b2; // unboxing

        System.out.println("b1 = " + b1 + ", b2 = " + b2 + ", b3 = " + b3);


        int c1 = 120_000;

        Integer c2 = c1; // autoboxing

        int c3 = c2; // unboxing

        System.out.println("c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3);


        double d1 = 5_200_000L;

        Double d2 = d1; // autoboxing

        double d3 = d2; // unboxing

        System.out.println("d1 = " + d1 + ", d2 = " + d2 + ", d3 = " + d3);


        float e1 = 3.91f;

        Float e2 = e1; // autoboxing

        float e3 = e2; // unboxing

        System.out.println("e1 = " + e1 + ", e2 = " + e2 + ", e3 = " + e3);


        double f1 = 0.1234567890123d;

        Double f2 = f1; // autoboxing

        double f3 = f2; // unboxing

        System.out.println("f1 = " + f1 + ", f2 = " + f2 + ", f3 = " + f3);


        boolean g1 = true;

        Boolean g2 = g1; // autoboxing

        boolean g3 = g2; // unboxing

        System.out.println("g1 = " + g1 + ", g2 = " + g2 + ", g3 = " + g3);


        char h1 = 'H';

        Character h2 = h1; // autoboxing

        char h3 = h2; // unboxing

        System.out.println("h1 = " + h1 + ", h2 = " + h2 + ", h3 = " + h3);

    }

}
