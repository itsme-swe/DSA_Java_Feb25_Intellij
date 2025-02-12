package Arrays.OneDimensional.Questions;

public class sort0sAnd1s_usingTwoPointerApproach {

    public static void main(String[] args) {

        int[] arr = {0,1,0,0,1,1,0,1};

        sortNumbers(arr);

        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();


    }

    public static void sortNumbers(int[] nums) {

        int n = nums.length;

        int i = 0;
        int j = n-1;

        while (i < j) {
            if (nums[i] == 0) {
                i++;
            } else if (nums[j] == 1) {
                j--;
            } else if (nums[i] == 1 && nums[j] == 0) {
                nums[i] = 0;
                nums[j] = 1;
                i++;
                j--;
            }
        }
    }
}

// 0 0 0 0 1 1 1 1
