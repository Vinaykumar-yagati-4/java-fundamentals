package com.java.fundamentals;

import java.util.Scanner;

public class PrintNaturalNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 1;i <= number;i++){
            sum += i;
            System.out.println("sum = " +sum);
        }
    }
}
