package com.java.fundamentals;

import java.util.Scanner;

public class SumOfDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        long number = sc.nextLong();
        long sum = 0;
        long digit;
        while(number > 0){
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
            System.out.println(sum);
        }
        sc.close();
    }
}
