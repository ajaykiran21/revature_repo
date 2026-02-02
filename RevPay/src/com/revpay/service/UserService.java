package com.revpay.service;

import java.util.Scanner;
import com.revpay.model.User;
import com.revpay.model.Wallet;

public class UserService {

    public static void userMenu(Scanner sc, User user, Wallet wallet) {

        while (true) {
            System.out.println("\n--- USER MENU ---");
            System.out.println("1. Add Money");
            System.out.println("2. View Balance");
            System.out.println("3. Logout");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    wallet.addMoney(amt);
                    System.out.println("Money added successfully");
                    break;

                case 2:
                    System.out.println("Wallet Balance: " + wallet.getBalance());
                    break;

                case 3:
                    System.out.println("Logged out");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
