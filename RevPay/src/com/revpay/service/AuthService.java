package com.revpay.service;

import java.util.*;

import com.revpay.model.User;
import com.revpay.model.Wallet;

public class AuthService {

	private static List<User> users = new ArrayList<User>();
	private static Map<Integer, Wallet> wallets = new HashMap<Integer, Wallet>();
    private static int userCounter = 1;

    public static void register(Scanner sc) {

        System.out.print("Full Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        System.out.print("User Type (PERSONAL/BUSINESS): ");
        String type = sc.nextLine().toUpperCase();

        User user = new User(userCounter, name, email, phone, password, type);
        users.add(user);

        wallets.put(userCounter, new Wallet(userCounter));

        System.out.println("Registration successful. User ID: " + userCounter);
        userCounter++;
    }

    public static void login(Scanner sc) {

        System.out.print("Email or Phone: ");
        String input = sc.nextLine();

        System.out.print("Password: ");
        String pwd = sc.nextLine();

        for (User u : users) {
            if ((u.getEmail().equals(input) || u.getPhone().equals(input))
                    && u.getPassword().equals(pwd)) {

                System.out.println("Login successful. Welcome " + u.getFullName());
                UserService.userMenu(sc, u, wallets.get(u.getUserId()));
                return;
            }
        }
        System.out.println("Invalid credentials");
    }
}
