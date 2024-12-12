package src.week_three.day_two.question6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SchoolClass {
    private final char section ;
    private final byte grade;
    public SchoolClass(char section, byte grade) {
        this.section = section;
        this.grade = grade;
    }

    Set<Student> students = new HashSet<>();

    public void addStudent(Student student) {
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
    public void displayStudent(){
        for (Student student: setStudentsRollNo()) {
            student.printDetails();
        }
    }
}
