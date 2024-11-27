package src.week_one.day_four.question01;

public class VehicleOperations {

    public static void calculateRent(Bike bike) {
        System.out.println("Overloading");
        double rent = bike.dailyRent + ((bike.dailyRent * bike.getTax()) / 100);
        System.out.println("Rent of Bike = " + rent);
    }
    public static void calculateRent(Car car) {
        System.out.println("Overloading");
        double rent = car.dailyRent + ((car.dailyRent * car.getTax()) / 100);
        System.out.println("Rent of Bike = " + rent);
    }
    public static void calculateRent(Truck truck) {
        System.out.println("Overloading");
        double rent = truck.dailyRent + ((truck.dailyRent * truck.getTax()) / 100);
        System.out.println("Rent of Bike = " + rent);
    }


    public static void overrideRentCalculation(Vehicle vehicle) {
        vehicle.calculateVehicleRent();
    }
    public static void printVehicleDetails(Vehicle vehicle) {
        vehicle.printDetails();
    }

}
