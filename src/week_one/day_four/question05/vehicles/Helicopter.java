package src.week_one.day_four.question05.vehicles;

import src.week_one.day_four.question05.Aircraft;
import src.week_one.day_four.question05.FuelType;
import src.week_one.day_four.question05.Vehicle;
import src.week_one.day_four.question05.VehicleType;

public class Helicopter extends Vehicle implements Aircraft {

    public Helicopter(VehicleType vehicleType, FuelType fuelType, float mileage, float maxFuelCapacity, float fuelAmount) {
        super(VehicleType.OTHER, FuelType.JET_FUEL, mileage, maxFuelCapacity, fuelAmount);
    }

    @Override
    public void startEngine() {
        System.out.println("Bus engine started! Please check helipad before takeoff."+ this.fuelType + " is at " + this.getFuelPercentage() + "%."
                + " With current amount of fuel, maximum distance achievable is " + this.achiveableDistance() + "Km");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine STOPPED!");
    }

    @Override
    public void fly() {
        System.out.println("We are flying now!");
    }
}
