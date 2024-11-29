package src.week_one.day_four.question04;

import src.week_one.day_four.question04.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static List<Product> products = new ArrayList<>();

    public void addToInventory(Product product) {
        products.add(product);
    }

    public void addToInventory(List<Product> product) {
        products.addAll(product);
    }

    public static void removeFromInventory(String productName) {
        Product product = findProductByName(productName);
        if(product != null) {
            products.remove(product);
        }
        else {
            System.out.println("OUT OF STOCK, Cannot Remove");
        }
    }

    public static Product findProductByName(String name){
        for (Product product : products){
            if (product.getName().equalsIgnoreCase(name)) {
             return product;
            }
        }
        return null;
    }

    public List<Product> listAllProducts(){
        return this.products;
    }

    public void printDetailsOfAllProducts() {
        for (Product product : products) {
                product.printDetails();
        }
    }

}
