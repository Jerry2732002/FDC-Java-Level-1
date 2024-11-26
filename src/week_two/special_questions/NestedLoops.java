package src.week_two.special_questions;

public class NestedLoops {

    public static void main(String[] args) {
        System.out.println("================================================");

        for (int j = 8; j > 0; j--) {
            for (char i = 'A'; i <= 'H'; i++) {
                System.out.print("| " + i + j + " |");
            }
            System.out.println();
            System.out.println("================================================");

        }
    }
}
