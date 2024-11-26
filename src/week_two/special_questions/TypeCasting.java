package src.week_two.special_questions;

public class TypeCasting {

    public static void main(String[] args) {

        short a1 = 1023;

        byte a2 = (byte) a1;

        short a3 = a2;

        System.out.println("a1 = " + a1 + ", a2 = " + a2 + ", a3 = " + a3);


        long b1 = 45_000_000_000L;

        int b2 = (int) b1;

        long b3 = b2;

        System.out.println("b1 = " + b1 + ", b2 = " + b2 + ", b3 = " + b3);


        double c1 = 0.1234567890123d;

        float c2 = (float) c1;

        double c3 = c2;

        System.out.println("c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3);


        float d1 = 3.91f;

        int d2 = (int) d1;

        float d3 = d2;

        System.out.println("d1 = " + d1 + ", d2 = " + d2 + ", d3 = " + d3);


        char e1 = 'മ';

        short e2 = (short) e1;

        char e3 = (char) e2;

        System.out.println("e1 = " + e1 + ", e2 = " + e2 + ", e3 = " + e3);

    }

}
