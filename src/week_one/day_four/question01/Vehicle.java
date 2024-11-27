package src.week_one.day_four.question01;

public abstract class Vehicle {
    protected String model;
    protected double dailyRent;

    abstract void calculateVehicleRent();

    abstract public void printDetails();
}
