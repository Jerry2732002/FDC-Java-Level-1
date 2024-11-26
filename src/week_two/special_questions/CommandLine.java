package src.week_two.special_questions;

public class CommandLine {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid number of arguments");
        } else {
            System.out.println("Command Line Arguments are : " + args[0] + " & " + args[1]);
        }
    }
}
