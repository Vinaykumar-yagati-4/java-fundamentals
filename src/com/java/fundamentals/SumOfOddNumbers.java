package com.java.fundamentals;

import java.util.Scanner;

public class SumOfOddNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int sum = 0;
        for( int i = 0; i <= number; i++){
            if(i % 2 == 1){
                sum = sum + i;
            }
        }
        System.out.println("sum of odd numbers :" +sum);
        sc.close();
    }
}
