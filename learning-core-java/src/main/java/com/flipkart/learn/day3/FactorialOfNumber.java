package com.flipkart.learn.day3;

import java.util.Scanner;

//Write a program to accept a number and find the factorial of the number.
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= num;i++)
        {
            fact = fact * i;
        }
        System.out.println("The factoriaL of the number you entered is : "+fact);
    }
}
