package BasicsOfJava.TypeCasting;

import java.util.Scanner;

public class ConversionOfDatatype {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the value: ");

      int x = sc.nextInt(); // Taking input in integer 

      double y = (double) x;  // Then, typecasting int into double data type

      System.out.println(y / 2);
    }
  }

}
