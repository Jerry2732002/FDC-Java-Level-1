package src.week_one.day_four.question05.vehicles;

import src.week_one.day_four.question05.FuelType;
import src.week_one.day_four.question05.Seacraft;
import src.week_one.day_four.question05.Vehicle;
import src.week_one.day_four.question05.VehicleType;

public class Boat extends Vehicle implements Seacraft {
    private byte noOfSeats;

    public Boat(FuelType fuelType, float mileage, float maxFuelCapacity, float fuelAmount, byte noOfSeats) {
        super(VehicleType.OTHER, fuelType, mileage, maxFuelCapacity, fuelAmount);
        this.noOfSeats = noOfSeats;
    }

    @Override
    public void startEngine() {
        System.out.println("Bus engine started and ready to sail! Maximum seating capacity is " + this.noOfSeats + "." + this.fuelType + " is at " + this.getFuelPercentage() + "%."
                + " With current amount of fuel, maximum distance achievable is " + this.achiveableDistance() + "Km");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine STOPPED!");
    }

    @Override
    public void sail() {
        System.out.println("We are sailing now!");
    }
}
