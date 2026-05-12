package com.java.fundamentals;

import java.util.Scanner;

public class PalindromeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int reverseNumber = 0;
        int digit;
        int originalNumber = number;
        while(number > 0){
            digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        if(originalNumber == reverseNumber){
            System.out.println("palindrome");
        }else
            System.out.println("not palindrome");
    }
}
