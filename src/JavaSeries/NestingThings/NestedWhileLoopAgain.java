package JavaSeries.NestingThings;

public class NestedWhileLoopAgain {
    public static void main(String[] args) {
        int i = 20;
        while (i >= 0){
            int j = i;
            while (j >= 0){
                System.out.print("Mary" + i);
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
