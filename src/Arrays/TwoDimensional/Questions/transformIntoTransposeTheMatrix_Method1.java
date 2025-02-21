package Arrays.TwoDimensional.Questions;

public class transformIntoTransposeTheMatrix_Method1 {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int m = arr.length;

        printArray(arr);

        for (int i = 0; i < m; i++) {

            for (int j = 0; j <= i; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        printArray(arr);

    }

    public static void printArray(int[][] a) {

        int m = a.length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

/*
🔸 Less Optimized
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16

*/
