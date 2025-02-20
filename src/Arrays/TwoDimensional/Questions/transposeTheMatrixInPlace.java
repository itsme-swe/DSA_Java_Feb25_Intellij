package Arrays.TwoDimensional.Questions;

public class transposeTheMatrixInPlace {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {

            for (int j = i+1; j < n; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int[] row : arr) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }

}

/*

🔸 Transposing matrix without using extra space

1 4 7
2 5 8
3 6 9

*/
