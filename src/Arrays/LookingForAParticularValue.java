package Arrays;

public class LookingForAParticularValue {
    public static void main(String[] args) {
        int[] grades = {1, 2, 3, 72};
        for (int i = 0; i < grades.length; i++){
            if(grades[i] == 72){
                System.out.println("FOUND at index " + i);
            }
        }

    }
}
