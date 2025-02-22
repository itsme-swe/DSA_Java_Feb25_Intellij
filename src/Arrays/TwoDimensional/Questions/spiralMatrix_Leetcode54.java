/*
Given an m x n matrix, return all elements of the matrix in spiral order.

Leetcode - https://leetcode.com/problems/spiral-matrix/description/
*/
package Arrays.TwoDimensional.Questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class spiralMatrix_Leetcode54 {

    public static void main(String[] args) {

        int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };

        System.out.println("Matrix before spiral:");
        print(arr);

        System.out.println();

        List<Integer> spiralMatrix =  spiralOrder(arr);

        Iterator<Integer> it = spiralMatrix.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();




    }
    public static void print(int[][] a) {

        int m = a.length;
        int n = a[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        /* Define boundaries for the spiral traversal:
         minRow: Top boundary of the current spiral layer.
         maxRow: Bottom boundary of the current spiral layer.
         minCol: Left boundary of the current spiral layer.
         maxCol: Right boundary of the current spiral layer.
         */
        int minRow = 0, maxRow = m-1;
        int minCol = 0, maxCol = n-1;

        // List to store the elements in spiral order.
        List<Integer> ans = new ArrayList<>();

        while (minRow <= maxRow && minCol <= maxCol) {

            // Traverse from left to right along the top row (minRow)
            for (int j = minCol; j <= maxCol; j++) {
                ans.add(matrix[minRow][j]);
            }
            minRow++;

            // Check if any boundary condition is violated after updating minRow.
            if (minRow > maxRow || minCol > maxCol) break;
            // Traverse from top to bottom along the rightmost column (maxCol).
            for (int i = minRow; i <= maxRow ; i++) {
                ans.add(matrix[i][maxCol]);
            }
            maxCol--;

            if (minRow > maxRow || minCol > maxCol) break;
            // Traverse from right to left along the bottom row (maxRow).
            for (int j = maxCol; j >= minCol ; j--) {
                ans.add(matrix[maxRow][j]);
            }
            maxRow--;

            if (minRow > maxRow || minCol > maxCol) break;
            // Traverse from bottom to top along the leftmost column (minCol).
            for (int i = maxRow; i >= minRow ; i--) {
                ans.add(matrix[i][minCol]);
            }
            minCol++;
        }
        return ans;
    }

}

// 1 2 3 4 8 12 11 10 9 5 6 7
