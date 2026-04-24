package com.java.fundamentals;

import java.util.Scanner;

public class SmallestDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int smallest = 9;
        int digit;
        while(number > 0){
            digit = number % 10;
            if(digit < smallest){
                smallest = digit;
            }
            number = number / 10;
        }
        System.out.println("Smallest digit :" +smallest);
    }
}
