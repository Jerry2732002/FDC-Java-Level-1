package src.week_three.day_three.question5;

import src.week_three.day_three.question5.Student;
import java.util.*;

public class ClassRoom {
    private final char section;
    private final byte grade;
    private Map<Character, List<Student>> students = new TreeMap<>();

    public ClassRoom(char section, byte grade) {
        this.section = section;
        this.grade = grade;
    }

    public char getSection() {
        return section;
    }

    public byte getGrade() {
        return grade;
    }

    public boolean addStudent(Student student) {
        students.computeIfAbsent(student.getSection(), k -> new ArrayList<>()).add(student);
        return true;
    }

    public boolean isDuplicateStudent(Student student) {
        List<Student> sectionStudents = students.get(student.getSection());
        if (sectionStudents != null) {
            for (Student s : sectionStudents) {
                if (s.equals(student)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void assignRollNumbers() {
        for (List<Student> sectionStudents : students.values()) {
            sectionStudents.sort(Comparator.comparing(Student::getName).thenComparing(Student::getDob));
            int rollNo = 1;
            for (Student student : sectionStudents) {
                student.setRollNo(rollNo++);
            }
        }
    }

    public void displayStudents() {
        for (List<Student> sectionStudents : students.values()) {
            for (Student student : sectionStudents) {
                student.printDetails();
            }
        }
    }
}
