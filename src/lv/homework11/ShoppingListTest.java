package lv.homework11;

public class ShoppingListTest {

    public static void main(String[] args) {

        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addProduct("Milk", 1.20, "food");
        shoppingList.addProduct("Beer", 1.39, "food");
        shoppingList.print();



    }
}