package src.week_three.day_one;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printDetail() {
        System.out.println("{Name :" + name + ", Salary :" + salary + "}");
    }
}

public class Question6 {
    public static void execute() {
        ArrayList<Employee> employees = new ArrayList<>(List.of(
                new Employee("Jerry", 10000),
                new Employee("Sam", 12000),
                new Employee("Johns", 9000),
                new Employee("Thasleena", 11000),
                new Employee("Akash", 7000)
        ));
        employees.sort((employee1, employee2) -> employee1.salary - employee2.salary);
        for (Employee employee : employees) {
            employee.printDetail();
        }
    }
}
