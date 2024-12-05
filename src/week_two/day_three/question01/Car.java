package src.week_two.day_three.question01;

import src.week_two.day_three.question01.exceptions.*;

public class Car {
    private final int carId;
    private float fuelLevel;
    private int units;
    private int speed;

    public Car(int carId, int speed, int units, float fuelLevel) throws IllegalArgumentException {
        this.carId = carId;
        if (speed < 0) {
            throw new IllegalArgumentException("Speed Cannot be Negative");
        }
        this.speed = speed;
        if (units < 0) {
            throw new IllegalArgumentException("Units Cannot be Negative");
        }
        this.units = units;
        if (fuelLevel < 0) {
            throw new IllegalArgumentException("Fuel Level Cannot be Negative");
        }
        this.fuelLevel = fuelLevel;
    }

    public void findMyCar(int carId) throws CarNotFoundException, IllegalArgumentException {
        if (carId < 0) {
            throw new IllegalArgumentException("Invalid Id :  " + carId + ", please enter valid id");
        }
        if (carId != this.carId) {
            throw new CarNotFoundException("Car of ID :" + carId + " not found");
        }
        System.out.println("Car Found");
    }

    public void drive() throws LowFuelException {
        if (this.fuelLevel >= 5) {
            System.out.println("Driving....");
        } else {
            throw new LowFuelException("Your fuel is low please go to near by gas station");
        }
    }

    public void accelerate(int acceleratedSpeed) throws SpeedLimitExceededException, IllegalArgumentException {
        if (acceleratedSpeed < 0) {
            throw new IllegalArgumentException("Acceleration Speed cannot be negative");
        }
        if (acceleratedSpeed + this.speed > 80) {
            throw new SpeedLimitExceededException("Speed Limit Exceeded Please Slow Down");
        }
    }

    public void isUnitAvailable(int units) throws UnitsExceededException {
        if (this.units < units) {
            throw new UnitsExceededException("Units Exceeded, only " + this.units + " available for purchase.");
        }
    }

    public void checkMalfunction() throws CarMalfunctionException {
        if (this.fuelLevel < 1) {
            throw new CarMalfunctionException("Car malfunction! Fuel level is critically low.");
        }
    }
}