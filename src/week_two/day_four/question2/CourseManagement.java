package src.week_two.day_four.question2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CourseManagement {
    Course course1 = new Course("Math", Arrays.asList(new Student("Alice", 85), new Student("Bob", 90)));
    Course course2 = new Course("History", Arrays.asList(new Student("Charlie", 80), new Student("Dave", 75)));
    Course course3 = new Course("Physics", Arrays.asList(new Student("Charlie", 80), new Student("Dave", 75)));
    Course course4 = new Course("Chemistry", Arrays.asList(new Student("Charlie", 80), new Student("Dave", 75)));
    List<Course> courses = Arrays.asList(course1, course2, course3, course4);

    public void multiLevelSortCourse() {
        System.out.println("All Course Details : ");
        courses.stream()
                .sorted(Comparator.comparing(Course::getAverageGrade)
                        .reversed()
                        .thenComparing(Course::getCourseName))
                .forEach(course -> {
                    System.out.println("***************************************");
                    System.out.println("Course Name : " + course.courseName);
                    course.sortStudents();
                });
    }

}
