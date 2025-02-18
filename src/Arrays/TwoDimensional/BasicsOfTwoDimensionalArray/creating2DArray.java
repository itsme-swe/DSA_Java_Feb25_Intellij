package Arrays.TwoDimensional.BasicsOfTwoDimensionalArray;

public class creating2DArray {

    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        // Printing 2D array
        for(int[] row : arr) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

/*

0 0 0
0 0 0
0 0 0

*/
