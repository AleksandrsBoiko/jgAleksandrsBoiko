package lv.homework4;

public class PhraseAnalyser {

    public String analyse(String phrase) {


        if ( phrase.charAt(0) == 'M'
                && phrase.charAt(1) == 'a'
                && phrase.charAt(2) == 'k'
                && phrase.charAt(3) == 'e'
                && phrase.charAt(phrase.length() - 11) == 'g'
                && phrase.charAt(phrase.length() - 10) == 'r'
                && phrase.charAt(phrase.length() - 9) == 'e'
                && phrase.charAt(phrase.length() - 8) == 'a'
                && phrase.charAt(phrase.length() - 7) == 't'
                && phrase.charAt(phrase.length() - 6) == ' '
                && phrase.charAt(phrase.length() - 5) == 'a'
                && phrase.charAt(phrase.length() - 4) == 'g'
                && phrase.charAt(phrase.length() - 3) == 'a'
                && phrase.charAt(phrase.length() - 2) == 'i'
                && phrase.charAt(phrase.length() - 1) == 'n') {

            return "It stands no change..";

        } else if ( (phrase.charAt(0) == 'M'
                && phrase.charAt(1) == 'a'
                && phrase.charAt(2) == 'k'
                && phrase.charAt(3) == 'e')
                || (phrase.charAt(phrase.length() - 11) == 'g'
                && phrase.charAt(phrase.length() - 10) == 'r'
                && phrase.charAt(phrase.length() - 9) == 'e'
                && phrase.charAt(phrase.length() - 8) == 'a'
                && phrase.charAt(phrase.length() - 7) == 't'
                && phrase.charAt(phrase.length() - 6) == ' '
                && phrase.charAt(phrase.length() - 5) == 'a'
                && phrase.charAt(phrase.length() - 4) == 'g'
                && phrase.charAt(phrase.length() - 3) == 'a'
                && phrase.charAt(phrase.length() - 2) == 'i'
                && phrase.charAt(phrase.length() - 1) == 'n')) {
            return "It could be worse";
        }

        return "It is fine, really";


    }

}
