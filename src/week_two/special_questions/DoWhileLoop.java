package src.week_two.special_questions;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        String command;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Command : ");
            command = sc.nextLine();
            if (!command.equalsIgnoreCase("exit")) {
                System.out.println("Processing command.....");
            }
        } while (!command.equalsIgnoreCase("exit"));
        sc.close();
    }
}
