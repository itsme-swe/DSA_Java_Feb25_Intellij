package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class traversingOverMap {

    public static void main(String[] args) {

        Map<String,String> mp = new HashMap<>();

        mp.put("IN", "India");
        mp.put("PK", "Pakistan");
        mp.put("US", "America");
        mp.put("UK", "United Kingdom");
        mp.put("EU", "Europe");
        mp.put("UAE", "Dubai");

        // Iterating over a map -- Method 1
        for (Map.Entry<String,String> x : mp.entrySet()) {
            System.out.println("Key: " + x.getKey() + ", Value: " + x.getValue());
        }

        System.out.println();

        // Iterating over a map using Java 8 feature lambda expression -- Method 2

        mp.forEach((key,value) -> System.out.println("Keys: " + key + ", Values: " + value));
    }
}
