package lv.lesson7;

import java.util.Random;

public class CardDeck {

    private static final String[] SUIT_ARR = {"s", "h", "d", "c"};
    private static final String[] VALUE_ARR = {"2", "3", "4", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private final String[] deck = new String[SUIT_ARR.length * VALUE_ARR.length];


    CardDeck() {

        populateDeck();
    }

    void populateDeck() {
        int counter = 0;
        for(String suit : SUIT_ARR) {
            for (String value : VALUE_ARR) {
                deck[counter++] = suit + value;
            }
        }

    }

    void shuffle(){
        Random randomGenerator = new Random();
        int shuffleCount = 1000;

        while (shuffleCount > 0) {
            int index1 = generateNumber(randomGenerator);
            int index2 = generateNumber(randomGenerator);


        }

    }

    void print(){

        for(int i=0; i<deck.length; i++) {
            if (isNextSuit(i))
            System.out.println(" " + deck[i] + " ");
        }
    }
    private boolean isNextSuit(int i) {
        return i % (VALUE_ARR.length) == 0;
    }

  private  int generateNumber(Random randomGenerator) {
        return randomGenerator.ints(0, deck.length-1).findFirst().getAsInt();
  }

   // public static void main(String[] args) {

     //   print();

    //}
}
