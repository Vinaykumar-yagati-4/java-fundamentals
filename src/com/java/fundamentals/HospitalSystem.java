package com.java.fundamentals;

import java.util.Scanner;

public class HospitalSystem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bill Amount");
        long billAmount = sc.nextLong();
        System.out.println("Enter age");
        byte age = sc.nextByte();
        System.out.println("Enter the Card Type White-(W), Blue-(B), Yellow-(Y), Pink-(P), Arogyasri-(As), :");
        char cardType = sc.next().charAt(0);
        double discountAmount;
        double discountPercentage;
        double amountAfterDiscount;
        double centralTax;
        double stateTax;
        double finalAmount;

        if(cardType == 'W')
            discountPercentage = 5;
        else if (cardType == 'B')
            discountPercentage = 8;
        else if (cardType == 'P')
            discountPercentage = 50;
        else if (cardType == 'Y')
            discountPercentage = 55;
        else if (cardType == 'A')
            discountPercentage = 80;
        else
            discountPercentage = 0;

        if(age >= 65)
            discountPercentage += 20;
        else if (age <=65 &&  age >= 45)
            discountPercentage += 5;
        else if (age <= 20)
            discountPercentage += 10;
        else
            discountPercentage = 0;

        discountAmount = billAmount * discountPercentage / 100;
        amountAfterDiscount = billAmount - discountAmount ;
        centralTax = amountAfterDiscount * 4.5 / 100;
        stateTax = amountAfterDiscount * 4.5 /100;
        finalAmount = amountAfterDiscount + centralTax + stateTax;
        System.out.println("Bill amount : " +billAmount);
        System.out.println("Age : " +age);
        System.out.println("Card Type : " +cardType);
        System.out.println("Discount Amount : " +discountAmount);
        System.out.println("Amount After Discount : " + amountAfterDiscount);
        System.out.println("Central Tax : " +centralTax);
        System.out.println("State Tax : " +stateTax);
        System.out.println("Final Amount : " +finalAmount);

    }
}
