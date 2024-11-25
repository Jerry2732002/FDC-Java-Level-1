package src.week_one.day_two.oops_02;

public class Vehicle {

    private Type type;
    private FuelType fuelType;


    private String modal;
    private String brand;
    private double price;

    public Vehicle(Type type, FuelType fuelType, String modal, String brand, double price) {
        this.type = type;
        this.fuelType = fuelType;
        this.modal = modal;
        this.brand = brand;
        this.price = price;
    }

    public Vehicle(Type type, double price) {
        this.type = type;
        this.price = price;
    }

    public Vehicle(Type type, FuelType fuelType, double price) {
        this.type = type;
        this.fuelType = fuelType;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("\nVehicle Details : \n" +
                "Fuel Type = " + fuelType +
                "\nModal = " + modal +
                "\nBrand='" + brand +
                "\nPrice=" + price +
                "\nType=" + type);
    }
}
