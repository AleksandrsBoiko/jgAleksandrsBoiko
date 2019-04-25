package lv.homework11;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    List<Product> shoppingList = new ArrayList<>();

    public List<Product> addProduct(String productName, double price, String category) {

        shoppingList.add(new Product(productName, price, category));

        return shoppingList;

    }

    public void print() {
        System.out.println("=====================");
        shoppingList.forEach(item -> System.out.println(item));
        System.out.println("======================");
    }

    public List<Product> removeProduct(String productName) {

        for (int i = 0; i < shoppingList.size(); i++) {

            shoppingList.remove(productName);
        }


        return shoppingList;

    }

    public void findByCategory(String searchCategory) {


    }


    /*public void removeFromShoppingList(String deletedProductName){

        List<Product> toRemove = new ArrayList<Product>();
        for(Object a: shoppingList){
            if(a.productName().equalsIgnoreCase("AAA")){
                toRemove.add(a);
            }
        }*/
    //shoppingList.removeAll(toRemove);

        /* List<Product> objs;
        Iterator<Object> i = objs.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            //some condition
            i.remove();
        }*/


    //shoppingList.removeIf( name -> name.equals("Milk"));


}
