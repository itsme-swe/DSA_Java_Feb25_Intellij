package Arrays.OneDimensional.Questions;

public class rotateArray_kStepsUsingExtraSpace {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int k = 3;

        rotate(arr,k);

        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n; // To handle the cases where k > n

        int[] temp = new int[n];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n-k+i];
        }

        for (int i = k; i < n; i++) {
            temp[i] = nums[i-k];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}

// 30 40 50 10 20
