package lv.homework11;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    List<Product> shoppingList = new ArrayList<>();

    public List<Product> addProduct(String productName, double price, String category){

        shoppingList.add(new Product(productName, price, category));

        return shoppingList;

    }

    public void print() {
        System.out.println("=====================");
        shoppingList.forEach( item->System.out.println(item) );
        System.out.println("======================");
    }


}
