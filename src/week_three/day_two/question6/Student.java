package src.week_three.day_two.question6;

import java.util.Objects;


public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private final String dob;
    private byte grade;
    private char section;
    private int userCount;

    public Student(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public void setGrade(byte grade) {
        this.grade = grade;
    }

    public void incrementUserCount(int incrementer) {
        userCount += incrementer;
    }

    public void printDetails() {
        System.out.println("{" +
                "name='" + name +
                ", roll no=" + rollNo +
                ", dob='" + dob +
                ", grade=" + grade +
                ", section=" + section +
                ", counter=" + userCount +
                "}\n");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dob);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student that = (Student) o;
        if (name.equalsIgnoreCase(that.name) && dob.equals(that.dob)) {
            return userCount == ((Student) o).userCount;
        }
        return name.equalsIgnoreCase(that.name) && dob.equals(that.dob);
    }

    @Override
    public int compareTo(Student o) {
        if (name.compareTo(o.name) == 0 && dob.compareTo(o.dob) == 0) {
            return Integer.compare(userCount, o.userCount);
        }
        return name.compareTo(o.name);
    }
}