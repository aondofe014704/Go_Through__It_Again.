package OOP;

import java.util.ArrayList;
import java.util.List;

public class CustomTypeInLoop {
    public static void main(String[] args) {
        String[] firstNames = {"Caleb", "Sub", "Sally", "Jamie"};
        String[] lastNames = {"Curry", "Scriber", "Smith", "Cal"};
        List<User> users = new ArrayList<>();
        for (int i = 0; i < firstNames.length; i++) {
            User user = new User();
            user.setFirstName(firstNames[i]);
            user.setLastName(lastNames[i]);
            users.add(user);
        }
        for (User user : users) {
            System.out.println(user.fullName());
        }

    }
}
