package com.revpay.main;

import java.util.Scanner;
import com.revpay.service.AuthService;

public class RevPayApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== REV PAY ====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    AuthService.register(sc);
                    break;
                case 2:
                    AuthService.login(sc);
                    break;
                case 3:
                    System.out.println("Thank you for using RevPay");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}

