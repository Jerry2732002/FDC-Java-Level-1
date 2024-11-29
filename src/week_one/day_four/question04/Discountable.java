package src.week_one.day_four.question04;

import src.week_one.day_four.question04.products.Product;

public class Discountable {

    public static void applyDiscount(Product product) {
        Double discount = product.calculateDiscount();
        if (discount != null) {
            System.out.println("Price after discount : " + discount);
        } else {
            System.out.println("Item removed from Inventory");
        }
    }
}
