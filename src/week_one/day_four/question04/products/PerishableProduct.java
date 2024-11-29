package src.week_one.day_four.question04.products;

import src.week_one.day_four.question04.Inventory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PerishableProduct implements Product {
    private final String productName;
    private final Date expirationDate;
    private double price;
    private int quantity;


    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    public PerishableProduct(String productName, String expirationDate, double price, int quantity) throws ParseException {
        this.productName = productName;
        this.expirationDate = formatter.parse(expirationDate);
        this.price = price;
        this.quantity = quantity;

    }

    @Override
    public Double calculateDiscount() {
        Date today = new Date();

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(expirationDate);
        calendar.add(Calendar.DAY_OF_YEAR, -7);
        Date oneWeekBefore = calendar.getTime();

        calendar.setTime(expirationDate);
        calendar.add(Calendar.DAY_OF_YEAR, -14);
        Date twoWeekBefore = calendar.getTime();


        if (today.after(this.expirationDate)) {
            System.out.println("Product " + this.productName + " Expired");
            Inventory.removeFromInventory(this.productName);
            return null;

        } else if (today.after(oneWeekBefore)) {
            this.price = this.price - (this.price * .40);
        } else if (today.after(twoWeekBefore)) {
            this.price = this.price - (this.price * .20);
        }
        return this.price;

    }

    @Override
    public String getName() {
        return this.productName;
    }

    @Override
    public void updateQuatity(int change) {
        quantity += change;
    }

    @Override
    public void printDetails() {
        System.out.println("\n\n*****************************");
        System.out.println("Product Details:" +
                "\nProduct name='" + productName + '\'' +
                "\nExpiration Date=" + expirationDate +
                "\nPrice=" + price +
                "\nQuantity=" + quantity
                );
    }
}
