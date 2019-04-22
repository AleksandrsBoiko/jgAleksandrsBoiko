package lv.homework4.lesson4;

public class Switch {

    public static void main(String[] args) {
        System.out.println(translateHttpCode(200));
        System.out.println(translateHttpCode(400));
        System.out.println(translateHttpCode(500));
        System.out.println(translateHttpCode(800));
    }

    private static String translateHttpCode(int code) {
        String message = null;

        switch (code) {
            case 200:
                message = "Ok";
                break;
            case 400:
                message = "Bad request";
                break;
            case 500:
                System.out.println("Server error 500");
            case 501:
                message = "Server error";
                break;
            default:
                message = "Unknown error";
        }
        return message;
    }


}
