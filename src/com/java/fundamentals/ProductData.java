package com.java.fundamentals;

import java.util.Scanner;

public class ProductData {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Product Name");
        String productName = sc.nextLine();
        System.out.println("Enter Discount Percentage ");
        byte discountPercentage = sc.nextByte();
        System.out.println("Enter Manufactured Year");
        short manufacturedYear = sc.nextShort();
        System.out.println("Enter Max Retail Price");
        int maxRetailprice = sc.nextInt();
        System.out.println("Total Order value");
        long totalOrderValue = sc.nextLong();
        System.out.println("Enter Average Rating");
        float averageRating = sc.nextFloat();
        System.out.println("Enter Average Price");
        double averagePrice = sc.nextDouble();
        System.out.println("Enter Membership");
        char membership = sc.next().charAt(0);
        System.out.println("Is Product Available");
        boolean isProductAvailable = sc.nextBoolean();
        System.out.println("Product name : " +productName);
        System.out.println("Discount Percentage : " +discountPercentage);
        System.out.println("Manufactured year : "+manufacturedYear);
        System.out.println("Max Retail Price : " +maxRetailprice);
        System.out.println("Total Order Value : " +totalOrderValue);
        System.out.println("Average Rating : " +averageRating);
        System.out.println("Average Price : " +averagePrice);
        System.out.println("Membership : " +membership);
        System.out.println("Is Product Available : " +isProductAvailable);
        sc.close();
    }
}
