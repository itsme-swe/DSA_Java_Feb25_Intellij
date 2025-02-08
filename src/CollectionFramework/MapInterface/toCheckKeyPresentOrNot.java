package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class toCheckKeyPresentOrNot {

    public static void main(String[] args) {

        Map<String,String> details = new HashMap<>();

        details.put("Honda", "Amaze");
        details.put("Mahindra", "Roxx");
        details.put("Volkswagen", "Virtus");
        details.put("Skoda", "Slavia");
        details.put("Toyota", "Camry");

        System.out.println(details);

        System.out.println(details.containsKey("Mahindra")); // true -- method return boolean value true if key present

        System.out.println(details.containsKey("BMW")); // And, false if key not present

        System.out.println(details.containsValue("Virtus GT")); // false -- bcoz method return value true or false if value is present
    }
}
