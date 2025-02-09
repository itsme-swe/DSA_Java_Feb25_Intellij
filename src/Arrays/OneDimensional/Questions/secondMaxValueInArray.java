package Arrays.OneDimensional.Questions;

public class secondMaxValueInArray {

    public static void main(String[] args) {

        int[] arr = {5 , 8, 9, 2, 1};

        int maxValue = secondMaxElement(arr);

        System.out.println("The second max element is " + maxValue);


    }

    public static int secondMaxElement(int[] nums) {

        int n = nums.length;

        int fstMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            fstMax = Math.max(fstMax,nums[i]);
        }

        int scndMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (nums[i] > scndMax && nums[i] != fstMax) {
                scndMax = nums[i];
            }
        }

        return scndMax;
    }
}

// The second max element is 8



