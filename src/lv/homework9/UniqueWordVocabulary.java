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






