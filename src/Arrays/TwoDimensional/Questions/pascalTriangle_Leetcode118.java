/*

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it, as shown:

       1
      1  1
     1  2  1
    1  3  3  1
   1  4  6  4  1

Leetcode - https://leetcode.com/problems/pascals-triangle/description/

*/

package Arrays.TwoDimensional.Questions;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle_Leetcode118 {

    public static void main(String[] args) {

        int n = 5;

        List<List<Integer>> pascal = generate(n);

        System.out.println(pascal);


    }

    public static List<List<Integer>> generate(int n) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            List<Integer> l = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) l.add(1);
                else {
                    l.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
                }
            }
            ans.add(l);
        }

        return ans;
    }
}

// [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]