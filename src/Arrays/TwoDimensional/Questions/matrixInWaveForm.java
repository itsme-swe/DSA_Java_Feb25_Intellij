package Arrays.TwoDimensional.Questions;

public class matrixInWaveForm {

    public static void main(String[] args) {

        int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };

        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            else {
                for (int j = n-1; j >= 0 ; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}

/*

1 2 3 4
8 7 6 5
9 10 11 12
16 15 14 13

🔸 Approach:
1. Our outer loop is running for rows, and inside the outer loop there is a condition if our I become odd then we'll move from right to left.

*/
