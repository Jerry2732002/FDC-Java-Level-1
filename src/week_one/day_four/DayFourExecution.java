package src.week_one.day_four;

import src.week_one.day_four.question01.Bike;
import src.week_one.day_four.question01.Car;
import src.week_one.day_four.question01.Truck;
import src.week_one.day_four.question01.VehicleOperations;

public class DayFourExecution {

    public static void executeQuestion01(){
        Bike bike = new Bike(5,10000, "Sport");

        Car car = new Car(10,20000,"Sedan");

        Truck truck = new Truck(20, 50000,"8-Wheeler");

        //Overloading
        VehicleOperations.calculateRent(bike);
        VehicleOperations.calculateRent(car);
        VehicleOperations.calculateRent(truck);
        System.out.println("\n\n");
        //Overriding
        VehicleOperations.overrideRentCalculation(bike);
        VehicleOperations.overrideRentCalculation(car);
        VehicleOperations.overrideRentCalculation(truck);
        System.out.println("\n\n");
        VehicleOperations.printVehicleDetails(bike);
        VehicleOperations.printVehicleDetails(car);
        VehicleOperations.printVehicleDetails(truck);
    }
}
