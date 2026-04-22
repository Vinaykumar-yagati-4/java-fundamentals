package com.java.fundamentals;

import java.util.Scanner;

public class CountEvenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long number = sc.nextInt();
        long evenCount = 0;
        long oddCount = 0;
        long digit;
        while(number > 0){
            digit = number % 10;
            if(number % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
            number = number / 10;
        }
        System.out.println("Even count number :"+evenCount);
        System.out.println("Odd count number :"+oddCount);
        sc.close();
    }
}
