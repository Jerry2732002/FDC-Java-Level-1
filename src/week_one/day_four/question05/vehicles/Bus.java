package src.week_one.day_four.question05.vehicles;

import src.week_one.day_four.question05.FuelType;
import src.week_one.day_four.question05.Vehicle;
import src.week_one.day_four.question05.VehicleType;

public class Bus extends Vehicle {
    private byte noOfSeats;

    public Bus(FuelType fuelType, float mileage, float maxFuelCapacity, float fuelAmount, byte noOfSeats) {
        super(VehicleType.HMV, fuelType, mileage, maxFuelCapacity, fuelAmount);
        this.noOfSeats = noOfSeats;
    }

    @Override
    public void startEngine() {
        System.out.println("Bus engine started! Maximum seating capacity is " + this.noOfSeats + "." + this.fuelType + " is at " + this.getFuelPercentage() + "%."
                + " With current amount of fuel, maximum distance achievable is " + this.achiveableDistance() + "Km");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine STOPPED!");
    }
}
