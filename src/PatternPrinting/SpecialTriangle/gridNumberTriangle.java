package PatternPrinting.SpecialTriangle;

public class gridNumberTriangle {

    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }
    }
}
