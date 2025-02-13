/*

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Leetcode - https://leetcode.com/problems/sort-colors/description/

*/

package Arrays.OneDimensional.Questions;

public class sortColorsUsingDutchAlgo_Leetcode_75 {

    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};

        sortColors(arr);

        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();


    }

    public static void sortColors(int[] nums) {

        int n = nums.length;

        int low = 0;
        int mid = 0;
        int high = n-1;

        while (mid < high) {

            if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums,high,mid);
                high--;
            }
        }

    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

// 0 0 1 1 2 2
