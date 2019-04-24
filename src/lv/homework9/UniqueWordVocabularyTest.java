
package lv.homework9;

public class UniqueWordVocabularyTest {
    public static void main(String[] args) {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWord("tree");
        uniqueWordVocabulary.addWord("car");
        uniqueWordVocabulary.addWord("house");
        uniqueWordVocabulary.addWord("");
        uniqueWordVocabulary.printToConsole();
        uniqueWordVocabulary.getUniqueWords();


    }
}

