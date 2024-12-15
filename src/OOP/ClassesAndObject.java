package OOP;

public class ClassesAndObject {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Sewuese");
        user.setLastName("Songu");
//        System.out.println(user.firstName);
//        System.out.println(user.lastName);
        System.out.println(user.getFirstName() + " " + user.getLastName());
//        String message =  user.fullName();
//        System.out.println(message);
    }
}
