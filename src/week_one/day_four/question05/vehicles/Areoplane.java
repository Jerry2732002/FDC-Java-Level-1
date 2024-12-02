package src.week_one.day_four.question05.vehicles;

import src.week_one.day_four.question05.interfaces.Aircraft;
import src.week_one.day_four.question05.enums.FuelType;
import src.week_one.day_four.question05.Vehicle;
import src.week_one.day_four.question05.enums.VehicleType;

public class Areoplane extends Vehicle implements Aircraft {
    private byte noOfSeats;
    public Areoplane(float mileage, float maxFuelCapacity, float fuelAmount,byte noOfSeats) {
        super(VehicleType.OTHER, FuelType.JET_FUEL, mileage, maxFuelCapacity, fuelAmount);
        this.noOfSeats = noOfSeats;
    }

    @Override
    public void startEngine() {
        System.out.println("Bus engine started! Please check runway before takeoff. Maximum seating capacity is " + this.noOfSeats + "." + this.fuelType + " is at " + this.getFuelPercentage() + "%."
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
