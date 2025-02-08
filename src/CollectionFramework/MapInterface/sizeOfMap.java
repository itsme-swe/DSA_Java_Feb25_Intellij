package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class sizeOfMap {

    public static void main(String[] args) {

        Map<String,String> mp = new HashMap<>();

        mp.put("IN", "India");  // method used to add an element inside map
        mp.put("PK", "Pakistan");
        mp.put("US", "America");
        mp.put("UK", "United Kingdom");
        mp.put("EU", "Europe");
        mp.put("UAE", "Dubai");

        System.out.println(mp.size());  // 6 -- returns the elements present in a map

        mp.clear(); // method clears the map

        System.out.println(mp.size());  // 0

    }
}
