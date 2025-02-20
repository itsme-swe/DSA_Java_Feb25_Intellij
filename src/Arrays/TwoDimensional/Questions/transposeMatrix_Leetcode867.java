/*

Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Leetcode - https://leetcode.com/problems/transpose-matrix/description/

*/

package Arrays.TwoDimensional.Questions;

public class transposeMatrix_Leetcode867 {

    public static void main(String[] args) {

        int[][] arr = { {1,2,3}, {5,6,7}, {10,11,12} };

        int[][] result = transposeMatrix(arr);

        for(int[] row : result) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }

    public static int[][] transposeMatrix(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] transpose = new int[n][m];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                transpose[j][i] = matrix[i][j];
            }
            System.out.println();
        }

        return transpose;
    }
}

/*

1 5 10
2 6 11
3 7 12

*/
