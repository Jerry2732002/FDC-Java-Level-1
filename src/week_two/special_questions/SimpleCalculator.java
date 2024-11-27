package src.week_two.special_questions;

import java.util.Scanner;

public class SimpleCalculator {

    private static double twoVariableCalculate(double result, String[] operandOrOperators) {

        for (int i = 1; i < operandOrOperators.length; i = i + 2) {
            switch (operandOrOperators[i]) {
                case "+":
                    result += Double.parseDouble(operandOrOperators[i + 1]); break;
                case "-":
                    result -= Double.parseDouble(operandOrOperators[i + 1]); break;
                case "*":
                    result *= Double.parseDouble(operandOrOperators[i + 1]); break;
                case "/":
                    result /= Double.parseDouble(operandOrOperators[i + 1]); break;
            }

        }
        return result;
    }

    private static double oneVariableCalculate(double result, String[] operandOrOperators) {

        for (int i = 0; i < operandOrOperators.length; i = i + 2) {
            switch (operandOrOperators[i]) {
                case "+":
                    result += Double.parseDouble(operandOrOperators[i + 1]); break;
                case "-":
                    result -= Double.parseDouble(operandOrOperators[i + 1]); break;
                case "*":
                    result *= Double.parseDouble(operandOrOperators[i + 1]); break;
                case "/":
                    result /= Double.parseDouble(operandOrOperators[i + 1]); break;
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
            //Checks if the first character is a digit or operator
            if (Character.isDigit(operandOrOperators[0].charAt(0))) {
                result = result + Double.parseDouble(operandOrOperators[0]);
                result = twoVariableCalculate(result, operandOrOperators);
            }else {
                result = oneVariableCalculate(result,operandOrOperators);
            }
            System.out.println("Result : " + result);
        } while (!command.equalsIgnoreCase("exit"));
    }
}
