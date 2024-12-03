package src.week_two.day_two;


import java.util.Arrays;
import java.util.Collections;

public class DivisionArray {
    int[] arr = new int[5];
    int i = 0;
    public int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public void addToArray(int result)throws IndexOutOfBoundsException{
        arr[i++] = result;
    }
    public void printArray(){
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
