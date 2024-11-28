package src.week_one.day_four;

import src.week_one.day_four.question01.Bike;
import src.week_one.day_four.question01.Car;
import src.week_one.day_four.question01.Truck;
import src.week_one.day_four.question01.VehicleOperations;
import src.week_one.day_four.question02.*;
import src.week_one.day_four.question03.bank_accounts.BankAccount;
import src.week_one.day_four.question03.payment_methods.*;
import src.week_one.day_four.question03.bank_accounts.CheckingAccount;
import src.week_one.day_four.question03.bank_accounts.SavingAccount;

import java.util.Scanner;

public class DayFourExecution {

    public static void executeQuestion01() {
        Bike bike = new Bike(5, 10000, "Sport");

        Car car = new Car(10, 20000, "Sedan");

        Truck truck = new Truck(20, 50000, "8-Wheeler");

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

    public static void executeQuestion02() {
        Playable audioFile = new AudioFile("Gangeee", 4, "Yeshudas");
        Playable videoFile = new VideoFile("Interstellar", "Christopher Nolan", "1080p");
        Playable podCast = new Podcast("Podcast01", "Navin Reddy", "Why Java is good");

        MediaPlayer player = new MediaPlayer();
        player.addToQueue(audioFile);
        player.addToQueue(videoFile);
        player.addToQueue(podCast);
        player.playAll();
    }


    public static void executeQuestion03() {
        Scanner sc = new Scanner(System.in);
        String command;
        BankAccount account1 = new SavingAccount(1001, 55_000);
        BankAccount account2 = new CheckingAccount(1002, 75_000);
        PaymentMethod googlePay = new GooglePay();
        PaymentMethod credit = new CreditCard();
        PaymentMethod debit = new DebitCard();

        TransferFund.transferFund(googlePay,account1,account2,1000);
        TransferFund.transferFund(credit,account1,account2,1000);
        TransferFund.transferFund(credit,account2,account1,1000);
        TransferFund.transferFund(debit,account1,account2,2000);
    }
}
