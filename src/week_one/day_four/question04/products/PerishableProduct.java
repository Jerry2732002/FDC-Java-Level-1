package src.week_one.day_four.question04.products;

import java.util.Date;

public class PerishableProduct implements Product {
    private String productName;
    private Date expirationDate;
    private double price;

    public PerishableProduct(String productName, Date expirationDate, double price) {
        this.productName = productName;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    @Override
    public String getName() {
        return this.productName;
    }
}
