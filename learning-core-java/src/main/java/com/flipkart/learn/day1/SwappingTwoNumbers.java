package com.flipkart.learn.day1;

import java.util.Scanner;

//Write a program to accept two numbers from the user and swap their values.
// (Example: x=12, y=15; after swapping x=15, y=12)
public class SwappingTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two values :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp;
        System.out.println("Before swapping num1 = " + num1 +" and " + " num2 = " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println( "After swapping  num1 = " + num1 +" and " + " num2 = " + num2);    }
}
