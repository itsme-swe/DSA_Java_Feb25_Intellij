package Arrays.OneDimensional.Questions;

public class maximumValueInArray {

    public static void main(String[] args) {

        int[] arr = {30,70,40,55,5};

        int maxElement = maxValue(arr);

        System.out.println("Max Element is " + maxElement);

    }

    public static int maxValue(int[] nums) {

        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

}

// Max Element is 70