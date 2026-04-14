package com.java.fundamentals;

import java.util.Scanner;

public class PrintDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int digit;
        while(number > 0){
            digit = number % 10;
            System.out.println("Digits of a number :" +digit);
            number = number / 10;
        }
        sc.close();
    }
}
