package JavaSeries.NestingThings;

public class NestedForLoopWithBreak {
    public static void main(String[] args) {
     for (int i = 9; i >= 0; i--) {
         for (int j = i; j >= 0; j--) {
             if (j == 6){
                 break;
             }
             System.out.print(j + " ");
         }
         if (i == 3){
             break;
         }
         System.out.println();
     }
     }
}
