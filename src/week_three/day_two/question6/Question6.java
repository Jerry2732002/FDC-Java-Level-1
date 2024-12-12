package src.week_three.day_two.question6;

import java.util.Scanner;

public class Question6 {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        SchoolClass sectionA = new SchoolClass('A', (byte) 8);
        SchoolClass sectionB = new SchoolClass('B', (byte) 8);
        SchoolClass sectionC = new SchoolClass('C', (byte) 8);
        String studentName;
        String dob;
        char ch = 'n';

        do {
            System.out.println("Enter section (A, B, C):");
            char section = sc.next().charAt(0);

            if (section == 'A' || section == 'B' || section == 'C') {
                System.out.println("Enter 1 to add student\nEnter 2 to display all students");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1: {
                        System.out.println("Enter name:");
                        studentName = sc.nextLine();
                        System.out.println("Enter DOB (format: dd-mm-yyyy):");
                        dob = sc.nextLine();
                        if (section == 'A') {
                            sectionA.addStudent(new Student(studentName, dob));
                        } else if (section == 'B') {
                            sectionB.addStudent(new Student(studentName, dob));
                        } else if (section == 'C') {
                            sectionC.addStudent(new Student(studentName, dob));
                        }
                        break;
                    }
                    case 2: {
                        if (section == 'A') {
                            System.out.println("SECTION A STUDENTS");
                            sectionA.displayStudent();
                        } else if (section == 'B') {
                            System.out.println("SECTION B STUDENTS");
                            sectionB.displayStudent();
                        } else if (section == 'C') {
                            System.out.println("SECTION C STUDENTS");
                            sectionC.displayStudent();
                        }
                        System.out.println("*****************************************");
                        break;
                    }
                    default:
                        System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Wrong input. Only enter A, B, or C.");
            }

            System.out.println("Do you want to continue (y/n)?");
            ch = sc.next().charAt(0);
            sc.nextLine();
        } while (ch == 'y' || ch == 'Y');
    }
}
