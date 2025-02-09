package BasicsOfJava.TakingInputFromUser;

import java.util.Scanner;

public class TakingInput {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the user name: ");

      String name = sc.nextLine();

      System.out.print("Enter your roll number: ");

      int rollNo = sc.nextInt();

      System.out.printf("The user name is: %s\n ", name);

      System.out.printf("The rollNo is:%d\n ", rollNo);
    }

  }

}
