package PatternPrinting.SquarePatterns;

import java.util.Scanner;

public class alphabetSquare_Pattern3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n ");

        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print((char)(j+64) + " ");   // Typecasting
            }
            System.out.println();
        }
    }
}
