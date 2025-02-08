package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class toGetTheValue {

    public static void main(String[] args) {

        Map<Float,String> car = new HashMap<>();

        car.put(1.5F, "Virtus GT");
        car.put(1.0F, "Tata Curv");
        car.put(1.2F, "Slavia");
        car.put(2.5F, "Camry");

        System.out.println(car);

        System.out.println(car.get(2.5F));  // return the value present at a key

        System.out.println(car.getOrDefault(3.5F,"None"));  // None -- method return none if key is not present
    }
}
