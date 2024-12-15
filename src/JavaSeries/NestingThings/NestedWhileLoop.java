package JavaSeries.NestingThings;

public class NestedWhileLoop {
    public static void main(String[] args) {
        int g = 10;
        while (g >= 0) {
            int h = g;
            while (h >= 0) {
                System.out.print(h + " ");
                h--;
            }
            System.out.println();
            g--;
        }
    }

//        for (int i = 9; i >= 0; i--) {
//            for (int k = i; k >= 0; k--) {
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }
//    }
}
