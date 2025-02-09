package BasicsOfJava.MethodsInJava;

public class sumOfValues {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int result = sum(a,b);

        System.out.println(result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
