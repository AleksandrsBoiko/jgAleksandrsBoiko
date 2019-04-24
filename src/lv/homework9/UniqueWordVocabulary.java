package lv.homework9;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    private Set<String> vocabulary = new HashSet<>();

    public void addWord(String word) {

        if (word.isEmpty()) {
            System.out.println("Can't be empty");
        } else {
            vocabulary.add(word);
        }
    }
        public void printToConsole () {
            for (String listOfWords : vocabulary) {
                System.out.println(listOfWords);
            }
        }
        public void getUniqueWords () {
            System.out.println("Vocabulary word count: " + vocabulary.size());
        }


}








/* public class UniqueWordVocabulary {
    public static void main(String[] args) {


        Set<String> vocabulary = new HashSet<>();

        vocabulary.add("tree");
        vocabulary.add("house");
        vocabulary.add("{car");

        System.out.println(vocabulary);

        public static void addWord (Set < String > vocabulary) {
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



