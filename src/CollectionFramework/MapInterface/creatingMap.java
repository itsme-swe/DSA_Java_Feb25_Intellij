package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class creatingMap {

    public static void main(String[] args) {

        Map<Integer, String> mp = new HashMap<>();

        mp.put(101,"Harsh");
        mp.put(103,"Mukul");
        mp.put(104,"John");
        mp.put(105,"Mohan");

        System.out.println(mp); // {101=Harsh, 103=Mukul, 104=John, 105=Mohan}
    }
}
