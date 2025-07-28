package MyShop.Enteties.impl;

import MyShop.Annotations.Validate;

public class DefaultUser {
    private static int userCounter = 0;

    private int id;

    @Validate(pattern = "[a-zA-Z]+")
    private String firstName;

    @Validate(pattern = "[a-zA-Z]+")
    private String lastName;

    private String password;

    @Validate(pattern = ".+@.+")
    private String email;

    {
        id = ++userCounter;
    }

    public DefaultUser() {
    }

    public DefaultUser(String firstName, String lastName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public DefaultUser(int id, String firstName, String lastName, String password, String email) {
        this.id = id;
        userCounter--; // to keep sequantial id
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

    @Override
    public String toString() {
        return "ID: " + this.getId() + "\t\t" +
                "First Name: " + this.getFirstName() + "\t\t" +
                "Last Name: " + this.getLastName() + "\t\t" +
                "Email: " + this.getEmail();
    }


    public void setPassword(String password) {
        if (password == null) {
            return;
        }
        this.password = password;
    }


    public void setEmail(String newEmail) {
        if (newEmail == null) {
            return;
        }
        this.email = newEmail;
    }


    public int getId() {
        return id;
    }

    void clearState() {
        userCounter = 0;
    }

    public static void setCounter(int updatedCount) {
        userCounter = updatedCount;
    }
}
