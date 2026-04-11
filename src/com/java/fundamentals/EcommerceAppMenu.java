package com.java.fundamentals;

import java.util.Scanner;

public class EcommerceAppMenu {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Welcome To E-commerce App");
        System.out.println("-------------------------");
        System.out.println("Enter the Menu");
        System.out.println("1.Customer");
        System.out.println("2.Order");
        System.out.println("3.Product");
        System.out.println("4.Payment");
        System.out.println("5.Exit");
        System.out.println("Enter your Input(1-5)");
        int userOption = sc.nextInt();
        switch(userOption){
            case 1:
                System.out.println("Welcome to Customer section");
                System.out.println("1.signup");
                System.out.println("2.login");
                System.out.println("Enter your Input(1-2)");
                byte customerOption = sc.nextByte();
                switch (customerOption){
                    case 1:
                        System.out.println("customer signed up successfully");
                        break;
                    case 2:
                        System.out.println("customer logged in successfully");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;
            case 2:
                System.out.println("Welcome to Order section");
                System.out.println("1.New order");
                System.out.println("2.Existing Order");
                System.out.println("Enter your Input(1-2)");
                byte orderOption = sc.nextByte();
                switch (orderOption){
                    case 1:
                        System.out.println("New Order Placed successfully");
                        break;
                    case 2:
                        System.out.println("Existing Order Processed successfully");
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
                break;
            case 3:
                System.out.println("Welcome to Product section");
                System.out.println("1.Product added");
                System.out.println("2.Product updated");
                System.out.println("3.Product deleted");
                System.out.println("Enter your Input(1-3)");
                byte productOption = sc.nextByte();
                switch (productOption){
                    case 1:
                        System.out.println("Product added successfully");
                        break;
                    case 2:
                        System.out.println("Product updated successfully");
                        break;
                    case 3:
                        System.out.println("Product deleted successfully");
                        break;
                    default:
                        System.out.println("Invalid Option ");
                }
                break;
            case 4:
                System.out.println("Welcome to Payment section");
                System.out.println("1.Payment status");
                System.out.println("2.Payment Amount");
                System.out.println("Enter your Input(1-2)");
                byte paymentOption = sc.nextByte();
                switch (paymentOption){
                    case 1:
                        System.out.println("Payment success");
                        break;
                    case 2:
                        System.out.println("payment amount credited");
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
