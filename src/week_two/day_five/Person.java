package src.week_two.day_five;

public class Person {
    String name;
    byte age;

    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public String printDetails() {
        return "[" + name + ", " + age + "]";
    }
}
