package Arrays.TwoDimensional.Questions;

public class sumOf2DArray {

    public static void main(String[] args) {

        int[][] arr = { {1,2,3}, {4,5,6}, {9,8,7} };

        int sum = sumOfElements(arr);

        System.out.println("The sum of elements is " + sum);


    }

    public static int sumOfElements(int[][] nums) {

        int m = nums.length;
        int n = nums[0].length;

        int sum = 0;

        for(int[] row : nums) {
            for(int ele : row) {
                sum += ele;
            }
        }

        return sum;
    }
}
