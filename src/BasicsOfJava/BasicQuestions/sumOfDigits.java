package BasicsOfJava.BasicQuestions;

public class sumOfDigits {

  public static void main(String[] args) {

    int n = 52025;

    int sum = 0;

    while (n != 0) {
      int lstDigit = n % 10;
      sum += lstDigit;
      n /= 10;
    }

    System.out.println(sum);
  }

}
