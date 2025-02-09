package BasicsOfJava.Looping.ForLoop;

import java.util.Scanner;

public class usecaseOfBreakKeyword {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the value of n: ");

      int n = sc.nextInt();

      for (int i = 2; i < n - 1; i++) {

        if (n % i == 0) {
          System.out.println("Composite number");
          break;
        }

      }
    }
  }

}
