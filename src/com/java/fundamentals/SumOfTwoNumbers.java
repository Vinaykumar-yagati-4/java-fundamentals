package com.java.fundamentals;

import java.util.Scanner;

public class SumOfTwoNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        long firstNum = sc.nextLong();
        System.out.println("Enter the number2");
        long secondNum = sc.nextLong();
        long result = firstNum + secondNum;
        System.out.println("result : " +result);
        sc.close();
    }
}
