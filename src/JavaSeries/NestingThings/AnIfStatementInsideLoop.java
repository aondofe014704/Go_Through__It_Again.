package JavaSeries.NestingThings;

public class AnIfStatementInsideLoop {
    public static void main(String[] args) {
        boolean additionalLogging = false;
        for (int inside = 10; inside >= 0; inside--) {
            System.out.println(inside);
            if (inside == 5){
                if(additionalLogging == true){
                    System.out.println("We have found 5...");
                }

            }
        }
    }
}
