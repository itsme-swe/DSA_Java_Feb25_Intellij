package PatternPrinting.TrianglePatterns;

public class mixAlphaNumber_Patter5 {

    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                if (i % 2 == 0) {
                    System.out.print((char)(j+64) + " ");
                }else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

/*

1
A B
1 2 3
A B C D
1 2 3 4 5
A B C D E F

* */
