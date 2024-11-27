package src.week_one.day_three.classes.question01;

public class Person {
    protected String name;
    protected int age;
    protected String contactNo;

    private static final String DEFAULT_NAME = "Unknown";
    private static final int DEFAULT_AGE = 18;
    private static final String DEFAULT_CONTACT_NO = "XXXXXXXXX";

    public Person(String name, int age, String contactNo) {
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
    }

    public Person() {
        this(DEFAULT_NAME,DEFAULT_AGE,DEFAULT_CONTACT_NO);
    }

    public Person(String name, int age) {
        this(name,age,DEFAULT_CONTACT_NO);
    }


}
