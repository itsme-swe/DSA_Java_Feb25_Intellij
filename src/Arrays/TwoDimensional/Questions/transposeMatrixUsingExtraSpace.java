package Arrays.TwoDimensional.Questions;

public class transposeMatrixUsingExtraSpace {

    public static void main(String[] args) {

        int[][] arr = { {1,2,3}, {5,6,7}, {10,11,12} };

        int m = arr.length;
        int n = arr[0].length;

        // Inserting element columns at rows and rows at columns
        int[][] transpose = new int[n][m];

        System.out.println("Before transpose: ");
        for(int[] row : arr) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("After transpose: ");
        for(int[] row : transpose) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
