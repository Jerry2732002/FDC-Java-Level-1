package src.week_three.day_three.question5;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Byte, ClassRoom> school = new TreeMap<>();

        ClassRoom class8A = new ClassRoom('A', (byte) 8);
        ClassRoom class8B = new ClassRoom('B', (byte) 8);
        ClassRoom class8C = new ClassRoom('C', (byte) 8);

        school.put(class8A.getGrade(), class8A);
        school.put(class8B.getGrade(), class8B);
        school.put(class8C.getGrade(), class8C);

        char continueChoice = 'n';
        do {
            System.out.println("Enter section (A, B, C): ");
            char section = sc.next().charAt(0);
            sc.nextLine();

            if (section == 'A' || section == 'B' || section == 'C') {
                System.out.println("Enter 1 to add student, 2 to display students:");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    System.out.println("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter DOB (dd-mm-yyyy): ");
                    String dob = sc.nextLine();

                    Student newStudent = new Student(name, dob, section, (byte) 8);

                    if (school.get((byte) 8).isDuplicateStudent(newStudent)) {
                        System.out.println("Duplicate student found. Do you want to add again? (y/n): ");
                        char confirm = sc.next().charAt(0);
                        if (confirm == 'n' || confirm == 'N') {
                            continue;
                        }
                    }

                    school.get((byte) 8).addStudent(newStudent);
                } else if (choice == 2) {
                    school.get((byte) 8).assignRollNumbers();
                    school.get((byte) 8).displayStudents();
                }
            } else {
                System.out.println("Invalid section input.");
            }

            System.out.println("Do you want to continue (y/n)?");
            continueChoice = sc.next().charAt(0);
        } while (continueChoice == 'y' || continueChoice == 'Y');
    }
}

