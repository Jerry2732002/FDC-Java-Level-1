package src.week_two.day_two;

import java.io.IOException;
import java.util.Scanner;

public class WeekTwoDayTwoExecutable {
    public static void executeQuestion1() {
        SquareRoot root = new SquareRoot();
        System.out.println(root.squareRoot(-12));
    }

    public static void executeQuestion2() {
        ExceptionPropagation exception = new ExceptionPropagation();
        exception.exceptionPropagation();
    }

    public static void executeQuestion3() {
        int numOne;
        int numTwo;
        Scanner sc = new Scanner(System.in);
        DivisionArray divisionArray = new DivisionArray();
        int result = 0;
        while (true) {
            System.out.println("Enter 2 numbers");
            numOne = sc.nextInt();
            numTwo = sc.nextInt();
            try {
                try {
                    result = divisionArray.divide(numOne, numTwo);
                } catch (ArithmeticException ae) {
                    System.out.println("Invalid input 2nd input cant be zero");
                    break;
                }
                try {
                    divisionArray.addToArray(result);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Maximum Capacity Reached");
                    divisionArray.printArray();
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect Input");
            }
        }
        sc.close();
    }
    public static void executeQuestion4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name");
        String fileName = sc.next();

        FileCheckReader fileCheckReader = new FileCheckReader();

        try {
            fileCheckReader.readFile(fileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
