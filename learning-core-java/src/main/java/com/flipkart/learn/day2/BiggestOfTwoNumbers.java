package com.flipkart.learn.day2;

import java.util.Scanner;

//Write a program to accept two numbers from the user and find the bigger of the two
public class BiggestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("Enter another number");
        int num2 = sc.nextInt();
if(num1>num2)
    System.out.println("Biggest of two numbers is : " +num1);
else
    System.out.println("Biggest is : " + num2);

    }
}
