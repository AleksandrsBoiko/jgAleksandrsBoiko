package lv.homework9;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class UniqueWordVocabulary {

    Set<String>vocabulary = new HashSet<>();

        private static void printToConsole(Set<String>vocabulary) {
        System.out.println(vocabulary);
    }

    private static void addWord(Set<String> vocabulary) {
        Scanner wordScanner = new Scanner(System.in);
        String words = wordScanner.nextLine();
        if (words.equals("")) {
            System.out.println("can't be empty");
        } else {
            vocabulary.add(words);
        }

    }



}
