package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class retrieveAllKeys {

    public static void main(String[] args) {

        Map<String,String> mp = new HashMap<>();

        mp.put("IN", "India");
        mp.put("PK", "Pakistan");
        mp.put("US", "America");
        mp.put("UK", "United Kingdom");
        mp.put("EU", "Europe");
        mp.put("UAE", "Dubai");

        System.out.println(mp.keySet());  // [EU, IN, UK, UAE, PK, US] -- method returns the collection of keys

        System.out.println(mp.values());  // [Europe, India, United Kingdom, Dubai, Pakistan, America] -- returns the value

        System.out.println(mp.entrySet());  // [EU=Europe, IN=India, UK=United Kingdom, UAE=Dubai, PK=Pakistan, US=America]


    }
}
