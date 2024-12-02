package src.week_one.day_four.question05;

import src.week_one.day_four.question05.enums.FuelType;
import src.week_one.day_four.question05.enums.VehicleType;

abstract public class Vehicle {
    protected VehicleType vehicleType;
    protected FuelType fuelType;
    protected float mileage;
    protected float maxFuelCapacity;
    protected  float fuelAmount;

    public Vehicle(VehicleType vehicleType, FuelType fuelType, float mileage, float maxFuelCapacity, float fuelAmount) {
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.maxFuelCapacity = maxFuelCapacity;
        this.fuelAmount = fuelAmount;
    }


    public void printDetails() {
        System.out.println("Vehicle Details : " +
                "\nVehicle Type = " + this.vehicleType +
                "\nFuel Type = " + this.fuelType +
                "\nMileage = " + this.mileage + " Km/Ltr" +
                "\nMaximum Fuel Capacity = " + this.maxFuelCapacity + " Ltr" +
                "\nCurrent Fuel = " + this.fuelAmount + " Ltr"
                );
    }

    public float achiveableDistance() {
        return this.fuelAmount * this.mileage;
    }

    public float getFuelPercentage() {
        return this.fuelAmount * 100 / maxFuelCapacity;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
}
