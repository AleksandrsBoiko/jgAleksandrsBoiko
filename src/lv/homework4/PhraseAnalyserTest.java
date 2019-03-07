package lv.homework4;

public class PhraseAnalyserTest {

    public static void main(String[] args) {

        PhraseAnalyserTest test = new PhraseAnalyserTest();

        test.shouldAnalyseFullCoincidence();

        test.shouldAnalysePartialCoincidence();

        test.shouldAnalyseNoCoincidence();


    }

    public void shouldAnalyseFullCoincidence() {

        PhraseAnalyser analyser = new PhraseAnalyser();

        String result = analyser.analyse("Make education great again");

        compareResult(result.equals("It stands no change.."), "shouldAnalyseFullCoincidence");
    }

    public void shouldAnalysePartialCoincidence() {

        PhraseAnalyser analyser = new PhraseAnalyser();

        String result = analyser.analyse("Make education worse again");

        compareResult(result.equals("It could be worse"), "shouldAnalysePartialCoincidence");
    }

    public void shouldAnalyseNoCoincidence() {

        PhraseAnalyser analyser = new PhraseAnalyser();

        String result = analyser.analyse("Take education from space");

        compareResult(result.equals("It is fine, really"), "shouldAnalyseNoCoincidence");
    }

    void compareResult(boolean result, String testName) {

        if (result) {
            System.out.println(testName + "OK");
        }

        else {

            System.out.println(testName + "Fail");
        }
            }
}
