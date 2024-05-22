package Entities;

public class User {
    private static int userCounter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    {
        id = ++userCounter;
    }
    public User(){

    }

    public User(int id, String firstName, String lastName, String password, String email) {
        this.id = id;
        userCounter--; // to keep sequential id
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() + "\t\t" +
        "First Name: " + this.getFirstName() + "\t\t" +
                "Last Name: " + this.getLastName() + "\t\t" +
                "Email: " + this.getEmail();
    }

    public void setFirstName(String firstName) {
        if(firstName.trim() == "" && firstName == null) {
            return;
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName.trim() == "" && lastName == null) {
            return;
        }
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        if(email.trim() == "" && email == null) {
            return;
        }
        this.email = email;
    }

    public void setPassword(String password) {
        if (password == null) {
            return;
        }
        this.password = password;
    }

    void clearState() {
        userCounter = 0;
    }
    public static void setCounter(int updatedCount) {
        userCounter = updatedCount;
    }
}
