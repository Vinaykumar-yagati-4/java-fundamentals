package com.java.fundamentals;

import java.util.Scanner;

public class InputTest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        byte age = sc.nextByte();
        System.out.println("Age : " + age);

        System.out.println("Enter marks");
        short marks = sc.nextShort();
        System.out.println("Marks : " + marks);

        System.out.println("Enter salary");
        int salary = sc.nextInt();
        System.out.println("Salary : " + salary);

        System.out.println("Enter Mobile");
        long mobile = sc.nextLong();
        System.out.println("Mobile : " + mobile);

        System.out.println("Enter Discount");
        float discount = sc.nextFloat();
        System.out.println("Discount : " + discount);

        System.out.println("Enter avg marks");
        double avgMarks = sc.nextDouble();
        System.out.println("Avg marks : " + avgMarks);

        System.out.println("Enter grade");
        char grade = sc.next().charAt(0);
        System.out.println("Grade : " + grade);

        System.out.println("Is Stock Avaialble true/false");
        boolean isStockAvailable = sc.nextBoolean();
        System.out.println("Is Stock Available : " + isStockAvailable);
        sc.close();
    }

}
