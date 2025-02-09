package Arrays.OneDimensional.BasicsOfArrays;

public class creatingArray {

    public static void main(String[] args) {

        int[] arr = new int[5];    // This is known as declaration of an array

        // This is known as initialization of an array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 40;
        arr[3] = 5;
        arr[4] = 2;

        System.out.println();

        int[] arr1 = {1,2,3,4,5};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}
