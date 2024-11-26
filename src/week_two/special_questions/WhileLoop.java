package src.week_two.special_questions;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        String command = "";
        Scanner sc = new Scanner(System.in);

        while (!command.equalsIgnoreCase("exit")) {
            System.out.println("Command : ");
            command = sc.nextLine();
            if(!command.equalsIgnoreCase("exit")) {
                System.out.println("Processing command.....");
            }
        }
        sc.close();
    }
}
