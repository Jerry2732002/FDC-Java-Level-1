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
import src.week_one.day_four.question04.Discountable;
import src.week_one.day_four.question04.Inventory;
import src.week_one.day_four.question04.products.NonPerishableProduct;
import src.week_one.day_four.question04.products.PerishableProduct;
import src.week_one.day_four.question04.products.Product;

import java.text.ParseException;
import java.util.Arrays;


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

        BankAccount account1 = new SavingAccount(1001, 0);
        BankAccount account2 = new CheckingAccount(1002, 0);
        PaymentMethod googlePay = new GooglePay();
        PaymentMethod credit = new CreditCard();
        PaymentMethod debit = new DebitCard();

        account1.deposit(10_000);

        account2.deposit(20_000);

        BankAccount.transferFund(googlePay,account1,account2,1000);
        System.out.println("\n\n");
        BankAccount.transferFund(credit,account1,account2,1000);
        System.out.println("\n\n");
        BankAccount.transferFund(credit,account2,account1,1000);
        System.out.println("\n\n");
        BankAccount.transferFund(debit,account1,account2,2000);
    }

    public static void executeQuestion04() throws ParseException {
        Inventory inventory = new Inventory();
        Product doll = new NonPerishableProduct("Doll",150,15);
        Product shoes = new NonPerishableProduct("Shoes", 1200, 40);
        Product bread = new PerishableProduct("Bread" , "04-12-2024",40,200);
        Product cake = new PerishableProduct("Cake" , "04-11-2024",40,200);

        inventory.addToInventory(Arrays.asList(doll,shoes,bread,cake));
        inventory.printDetailsOfAllProducts();

        Discountable.applyDiscount(doll);
        Discountable.applyDiscount(shoes);
        Discountable.applyDiscount(bread);
        Discountable.applyDiscount(cake);

        Inventory.removeFromInventory(cake.getName());



    }
}
