package src.week_three.day_two.question6;

import java.util.*;

public class SchoolClass {
    private final char section;
    private final byte grade;

    public SchoolClass(char section, byte grade) {
        this.section = section;
        this.grade = grade;
    }

    Set<Student> students = new HashSet<>();
    int counter = 0;

    public void addStudent(Student student) {
        Scanner scanner = new Scanner(System.in);
        if (students.contains(student)) {
            System.out.println("Duplicate student detected do still want to add(y/n)?");
            if (scanner.next().charAt(0) == 'y'){
                student.incrementUserCount(Collections.frequency(students,student));
                scanner.close();
            }else {
                scanner.close();
                return;
            }
        }
        student.setSection(section);
        student.setGrade(grade);
        students.add(student);
    }

    public Set<Student> sortedStudents() {
        return new TreeSet<>(students);
    }

    private Set<Student> setStudentsRollNo() {
        int rollNo = 1;
        Set<Student> sortedStudents = sortedStudents();
        for (Student student : sortedStudents) {
            student.setRollNo(rollNo);
            rollNo++;
        }
        return sortedStudents;
    }

    public void displayStudent() {
        for (Student student : setStudentsRollNo()) {
            student.printDetails();
        }
    }
}
