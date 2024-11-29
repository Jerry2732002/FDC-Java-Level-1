package src.week_one.day_four.question05;

public class VehicleInfo {
    public static void vehicleInfo(Vehicle vehicle) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Issue with sleep");
        }
        vehicle.startEngine();
        System.out.println("\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Issue with sleep");
        }

        vehicle.stopEngine();
    }
}
