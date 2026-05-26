package com.java.fundamentals;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int digit = 0;
        int sum = 0;
        int originalNumber = number;
        while(number > 0){
            sum = sum + digit ^ digit;
            number = number / 10;
        }
        if(sum == originalNumber){
            System.out.println("armstrong number");
        }else
            System.out.println("not armstrong number");

        sc.close();
    }
}
