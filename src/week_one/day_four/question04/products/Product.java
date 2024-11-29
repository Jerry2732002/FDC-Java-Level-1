package src.week_one.day_four.question04.products;

import src.week_one.day_four.question04.Inventory;

public interface Product {

    Double calculateDiscount();
    String getName();
    void updateQuatity(int change);
    void printDetails();

}
