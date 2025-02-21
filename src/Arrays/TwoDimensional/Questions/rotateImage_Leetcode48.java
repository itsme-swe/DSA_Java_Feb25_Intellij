/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Leetcode - https://leetcode.com/problems/rotate-image/description/
*/

package Arrays.TwoDimensional.Questions;

public class rotateImage_Leetcode48 {

    public static void main(String[] args) {

        int[][] arr = { {5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16} };

        transposeMatrix(arr);

        rotateMatrix(arr);

        printMatrix(arr);



    }

    public static void transposeMatrix(int[][] matrix) {

        int m = matrix.length;

        for (int i = 0; i < m; i++) {

            for (int j = i+1; j < m; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
    }

    public static void rotateMatrix(int[][] brr) {

        int m = brr.length;

        for (int i = 0; i < m; i++) {

            int low = 0;
            int high = m-1;

            while (low < high) {
                int temp = brr[i][low];
                brr[i][low] = brr[i][high];
                brr[i][high] = temp;

                low++;
                high--;
            }
        }
    }

    public static void printMatrix(int[][] arr) {

        for(int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

/*

15 13 2 5
14 3 4 1
12 6 8 9
16 7 10 11

🔸 Approach:
1. First, we'll transpose the matrix.
2. And then we'll reverse each row of the matrix.

*/
