package Arrays.OneDimensional.BasicsOfArrays;

import java.util.Scanner;

public class takingFromUserInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");

        int n = sc.nextInt();

        System.out.print("Enter the elements inside an array:");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("The elements inside an array are: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
