package lesson9;

import java.util.HashMap;
import java.util.Map;

public class PlayWithHashMap {
    public static void main(String[] args) {

        Map<String, String> contacts = new HashMap<>();
        contacts.put("Bob", "55-4433-321");
        contacts.put("Suzie", "55-4321-321");
        contacts.put("Jane", "55-4466-321");
        contacts.put("Kevin", "55-4433-321");

        System.out.println(contacts);
        System.out.println(contacts.entrySet());

        for(Map.Entry<String, String> entry: contacts.entrySet()) {
            System.out.println(entry.getKey() + " ====== " + entry.getValue());
        }

        System.out.println("Bob's phone number is: " + contacts.get("Bob"));


    }
}
