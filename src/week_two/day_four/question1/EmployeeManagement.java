package src.week_two.day_four.question1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EmployeeManagement {
    List<Employee> employees = Arrays.asList(new Employee(2, "Alice", 60000, 28), new Employee(1, "Bob", 75000, 35), new Employee(4, "Charlie", 50000, 22), new Employee(3, "Sam", 10000, 21));

    public void printAllEmployeeDetails() {
        for (Employee employee : employees) {
            System.out.println("Id: " + employee.id + "\tName: " + employee.name + "\t\t\tsalary: " + employee.salary + "\t\t\tAge: " + employee.age);
        }
    }

    public void sortEmployeeByID() {
        Collections.sort(employees);
        printAllEmployeeDetails();
    }

    public void sortByName() {
        Collections.sort(employees, (employee1, employee2) -> employee1.name.compareTo(employee2.name));
        printAllEmployeeDetails();
    }

    public void sortBySalary() {
        Collections.sort(employees, (Employee e1, Employee e2) -> Double.compare(e2.salary,e1.salary));
        printAllEmployeeDetails();
    }

    public void sortByAge() {
        Collections.sort(employees, (Employee e1, Employee e2) -> e1.age - e2.age);
        printAllEmployeeDetails();
    }
}
