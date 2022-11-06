package com.kodilla.good.patterns.challenges;


public class User {
    private String firstName;


    private String lastName;
    private int userID;

    public User(String firstName, String lastName, int userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getUserID() {
        return userID;
    }
}