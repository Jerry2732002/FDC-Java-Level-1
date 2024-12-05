package src.week_two.day_four;

import src.week_two.day_four.question1.EmployeeManagement;
import src.week_two.day_four.question2.CourseManagement;
import src.week_two.day_four.question3.BookCollection;

public class WeekTwoDayFourExecutable {
    public static void executeQuestion1(){
        EmployeeManagement management = new EmployeeManagement();
        System.out.println("Sort By Id");
        management.sortEmployeeByID();
        System.out.println("\n**********************************************");
        System.out.println("Sort By Name");
        management.sortByName();
        System.out.println("\n**********************************************");
        System.out.println("Sort By Salary");
        management.sortBySalary();
        System.out.println("\n**********************************************");
        System.out.println("Sort By Age");
        management.sortByAge();
    }

    public static void executeQuestion2() {
        CourseManagement management = new CourseManagement();

        management.multiLevelSortCourse();
    }

    public static void executeQuestion3() {
        BookCollection collection = new BookCollection();

        collection.sortBook();
    }
}
