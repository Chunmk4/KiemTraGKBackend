package com.example.thigk.bai5;

public class User {
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
    }

    public void register(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        System.out.println("Registration successful!");
    }

    public void logout() {
        System.out.println("Logged out!");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}



