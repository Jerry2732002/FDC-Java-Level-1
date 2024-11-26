package src.week_one.day_three.classes.question01;

public class Student extends Person{

    private int rollNo;
    private double percentage;

    public Student(String name, int age, String contactNo, int rollNo, double percentage) {
        super(name, age, contactNo);
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    public Student(int rollNo, double percentage) {
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    public Student(String name, int age, int rollNo, double percentage) {
        super(name, age);
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    public void printDetails(){
        System.out.println("Student Details :");
        System.out.println("Name : " + this.name + "\nAge : " + this.age + "\nContact No :" + this.contactNo
                + "\nRoll No : " + this.rollNo + "\nPercentage : " + this.percentage);
        System.out.println("**************************************");
    }

}
