package com.java.fundamentals;

import java.util.Scanner;

public class PrintOddNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        int number = 1;
        while (number <= range){
            if(number % 2 == 1)
                System.out.println(number);
            number++;
        }
    }
}
