package com.java.fundamentals;

public class Operators {
    static void main(String[] args) {
        /*
             Assignment =
         */
        byte no1 = 100;
        byte no2;
        no2 = no1;
        System.out.println(no2);
        int res = 10 + (20 - 30) * 40 / 50 % 60;
        System.out.println(res);

        byte b1 = 100;
        byte b2 = 127;
         short res1 = (short) (b1 + b2);
        System.out.println(res1);

        int num1 = 1234567;
        int num2 = 2345678;
        int sum =  (num1+num2);
        System.out.println(sum);

        num1 = 10;
        num2 = 20;
        res = --num1 + num1++ - num2++ + --num2 - num2++ ;
        System.out.println(res);

        num1 = 100;
        num2 = 50;
        if(--num1 < 50 && num2++ > 50);
        System.out.println(--num1 < 50 &&    num2++ > 50);
        System.out.println(num1);
        System.out.println(num2);

        if(++num1 > 50 || --num2 < 100);
        System.out.println(++num1 > 50 || --num2 < 100);
        System.out.println(num1);
        System.out.println(num2);



    }
}
