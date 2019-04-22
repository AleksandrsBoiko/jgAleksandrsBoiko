package lv.homework4;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();

        test.shouldDetectViolet();
        test.shouldDetectBlue();
        test.shouldDetectGreen();
        test.shouldDetectYellow();
        test.shouldDetectOrange();
        test.shouldDetectRed();

    }

    public void shouldDetectViolet(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(395);
        compareResult(result.equals("Violētā"), "shouldDetectViolet");
    }

    public void shouldDetectBlue(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(481);
        compareResult(result.equals("Zilā"), "shouldDetectBlue");
    }

    public void shouldDetectGreen(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(504);
        compareResult(result.equals("Zaļā"), "shouldDetectGreen");
    }

    public void shouldDetectYellow(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(589);
        compareResult(result.equals("Dzeltenā"), "shouldDetectYellow");
    }

    public void shouldDetectOrange(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(603);
        compareResult(result.equals("Oranža"), "shouldDetectOrange");
    }

    public void shouldDetectRed(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(629);
        compareResult(result.equals("Sarkanā"), "shouldDetectRed");
    }

    void compareResult(boolean result, String testName){

        if (result) {
            System.out.println(testName + "OK");
        }
        else {
            System.out.println(testName + "False");
        }
    }


}
