package lv.homework11;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    List<Product> shoppingList = new ArrayList<>();

    public List<Product> addProduct(String productName, double price, String category){

        shoppingList.add(new Product(productName, price, category));

        return shoppingList;
    }


   /* public static List<Product> createProduct(){

        List<Product> shoppingList = new ArrayList<>();

        shoppingList.add(new Product("Milk", 1.20, "food"));

        return shoppingList;
    }*/


}
