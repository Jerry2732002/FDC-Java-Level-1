package src.week_one.day_three.classes.question01;

public class Teacher extends Person{
    private String qualification;

    public Teacher(String name, int age, String contactNo, String qualification) {
        super(name, age, contactNo);
        this.qualification = qualification;
    }

    public Teacher(String qualification) {
        this.qualification = qualification;
    }

    public Teacher(String name, int age, String qualification) {
        super(name, age);
        this.qualification = qualification;
    }


    public void printDetails(){
        System.out.println("Teacher Details");
        System.out.println("Name : " + this.name + "\nAge : " + this.age + "\nContact No :" + this.contactNo + "\nQualification : " + this.qualification);
        System.out.println("**************************************");
    }
}
