/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

LeetCode - https://leetcode.com/problems/two-sum/
*
*/

package Arrays.OneDimensional.Questions;

public class twoSum_LeetcodeQues1 {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};

        int target = 18;

        int[] indexes = twoSum(arr,target);

        for(int x : indexes) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Op: {1,2}

    }

    public static int[] twoSum(int[] nums, int t) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == t) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

}
