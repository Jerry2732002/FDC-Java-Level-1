package src.week_two.special_questions;

import java.util.Scanner;

public class InfiniteWhileLoop {
    public static void main(String[] args) {
        String command;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Command : ");
            command = sc.nextLine();
            if (!command.equalsIgnoreCase("exit")) {
                System.out.println("Processing command.....");
            } else {
                break;
            }
        }
        sc.close();
    }
}
