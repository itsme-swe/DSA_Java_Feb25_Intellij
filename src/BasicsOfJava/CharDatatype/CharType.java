package BasicsOfJava.CharDatatype;

import java.util.Scanner;

public class CharType {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the single character: ");

      char ch = sc.next().charAt(0); // Taking input of character

      int x = (char) ch; // typecasting character into integer

      System.out.println(x);

    }
  }

}
