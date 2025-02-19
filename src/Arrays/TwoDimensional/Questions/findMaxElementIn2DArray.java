package Arrays.TwoDimensional.Questions;

public class findMaxElementIn2DArray {

    public static void main(String[] args) {

        int[][] arr = { {10,5,12}, {25,50,18}, {45,5,1} };

        int maxValue = maxInArray(arr);

        System.out.println("The max value in array is " + maxValue);

    }

    public static int maxInArray(int[][] nums){

        int m = nums.length;
        int n = nums[0].length;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                }
            }
        }

        return max;
    }
}

// The max value in array is 50