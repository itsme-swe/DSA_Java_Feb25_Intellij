package Arrays.TwoDimensional.Questions;

public class transformToTranspose_Method2 {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int m = arr.length;

        for (int i = 0; i < m; i++) {
            for (int j = i+1; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int[] row : arr) {
            for(int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

/*
🔸 More optimized
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16

*/
