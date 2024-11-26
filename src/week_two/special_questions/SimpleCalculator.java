package src.week_two.special_questions;

import java.util.Scanner;

public class SimpleCalculator {

    private static double calculate(double result, String[] operandOrOperators) {

        for (int i = 1; i < operandOrOperators.length; i = i + 2) {
            System.out.println("reult before switch :" + result);
            switch (operandOrOperators[i]) {
                case "+":
                    return result + Double.parseDouble(operandOrOperators[i + 1]);
                case "-":
                    return result - Double.parseDouble(operandOrOperators[i + 1]);
                case "*":
                    return result * Double.parseDouble(operandOrOperators[i + 1]);
                case "/":
                    return result / Double.parseDouble(operandOrOperators[i + 1]);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String command;
        double result = 0.0;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Enter formula (e.g. '1.5 + 2.8', or '* 2', or 'exit' to quit): ");
            command = sc.nextLine();

            String[] operandOrOperators = command.split("\\s");
            //Checks if the first character(s) is a digit or operator
            if (Character.isDigit(operandOrOperators[0].charAt(0))) {
                result = result + Double.parseDouble(operandOrOperators[0]);
                System.out.println("result at if : " + result);
            }
            System.out.println("result at else : " + result);
            result = calculate(result, operandOrOperators);

            System.out.println("Result : " + result);

        } while (!command.equalsIgnoreCase("exit"));
    }
}
