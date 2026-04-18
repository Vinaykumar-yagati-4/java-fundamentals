package com.java.fundamentals;

import java.util.Scanner;

public class SingleDigitNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        while(number >= 10){
             int sum = 0;
             while(number > 0){
                 sum = sum + (number % 10);
                 number = number / 10;
             }
             number = sum;
        }
        System.out.println("single digit number :" +number);
    }
}
