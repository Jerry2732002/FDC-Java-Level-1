package src.week_two.special_questions;

public class NestedLoops {
    static void printSquare(char row, int col) {
//        System.out.println("+---+");
//        System.out.println("| " + row + col + " |");
//        System.out.print("+---+");

        System.out.print("| " + row + col + " |");
    }

    public static void main(String[] args) {
        for (char i = 'A'; i <= 'H'; i++) {
            for (int j = 8; j > 0; j--) {
                printSquare(i,j);
            }
            System.out.println();
        }
    }
}
