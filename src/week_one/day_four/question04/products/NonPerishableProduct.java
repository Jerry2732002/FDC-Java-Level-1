package src.week_one.day_four.question04.products;


import src.week_one.day_four.question04.Inventory;

import java.util.Calendar;

public class NonPerishableProduct implements Product {
    private final String productName;
    private double price;
    private int quantity;

    public NonPerishableProduct(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public Double calculateDiscount() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
            return this.price = this.price - (this.price * 0.25);
        }else if(calendar.get(Calendar.MONTH) == Calendar.DECEMBER) {
            return this.price = this.price - (this.price * 0.20);
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
        System.out.println("Product Details : \n" +
                "\nProduct Name='" + this.productName +
                "\nPrice=" + this.price +
                "\nQuantity=" + this.quantity
                );
    }
}
