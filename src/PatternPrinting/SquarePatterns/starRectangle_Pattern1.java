package PatternPrinting.SquarePatterns;

public class starRectangle_Pattern1 {

    public static void main(String[] args) {

        int rw = 4;
        int cl = 4;

        for (int i = 0; i < rw; i++) {
            for (int j = 0; j < cl ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

* * * * * *
* * * * * *
* * * * * *

*/