package src.week_three.day_one;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> values = null;
        int n;
        int d;
        int queries;
        System.out.println("Enter n:");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter d");
            d = sc.nextInt();
            values = new ArrayList<>();
            System.out.println("Enter " + d + "values");
            for (int j = 0; j < d; j++) {
                values.add(sc.nextInt());
            }
            matrix.add(values);
        }
        System.out.println("Enter the number of queries");
        queries = sc.nextInt();

        int[] x = new int[queries];
        int[] y = new int[queries];
        System.out.println("Enter " + queries + " number of queries");
        for (int i = 0; i < queries; i++) {
            System.out.println("Enter x & y");
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < queries; i++) {
            try {
                System.out.println("Value at (" + x[i] + "," + y[i] + ") is :" + matrix.get(x[i] - 1).get(y[i] - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
