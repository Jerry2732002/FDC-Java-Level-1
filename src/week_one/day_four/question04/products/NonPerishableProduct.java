package src.week_one.day_four.question04.products;

public class NonPerishableProduct implements Product {
    private String productName;
    private final double price;

    public NonPerishableProduct(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
