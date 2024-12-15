package Arrays;

import java.util.Arrays;
import java.util.List;

public class FillWithStrings {
    public static void main(String[] args) {
        String[] values = new String[5];
        Arrays.fill(values, "");
        System.out.println(Arrays.toString(values));
        List<String> testing = Arrays.asList(values);
    }
}
