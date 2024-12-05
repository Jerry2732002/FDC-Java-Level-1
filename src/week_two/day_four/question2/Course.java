package src.week_two.day_four.question2;

import java.util.Collections;
import java.util.List;

public class Course {
    String courseName;
    List<Student> students;

    public Course(String courseName, List<Student> students) {
        this.courseName = courseName;
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getAverageGrade() {
        double totalGrade = 0;
        for (Student student :students) {
            totalGrade += student.grade;
        }
        return totalGrade / students.size();
    }
    public void displayAllStudent() {
        System.out.println("\nAll Students Taking "+courseName+": ");
        for (Student student :students) {
            System.out.println("Name : " + student.name + " Grade : " + student.grade);
        }
    }
    public void sortStudents() {
        Collections.sort(students, (Student s1, Student s2) -> s2.grade - s1.grade);
        displayAllStudent();
    }
}
