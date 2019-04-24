package lv.homework9;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class UniqueWordVocabulary {
    public static void main(String[] args) {


        Set<String> vocabulary = new HashSet<>();

        vocabulary.add("tree");
        vocabulary.add("house");
        vocabulary.add("{car");

        System.out.println(vocabulary);

       /* public static void addWord (Set < String > vocabulary) {
            Scanner wordScanner = new Scanner(System.in);
            String words = wordScanner.nextLine();
            if (words.equals("")) {
                System.out.println("can't be empty");
            } else {
                vocabulary.add(words);
            }

        }

        public static void printToConsole (Set < String > vocabulary) {
            System.out.println(vocabulary);
        }*/


    }

}
