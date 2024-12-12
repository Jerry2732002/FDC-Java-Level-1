package src.week_three.day_three.question5;

import java.util.Objects;

public class Student {
    private String name;
    private String dob;
    private char section;
    private byte grade;
    private int rollNo;

    public Student(String name, String dob, char section, byte grade) {
        this.name = name;
        this.dob = dob;
        this.section = section;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public char getSection() {
        return section;
    }

    public byte getGrade() {
        return grade;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", DOB: " + dob + ", Section: " + section);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return name.equals(student.name) && dob.equals(student.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dob);
    }
}
