package Arrays.TwoDimensional.Questions;

public class addTwoMatricesWithoutExtraSpace {

    public static void main(String[] args) {

        int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] brr = { {2,4,6}, {1,3,5}, {7,8,10} };

        addMatrices(arr,brr);


    }

    public static void addMatrices(int[][] a, int[][] b) {

        int m = a.length;
        int n = b.length;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                a[i][j] += b[i][j];
            }
        }

        for(int[] row : a) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

/*

3 6 9
5 8 11
14 16 19

*/
