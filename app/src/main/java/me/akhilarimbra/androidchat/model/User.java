package me.akhilarimbra.androidchat.model;

/**
 * Created by akhilraj on 20/12/16.
 */

public class User {
    public String username;
    public String firstName;
    public String lastName;

    public User() {
        // Default constructor
    }

    public User(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
