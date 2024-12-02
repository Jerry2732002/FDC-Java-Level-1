package src.week_one.day_four.question05.vehicles;

import src.week_one.day_four.question05.enums.FuelType;
import src.week_one.day_four.question05.Vehicle;
import src.week_one.day_four.question05.enums.VehicleType;

public class Bikee extends Vehicle {

    public Bikee(float mileage, float maxFuelCapacity, float fuelAmount) {
        super(VehicleType.TWO_WHEELER, FuelType.PETROL, mileage, maxFuelCapacity, fuelAmount);
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine started! " + this.fuelType + " is at " + this.getFuelPercentage() + "%."
                + " With current amount of fuel, maximum distance achievable is " + this.achiveableDistance() + "Km");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine STOPPED!");
    }
}
