package OOP;

public class User {
    private String firstName;
    private String lastName;
    public String fullName(){
            return "Hi, My Name is " +
                    firstName + " " + lastName + ".";
    }
    public String getFirstName(){
        return firstName.toUpperCase();
    }
    public String getLastName(){
        return lastName.toUpperCase();
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
