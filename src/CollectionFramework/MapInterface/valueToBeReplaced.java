package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class valueToBeReplaced {

    public static void main(String[] args) {

        Map<String,String> mp = new HashMap<>();

        mp.put("IN", "India");
        mp.put("PK", "Pakistan");
        mp.put("US", "America");
        mp.put("UK", "United Kingdom");
        mp.put("EU", "Europe");
        mp.put("UAE", "Dubai");

        mp.replace("UAE", "Doha");  // method used to replace value present at a passed key

        System.out.println(mp); // {EU=Europe, IN=India, UK=United Kingdom, UAE=Doha, PK=Pakistan, US=America}

    }
}
