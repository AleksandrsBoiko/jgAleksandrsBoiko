package lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PlayWithLinkedList {

    public static void main(String[] args) {

        List<String> cryptoCurrencies = new LinkedList<>();
        cryptoCurrencies.add("LightCoin");
        cryptoCurrencies.add("Wase");
        cryptoCurrencies.add("BitCoin");
        cryptoCurrencies.add("Etherium");
        cryptoCurrencies.add("78");

        System.out.println(cryptoCurrencies);

        Collections.sort(cryptoCurrencies);
        System.out.println(cryptoCurrencies);
    }
}
