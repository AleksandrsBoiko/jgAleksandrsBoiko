package lesson10.checked;

import java.io.IOException;

public class CheckedExeptionDemo {
    public static void main(String[] args) {

        try{
        String text = getText();
            System.out.println("Text: " + text );
        
    } catch (IOException ex) {
            System.out.println("Failed to get text!");
        }

    private static String getText() throws IOException {
        throw new IOException("Bad luck");
    }
}


