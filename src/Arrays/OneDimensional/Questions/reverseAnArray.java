package Arrays.OneDimensional.Questions;

import java.util.Collections;

public class reverseAnArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40 ,50};

        int n = arr.length;

        System.out.print("Before reversed: " );

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        System.out.print("After reversed: ");

        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
