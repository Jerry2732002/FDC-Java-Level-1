package src.week_one.day_two;

class Employee {


    private String name;
    private String department;
    private String contactNo;
    private double salary;


    public Employee(String name, String department, String contactNo, double salary) {
        this.name = name;
        this.department = department;
        this.contactNo = contactNo;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.name + "\nDepartment : " + this.department + "\nContact No : " + this.contactNo + "\nSalary : " + this.salary);
    }
}

public class OOPs01 {
    public void useEmployee(){
        Employee emp = new Employee("Jerry", "Java Trainee","+91 9207828545",15000);
        emp.displayDetails();
    }
}