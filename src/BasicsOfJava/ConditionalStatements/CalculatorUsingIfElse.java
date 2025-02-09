package BasicsOfJava.ConditionalStatements;

import java.util.Scanner;

public class CalculatorUsingIfElse {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      double a = sc.nextDouble();

      int op = sc.next().charAt(0);

      double b = sc.nextDouble();

      if (op == '+')
        System.out.println(a + b);
      else if (op == '-')
        System.out.println(a - b);
      else if (op == '*')
        System.out.println(a * b);
      else if (op == '/')
        System.out.println(a / b);
    }
  }

}
