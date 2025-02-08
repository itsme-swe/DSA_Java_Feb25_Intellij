package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class itreateMapUsingLambdaExpression {

    public static void main(String[] args) {

        Map<Integer,String> mp = new HashMap<>();

        mp.put(101, "Harsh");
        mp.put(102, "Shorya");
        mp.put(104, "Sahil");
        mp.put(106, "Mukul");

        // This for Each method using lambda expression was introduced in Java 8
        mp.forEach((key,value) -> System.out.println("RollNo: " + key + ", StudentName: " + value));
    }
}

/*
RollNo: 101, StudentName: Harsh
RollNo: 102, StudentName: Shorya
RollNo: 104, StudentName: Sahil
RollNo: 106, StudentName: Mukul

* */
