package BasicsOfJava.MethodsInJava;

public class passByReferenceDemo {

    public static void main(String[] args) {

        int[] arr = {2,4,8,10};

        updateValue(arr);

        System.out.println(arr[0]);

        for(int ele : arr) {
            System.out.print(ele + " " ) ;
        }
        System.out.println();


    }
    // Passing object to the function, so here the address of the original value has been passed
    static void updateValue(int[] a) {
        a[0] = 6 ;
    }
}
