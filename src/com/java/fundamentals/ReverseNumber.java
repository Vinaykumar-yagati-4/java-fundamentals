package com.java.fundamentals;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int reverseNumber = 0;
        int digit;
        while(number > 0){
            digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number :" +reverseNumber);
    }
}
