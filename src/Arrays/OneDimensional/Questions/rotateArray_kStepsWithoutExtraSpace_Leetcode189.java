/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Leetcode - https://leetcode.com/problems/rotate-array/description/
*/

package Arrays.OneDimensional.Questions;

public class rotateArray_kStepsWithoutExtraSpace_Leetcode189 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        int k = 3;

        rotate(arr,k);

        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        reverse(nums,0,n-k-1);
        reverse(nums, n-k,n-1);
        reverse(nums,0,n-1);
    }

    public static void reverse(int[] a,int i,int j) {

        int n = a.length;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

    }


}

// 5 6 7 1 2 3 4
