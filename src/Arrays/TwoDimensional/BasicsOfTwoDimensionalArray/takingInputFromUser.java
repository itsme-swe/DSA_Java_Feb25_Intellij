package Arrays.TwoDimensional.BasicsOfTwoDimensionalArray;

import java.util.Scanner;

public class takingInputFromUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of row: ");

        int m = sc.nextInt();

        System.out.print("Enter the size of columns: ");

        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter the elements of an array: ");

        // Traversing loop to take an input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
