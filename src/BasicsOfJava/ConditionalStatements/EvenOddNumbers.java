package BasicsOfJava.ConditionalStatements;

import java.util.Scanner;

public class EvenOddNumbers {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the value of n: ");

      int n = sc.nextInt();

      if (n % 2 == 0) {
        System.out.print("Even Number");
      } else {
        System.out.println("Odd Number");
      }
    }
  }

}
