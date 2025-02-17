package Arrays.OneDimensional.Questions;

public class nextGreatestElement {

    public static void main(String[] args) {

        int[] arr = {12, 8, 69, 40, 28, 21};

        greatestElements(arr);

    }

    public static void greatestElements(int[] a) {

        int n = a.length;

        int[] ans = new int[n];

        ans[n-1] = -1;

        int nge = a[n-1];

        for (int i = n-2; i >= 0 ; i--) {

            ans[i] = nge;
            nge = Math.max(nge,a[i]);
        }

        for(int x : ans) {
            System.out.print(x + " ");
        }

    }
}

/*
Explanation how code works?

1️⃣ Start from the end of the array: The last element has no numbers to its right, so we set its result to -1.
2️⃣ Move backward through the array
3️⃣ Store this nge value as the result for the current element.
4️⃣ Update nge to be the larger of the current nge and the current element.

o/p: 69 69 40 28 21 -1

*/


