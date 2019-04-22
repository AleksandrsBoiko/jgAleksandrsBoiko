package lv.lesson10;

public class unchecked {

    public static void main(String[] args) {

        String text = getText();
        System.out.println(text.toUpperCase());
    }

    private static String getText() {
        throw new IllegalStateException("Something went wrong");
    }
}
