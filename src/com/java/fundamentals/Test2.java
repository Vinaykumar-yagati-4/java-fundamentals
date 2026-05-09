package com.java.fundamentals;

import java.util.Scanner;

public class Test2 {
    //Reverse String
    static void main(String[] args) {
        String str = "Hello World";
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}

//Count vowels and Consonants
class Count{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine().toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }
        System.out.println("vowels :" +vowels);
        System.out.println("consonants :" +consonants);
        sc.close();
    }
}

//Factorial recursion
class FactorialRecursion{
    static long factorial(int n){
        if(n == 0 | n== 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the non-negative integer:");
        int number = sc.nextInt();
        if(number < 0){
            System.out.println("Factorial is not defined ");
        }else {
            long result = factorial(number);
            System.out.println("factorial of " +number+  " is :" +result);
        }
        sc.close();
    }
}
