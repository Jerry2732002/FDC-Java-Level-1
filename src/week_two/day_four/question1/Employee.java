package src.week_two.day_four.question1;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;
    int age;

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}
