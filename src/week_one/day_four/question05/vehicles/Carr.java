package src.week_one.day_four.question05.vehicles;

import src.week_one.day_four.question05.enums.FuelType;
import src.week_one.day_four.question05.Vehicle;
import src.week_one.day_four.question05.enums.VehicleType;

public class Carr extends Vehicle {

    public Carr( FuelType fuelType, float mileage, float maxFuelCapacity, float fuelAmount) {
        super(VehicleType.FOUR_WHEELER, fuelType, mileage, maxFuelCapacity, fuelAmount);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started! " + this.fuelType + " is at " + this.getFuelPercentage() + "%."
                + " With current amount of fuel, maximum distance achievable is " + this.achiveableDistance() + "Km");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine STOPPED!");
    }
}
