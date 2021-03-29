package com.example.loan_lending_app.model;

public class User {
    private String firstName;
    private String familyName;
    private String email;
    private String password;
    private String displayPicture;
    private String role;

    public User(String firstName, String familyName, String email, String password, String displayPicture,String  role) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.email = email;
        this.password = password;
        this.displayPicture = displayPicture;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayPicture() {
        return displayPicture;
    }

    public void setDisplayPicture(String displayPicture) {
        this.displayPicture = displayPicture;
    }
}
