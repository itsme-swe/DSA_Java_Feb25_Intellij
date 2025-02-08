package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class toAddElementMethod {

    public static void main(String[] args) {

        Map<String,String> mp = new HashMap<>();

        mp.put("IN", "India");  // method used to add an element inside map
        mp.put("PK", "Pakistan");
        mp.put("US", "America");
        mp.put("UK", "United Kingdom");
        mp.put("EU", "Europe");
        mp.put("UAE", "Dubai");

        System.out.println(mp);

        System.out.println(mp.remove("EU"));    // Europe -- method used to remove an element from a map

    }
}

// {EU=Europe, IN=India, UK=United Kingdom, UAE=Dubai, PK=Pakistan, US=America}
