package src.week_two.day_one;

import src.week_two.day_one.exceptions.BasicExceptions;
import src.week_two.day_one.generics.question01.Box;
import src.week_two.day_one.generics.question04.ArrayStorage;

import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekTwoDayOneExecute {
    /// //////////////////GENERICS////////////////////////
    //Question 1
    public static void executeQuestion01() {
        Box<String> stringBox = new Box<>("Initial String");
        stringBox.DisplayType();
        stringBox.setObject("New Value");
        System.out.println("Using getter : " + stringBox.getObject());
    }

    //Question 2
    static <T> void printArray(T[] array) {
        System.out.println("Printing array : ");
        for (T value : array) {
            System.out.println(value);
        }
    }

    public static void executeQuestion02() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
        String[] strings = {"Hello", "Hi", "How are you", "How is it going"};
        System.out.println("Number array");
        printArray(numbers);
        System.out.println("String array");
        printArray(strings);
    }

    //Question 3
    static <T extends Number> boolean compare(T value1, T value2) {
        if (value1.equals(value2)) {
            return true;
        }
        return false;
    }

    public static void executeQuestion03() {
        System.out.println("Comparing integers 'compare(2,2)' :");
        System.out.println(compare(2, 2));

        System.out.println("Comparing double 'compare(1.454,2.234525)'");
        System.out.println(compare(1.454, 2.234525));
    }

    //Question 4
    public static void executeQuestion04() {
        ArrayStorage<Integer> integerArrayStorage = new ArrayStorage<>();
        integerArrayStorage.add(1);
        integerArrayStorage.add(2);
        integerArrayStorage.add(3);
        integerArrayStorage.add(4);
        integerArrayStorage.add(5);
        integerArrayStorage.printList();
        System.out.println("Value at 4th index : " + integerArrayStorage.get(4));
    }

    //Question 5
    public static <T> void swapArrayValues(T[] arrayOne, T[] arrayTwo) {
        T temp;
        System.out.println("Before Swap :");
        System.out.println("Array 1 : " + Arrays.asList(arrayOne));
        System.out.println("Array 2 : " + Arrays.asList(arrayTwo));
        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                temp = arrayOne[i];
                arrayOne[i] = arrayTwo[i];
                arrayTwo[i] = temp;
            }
            System.out.println("After Swap :");
            System.out.println("Array 1 : " + Arrays.asList(arrayOne));
            System.out.println("Array 2 : " + Arrays.asList(arrayTwo));
        } else {
            System.out.println("Varying Length Can't combine");
        }
    }

    public static void executeQuestion05() {
        Integer[] arrayOne = {1, 2, 3, 4, 5};
        Integer[] arrayTwo = {6, 7, 8, 9, 10};
        swapArrayValues(arrayOne, arrayTwo);
    }

    /// //////////////////EXCEPTION////////////////////////
    //Question 1
    public static void executeQuestion06() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers  to divide :");
        int numOne = sc.nextInt();
        int numTwo = sc.nextInt();
        BasicExceptions obj = new BasicExceptions();
        try {
            System.out.println("Result :");
            System.out.println(obj.divide(numOne, numTwo));
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
        } finally {
            System.out.println("Execution finished");
        }
    }

    //Question 2
    public static void executeQuestion07() {
        Scanner sc = new Scanner(System.in);
        BasicExceptions obj = new BasicExceptions();
        try {
            System.out.println("Enter 2 numbers  to divide :");
            int numOne = sc.nextInt();
            int numTwo = sc.nextInt();

            try {
                System.out.println("Result :");
                System.out.println(obj.divide(numOne, numTwo));
            } catch (ArithmeticException e) {
                System.out.println("Cannot Divide by Zero");
            } finally {
                System.out.println("Execution finished");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter numbers only");
        }
    }

    //Question 3
    public static void executeQuestion08() {
        Scanner sc = new Scanner(System.in);
        BasicExceptions obj = new BasicExceptions();
        try {
            System.out.println("Enter 2 numbers  to divide :");
            int numOne = sc.nextInt();
            int numTwo = sc.nextInt();
            System.out.println("Result :");
            System.out.println(obj.divide(numOne, numTwo));
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
        } catch (InputMismatchException e) {
            System.out.println("Enter only numbers");
        } finally {
            System.out.println("Execution finished");
        }
    }
    //Question 4
    public static void executeQuestion09(){
        try {
            File file = new File("sample.txt");
//            File file = new File("src/week_two/day_one/exceptions/sample.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Hello From Source Code");
            System.out.println("Successfully written content to file");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program Executed");
        }

    }
}

