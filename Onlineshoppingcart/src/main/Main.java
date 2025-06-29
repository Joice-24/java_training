package main;

import model.User;
import service.UserService;
import ui.AdminInterface;
import ui.UserInterface;
import util.InputUtil;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        System.out.println("Welcome to Online Shopping Cart");
        System.out.println("----------------------------------");

        try {
            String email = InputUtil.getString("Enter Email: ");
            String password = InputUtil.getString("Enter Password: ");

            User user = userService.login(email, password);

            if (user == null) {
                System.out.println("Invalid login credentials.");
                return;
            }

            System.out.println("Login Successful! Welcome, " + user.getName());

            if ("ADMIN".equalsIgnoreCase(user.getRole())) {
                new AdminInterface().show(user);
            } else {
                new UserInterface().show(user);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Thank you for using Online Shopping Cart!");
    }
}
