package lv.homework11;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private static List<Product> createProduct(){

        List<Product> shoppingList = new ArrayList<>();

        shoppingList.add(new Product("Milk", 1.20, "food"));

        return shoppingList;
    }


}
