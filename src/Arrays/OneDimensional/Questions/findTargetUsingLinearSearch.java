package Arrays.OneDimensional.Questions;

public class findTargetUsingLinearSearch {

    public static void main(String[] args) {

        int[] arr = {5, 1, 10, 12, 8, 7};

        int target = -1;

        findTarget(arr,target);

        // Target doesn't in array
    }

    public static void findTarget(int[] arr, int t) {

        int n = arr.length;

        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if(arr[i] == t) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Target found");
        }
        else {
            System.out.println("Target doesn't in array");
        }

    }

}

