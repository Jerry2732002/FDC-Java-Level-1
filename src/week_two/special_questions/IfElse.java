package src.week_two.special_questions;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        if(number == 0) {
            System.out.println("The number is zero");
        } else if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}