package BasicsOfJava.ConditionalStatements;

public class TernaryOperator {
  public static void main(String[] args) {

    int x = 20;

    int y = (x == 1) ? 70 : 80;

    System.out.println("The value of y: " + y); // The value of y: 80

    boolean z = (x == 20) ? true : false;

    System.out.println("Upper statement is " + z);

  }

}
