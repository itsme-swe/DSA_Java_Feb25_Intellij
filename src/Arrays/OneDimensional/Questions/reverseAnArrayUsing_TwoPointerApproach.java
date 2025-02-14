package Arrays.OneDimensional.Questions;

public class reverseAnArrayUsing_TwoPointerApproach {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //🔸 Two Pointer Approach

        int n = arr.length;

        int st = 0;
        int ed = n-1;

        while (st < ed) {
            swap(arr,st,ed);
            st++;
            ed--;
        }

        System.out.print("After: ");
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();


    }

    public static void swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}

/*

Before reversed: 10 20 30 40 50
After reversed: 50 40 30 20 10

*/
