package JavaSeries.Classes;

public class MySweetProgram {
    public static void main(String[] args) {
        User user = new User();
        user.firstName = "Sewuese";
        user.lastName = "Songu";
        User anotherUser = new User();
        anotherUser.firstName = "Mary";
        anotherUser.lastName = "Clark";
        System.out.println(user.getFullName());
        System.out.println(anotherUser.getFullName());
    }
}
