package src.week_one.day_four.question01;

public class Truck extends Vehicle {
    private double tax;

    public double getTax() {
        return this.tax;
    }

    public double getDailyRent() {
        return this.dailyRent;
    }

    public Truck(double tax, double dailyRent, String modal) {
        this.tax = tax;
        this.dailyRent = dailyRent;
        this.model = modal;
    }

    @Override
    public void calculateVehicleRent() {
        System.out.println("Overriding");
        double rent = this.dailyRent + ((this.dailyRent * this.tax) / 100);
        System.out.println("Rent of Bike = " + rent);
    }

    @Override
    public void printDetails() {
        System.out.println("******************************************");
        System.out.println("TRUCK DETAILS :");
        System.out.println("Model : " + this.model + "\nDaily Rate :" + this.dailyRent + "\n Tax = " + this.tax);
        System.out.println("******************************************");
    }
}
