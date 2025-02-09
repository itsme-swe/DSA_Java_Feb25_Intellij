package BasicsOfJava.MethodsInJava;

public class passByValue_Demo {

    static void changeValue(int a) {
        a *= 10;

        System.out.println("Value inside method " + a);
    }
    public static void main(String[] args) {

        int x = 10;

        System.out.println("Value before changing " + x);

        changeValue(x);

        System.out.println("Value after changing " + x);

    }
}
