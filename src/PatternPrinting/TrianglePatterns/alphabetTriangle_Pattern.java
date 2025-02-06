package PatternPrinting.TrianglePatterns;

public class alphabetTriangle_Pattern {

    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}

/*

A
A B
A B C
A B C D

* */
