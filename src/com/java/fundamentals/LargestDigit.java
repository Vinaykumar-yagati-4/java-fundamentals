package com.java.fundamentals;

import java.util.Scanner;

public class LargestDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int largest = 0;
        int digit;
        while(number > 0){
            digit = number % 10;
            if(digit > largest){
                largest = digit;
            }
            number = number / 10;
        }
        System.out.println("Largest digit :" +largest);
    }
}
