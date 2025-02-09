package BasicsOfJava.BasicQuestions;

import java.util.Scanner;

public class CountDigits {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the value of n: ");

      int n = sc.nextInt();

      int x = Math.abs(n); // Convert -ve value into +ve

      int count = 0;

      while (x != 0) {
        x /= 10;
        count++;
      }

      // Edge case: If n is 0, count should be 1
      if (n == 0)
        count = 1;

      System.out.println(count);
    }
  }

}
