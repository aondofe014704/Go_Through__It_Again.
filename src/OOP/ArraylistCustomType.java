package OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistCustomType {
    public static void main(String[] args) {
        User me = new User();
        me.setFirstName("Alex");
        me.setLastName("Smith");

        User you = new User();
        you.setFirstName("John");
        you.setLastName("Nunes");

        List<User> users = new ArrayList<>();
        users.add(you);
        users.add(me);
        System.out.println(users.get(0).fullName().toUpperCase());
    }
}
