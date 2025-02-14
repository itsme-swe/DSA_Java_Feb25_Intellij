package Arrays.OneDimensional.Questions;

public class mergeTwoSortedArrays_InNewArray {

    public static void main(String[] args) {

        int[] arr = {11, 33, 42};
        int[] brr = {26, 54, 69, 81};

        int[] crr = new int[arr.length + brr.length];

        merge(arr,brr,crr);


        for(int x : crr) {
            System.out.print(x + " ");
        }
        System.out.println();


    }

    public static void merge(int[] a, int[] b, int[] c) {

        int m = a.length;
        int n = b.length;


        int i = 0;
        int j =0;
        int k = 0;

        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;    // common on both if and else statement
        }

        if (i == m) {
            while (j < n) {
                c[k] = b[j];
                j++;
                k++;
            }
        } else if (j == n) {
            while (i < m) {
                c[k] = a[i];
                i++;
                k++;
            }
        }
    }
}

// 11 26 33 42 54 69 81
