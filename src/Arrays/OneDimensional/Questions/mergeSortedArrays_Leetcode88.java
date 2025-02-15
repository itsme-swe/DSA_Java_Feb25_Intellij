/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Leetcode - https://leetcode.com/problems/merge-sorted-array/description/

*/

package Arrays.OneDimensional.Questions;

public class mergeSortedArrays_Leetcode88 {

    public static void main(String[] args) {

        int[] num1 = {1,2,3,0,0,0}; // num1 has extra space to accommodate num2 elements

        int[] num2 = {2,5,6};

        merge(num1,3,num2, 3);

        for(int ele : num1) {
            System.out.print(ele + " ");
        }
        System.out.println();

    }

    public static void merge(int[] a, int m, int[] b, int n) {

        int i = m-1;    // Here m is for length of array a
        int j = n-1;    // j is a length of an array b
        int k = m+n-1;

        // Merge in reverse order (filling 'a' from the end to avoid overwriting elements)
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                a[k] = a[i];
                i--;
            } else {
                a[k] = b[j];
                j--;
            }
            k--;
        }

        // If any elements of 'b' are left, copy them to 'a'
        // This happens when 'b' has smaller elements that should be placed at the start
        if (j >= 0) {
            a[k] = b[j];
            j--;
            k--;
        }

    }

}

// 1 2 2 3 5 6