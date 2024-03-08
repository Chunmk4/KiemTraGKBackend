package com.example.thigk.bai5;

public class Main {
    public static void main(String[] args) {
        User user = new User("Chung", "chung@gmail.com", "password");
        user.register("chung", "chung@gmail.com", "password");

        Admin admin = new Admin("admin01", "admin@example.com", "admin123");
        admin.login("admin01", "admin123");
        admin.logout();

        Customer customer = new Customer("customer01", "customer@example.com", "customer123");
        customer.login("customer01", "customer123");
        customer.logout();

        Moderator moderator = new Moderator("moderator01", "moderator@example.com", "moderator123");
        moderator.login("moderator01", "moderator123");
    }
}